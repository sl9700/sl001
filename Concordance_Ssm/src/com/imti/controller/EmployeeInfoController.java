package com.imti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.EmployeeInfo;
import com.imti.model.PageBean;
import com.imti.model.Recycleemployeeinfo;
import com.imti.model.Recyclematerials;
import com.imti.service.EmployeeInfoService;

import net.sf.json.JSONObject;

/**
 * @文件名: EmployeeInfoController.java
 * @类功能说明: 员工信息管理的控制层
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月2日下午8:45:43
 * @修改说明:<br>
 * 
 *            <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月2日下午8:45:43</li> 
 *	 <li>内容: </li>
 *            </pre>
 */
@Controller
@RequestMapping("employeeInfo")
public class EmployeeInfoController {
	/**
	 * 将service接口导入控制层
	 */
	@Autowired
	private EmployeeInfoService employeeInfoService;
	/**
	 * @方法名: login
	 * @方法说明: 用户登陆方法（进入主界面）
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:32:18
	 * @param request
	 * @param response
	 * @param employeeInfo
	 * @param yzmCode
	 * @return
	 * @return: String
	 */
	@RequestMapping("/login.action")
	public String login(HttpServletRequest request, HttpServletResponse response, EmployeeInfo employeeInfo,@RequestParam(value = "yzm",required = false)String yzmCode) {
		EmployeeInfo resultEmployeeInfo = null;
		HttpSession session = request.getSession();
		String sRand = (String)session.getAttribute("sRand");
		EmployeeInfo sessionEmployeeInfo = (EmployeeInfo)session.getAttribute("crurentEmployeeInfo");
		if (sessionEmployeeInfo != null) {
			return "main";
		} else {
			if(sRand == null){
				return "redirect:../login.jsp";
			}else {
				/* 顺序固定不然刷新主页面就会进不去if条件 */
				if(sRand.equals(yzmCode)){
					resultEmployeeInfo = employeeInfoService.login(employeeInfo);
					if (resultEmployeeInfo != null) {
						session.setAttribute("crurentEmployeeInfo", resultEmployeeInfo);
						return "main";
					}else{
						return "redirect:../login.jsp?error=1&em_account="+employeeInfo.getEm_account()+"&em_password="+employeeInfo.getEm_password()+"&yzm"+yzmCode;
					}
				}else{
					return "redirect:../login.jsp?error=2&em_account="+employeeInfo.getEm_account()+"&em_password="+employeeInfo.getEm_password()+"&yzm"+yzmCode;
				}
			}
		}
	}
	/**
	 * @方法名: findAllEmployeeInfo
	 * @方法说明: 用户信息的查找与分页（员工管理）
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:33:46
	 * @param request
	 * @param searchByName
	 * @param page
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllEmployeeInfo")
	@ResponseBody
	public Map<String,Object> findAllEmployeeInfo(HttpServletRequest request,String searchByName,@RequestParam(value="page",required=false) String page){
		String rows = request.getParameter("rows");
		Map<String,Object> map = new HashMap<String,Object>();
		PageBean pageBean = new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		map.put("searchByName", searchByName);
		map.put("pageBean", pageBean);
		int total = employeeInfoService.findAllEmployeeInfoCount(map);
		List<EmployeeInfo> employeeInfoList = employeeInfoService.findAllEmployeeInfo(map);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("rows", employeeInfoList);
		resultMap.put("total", total);
		return resultMap;
	}
	/**
	 * @方法名: deleteEmployeeInfo
	 * @方法说明: 用户信息的删除方法控制层（员工管理）
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:35:01
	 * @param em_idss
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteEmployeeInfo")
	@ResponseBody
	public JSONObject deleteEmployeeInfo(String em_idss){
		/*Map<String,Object> map = new HashMap<String,Object>();*/
		int result = employeeInfoService.deleteEmployeeInfoById(em_idss);
		JSONObject jsonObject = new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
			jsonObject.put("count", result);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: emAccountIsExist
	 * @方法说明: 新增时光标移开判断用户名是否存在方法（员工管理）
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:36:48
	 * @param em_account
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/emAccountIsExist")
	@ResponseBody
	public JSONObject emAccountIsExist(String em_account){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("em_account", em_account);
		JSONObject jsonObject = new JSONObject();
		int result = employeeInfoService.emAccountIsExist(map);
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: saveEmployeeInfo
	 * @方法说明: 员工信息的新增与修改时的保存按钮controller
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:38:26
	 * @param request
	 * @param employeeInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/saveEmployeeInfo")
	@ResponseBody
	public JSONObject saveEmployeeInfo(HttpServletRequest request,EmployeeInfo employeeInfo){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployeeInfo = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		employeeInfo.setEm_opt_id(sessionEmployeeInfo.getEm_id());
		JSONObject jsonObject = new JSONObject();
		int result = employeeInfoService.saveEmployeeInfo(employeeInfo);
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: updateEmployeeInfo
	 * @方法说明: 修改员工信息的控制层
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:39:54
	 * @param employeeInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updateEmployeeInfo")
	@ResponseBody
	public JSONObject updateEmployeeInfo(EmployeeInfo employeeInfo){
		JSONObject jsonObject = new JSONObject();
		int result = employeeInfoService.updateEmployeeInfo(employeeInfo);
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: logout
	 * @方法说明: 点击主界面的退出登陆方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:40:33
	 * @param request
	 * @return
	 * @return: String
	 */
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.removeAttribute("crurentEmployeeInfo");
		return "redirect:../login.jsp";
	}
	
	/**
	 * @方法名: findAllNameByEmp
	 * @方法说明: 查询外键关联的名字(内部人员)，用于下拉框的选择
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午2:13:40
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllNameByEmp")
	@ResponseBody
	public List<Recycleemployeeinfo> findAllNameByEmp(){
		List<Recycleemployeeinfo> empList = employeeInfoService.findAllNameByRemId();
		return empList;
	}
	
}
