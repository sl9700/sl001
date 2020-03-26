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
 * @�ļ���: EmployeeInfoController.java
 * @�๦��˵��: Ա����Ϣ����Ŀ��Ʋ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��2������8:45:43
 * @�޸�˵��:<br>
 * 
 *            <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��2������8:45:43</li> 
 *	 <li>����: </li>
 *            </pre>
 */
@Controller
@RequestMapping("employeeInfo")
public class EmployeeInfoController {
	/**
	 * ��service�ӿڵ�����Ʋ�
	 */
	@Autowired
	private EmployeeInfoService employeeInfoService;
	/**
	 * @������: login
	 * @����˵��: �û���½���������������棩
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:32:18
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
				/* ˳��̶���Ȼˢ����ҳ��ͻ����ȥif���� */
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
	 * @������: findAllEmployeeInfo
	 * @����˵��: �û���Ϣ�Ĳ������ҳ��Ա������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:33:46
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
	 * @������: deleteEmployeeInfo
	 * @����˵��: �û���Ϣ��ɾ���������Ʋ㣨Ա������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:35:01
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
	 * @������: emAccountIsExist
	 * @����˵��: ����ʱ����ƿ��ж��û����Ƿ���ڷ�����Ա������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:36:48
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
	 * @������: saveEmployeeInfo
	 * @����˵��: Ա����Ϣ���������޸�ʱ�ı��水ťcontroller
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:38:26
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
	 * @������: updateEmployeeInfo
	 * @����˵��: �޸�Ա����Ϣ�Ŀ��Ʋ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:39:54
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
	 * @������: logout
	 * @����˵��: �����������˳���½����
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:40:33
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
	 * @������: findAllNameByEmp
	 * @����˵��: ��ѯ�������������(�ڲ���Ա)�������������ѡ��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������2:13:40
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
