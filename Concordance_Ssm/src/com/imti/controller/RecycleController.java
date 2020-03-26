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
import com.imti.model.Recycle;
import com.imti.model.Recycleemployeeinfo;
import com.imti.model.Recyclematerials;
import com.imti.model.WorkBookInfo;
import com.imti.service.RecycleService;

import net.sf.json.JSONObject;

/**
 * @文件名: RecycleController.java
 * @类功能说明: 回收站信息控制层
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月16日上午9:57:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月16日上午9:57:52</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("recycle")
public class RecycleController {
	/**
	 * 注入回收站service接口
	 */
	@Autowired
	private RecycleService recycleService;
	/**
	 * @方法名: findAllRecycle
	 * @方法说明: 查找所有的回收站信息用于展示
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月16日上午10:14:02
	 * @param r_recycleName
	 * @param page
	 * @param rows
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllRecycle")
	@ResponseBody
	public Map<String,Object> findAllRecycle(String r_recycleName,int page,int rows){
		Map<String,Object> map = new HashMap<String,Object>();
		PageBean pageBean = new PageBean(page,rows);
		map.put("r_recycleName", r_recycleName);
		map.put("pageBean", pageBean);
		List<Recycle> recycleList = recycleService.findAllRecycle(map);
		int total = recycleService.findAllRecycleCount(map);
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("rows", recycleList);
		result.put("total", total);
		return result;
	}
	/**
	 * @方法名: addRecycleInfo
	 * @方法说明: 添加回收站管理的主从表信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日上午8:38:44
	 * @param recycle
	 * @param request
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/addRecycleInfo")
	@ResponseBody
	public JSONObject addRecycleInfo(@RequestBody Recycle recycle,HttpServletRequest request){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployee = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		JSONObject jsonObject = new JSONObject();
		
		int result = recycleService.addRecycleInfo(recycle,sessionEmployee);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: findAllNameByMaterials
	 * @方法说明: 查找所有回收站信息的下拉列表
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午5:03:47
	 * @return
	 * @return: List<Recyclematerials>
	 */
	@RequestMapping("/findAllNameByRecycle")
	@ResponseBody
	public List<Recyclematerials> findAllNameByRecycle(){
		List<Recyclematerials> recycleList = recycleService.findAllNameByRecycle();
		return recycleList;
	}
	/**
	 * @方法名: deleteRecycleInfo
	 * @方法说明: 删除主表信息的控制层方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午4:02:49
	 * @param re_id
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteRecycleInfo")
	@ResponseBody
	public JSONObject deleteRecycleInfo(int re_id){
		JSONObject jsonObject = new JSONObject();
		int result = recycleService.deleteRecycleInfo(re_id);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: updateRecycleInfo
	 * @方法说明: 修改回收站信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日上午8:35:25
	 * @param recycle
	 * @param request
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updateRecycleInfo")
	@ResponseBody
	public JSONObject updateRecycleInfo(@RequestBody Recycle recycle,HttpServletRequest request){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployee = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		JSONObject jsonObject = new JSONObject();
		int result = recycleService.updateRecycleInfo(recycle,sessionEmployee);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
}
