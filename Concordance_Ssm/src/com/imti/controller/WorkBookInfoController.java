package com.imti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.EmployeeInfo;
import com.imti.model.PageBean;
import com.imti.model.WorkBookInfo;
import com.imti.service.WorkBookInfoService;

import net.sf.json.JSONObject;

/**
 * @文件名: WorkBookInfoController.java
 * @类功能说明: 数据菜单的控制层controller层
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月9日下午5:52:27
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月9日下午5:52:27</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("workBook")
public class WorkBookInfoController {
	/**
	 * 将数据菜单的Service接口注入ioc
	 */
	@Autowired
	private WorkBookInfoService workBookInfoService;
	/**
	 * @方法名: findAllworkBook
	 * @方法说明: 查找所有数据字典的主表用于显示
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午5:57:19
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllworkBook")
	@ResponseBody
	public Map<String,Object> findAllworkBook(String searchValue,int page,int rows){
		Map<String,Object> map = new HashMap<String,Object>();
		PageBean pageBean = new PageBean(page,rows);
		map.put("searchValue", searchValue);
		map.put("pageBean", pageBean);
		List<WorkBookInfo> wbdList = workBookInfoService.findAllworkBook(map);
		int total = workBookInfoService.findAllworkBookCount(map);
		Map<String,Object> resultmap = new HashMap<String,Object>();
		resultmap.put("total", total);
		resultmap.put("rows", wbdList);
		return resultmap;
	}
	/**
	 * @方法名: addWorkBookInfo
	 * @方法说明: 添加数据字典方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:55:13
	 * @param workBookInfo
	 * @param request
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/addWorkBookInfo")
	@ResponseBody
	public JSONObject addWorkBookInfo(@RequestBody WorkBookInfo workBookInfo,HttpServletRequest request){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployee = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		JSONObject jsonObject = new JSONObject();
		int result = workBookInfoService.addWorkBookInfo(workBookInfo,sessionEmployee);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: deleteWorkBookInfo
	 * @方法说明: 删除数据字典中的数据方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:55:35
	 * @param wb_id
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteWorkBookInfo")
	@ResponseBody
	public JSONObject deleteWorkBookInfo(int wb_id){
		JSONObject jsonObject = new JSONObject();
		int result = workBookInfoService.deleteWorkBookInfo(wb_id);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: updateWorkBookInfo
	 * @方法说明: 修改主按钮所触发的事件与js数据交互
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月12日下午2:25:12
	 * @param workBookInfo
	 * @param request
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updateWorkBookInfo")
	@ResponseBody
	public JSONObject updateWorkBookInfo(@RequestBody WorkBookInfo workBookInfo,HttpServletRequest request){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployee = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		JSONObject jsonObject = new JSONObject();
		int result = workBookInfoService.updateWorkBookInfo(workBookInfo,sessionEmployee);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
}
