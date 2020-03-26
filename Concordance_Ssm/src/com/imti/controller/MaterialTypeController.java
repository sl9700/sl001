package com.imti.controller;
/**@文件名: MaterialTypeController.java
 * @类功能说明: 物资管理Controller层
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月15日下午1:53:12
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月15日下午1:53:12</li> 
 *	 <li>内容: </li>
 * </pre>
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.EmployeeInfo;
import com.imti.model.MaterialType;
import com.imti.model.PageBean;
import com.imti.service.MaterialTypeService;
import net.sf.json.JSONObject;
@Controller
@RequestMapping("materialType")
public class MaterialTypeController {
	@Autowired
	private MaterialTypeService materialTypeService;
	/**
	 * @方法名: findAllmaterialType
	 * @方法说明: 物资管理查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月15日下午1:59:50
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllmaterialType")
	@ResponseBody
	public Map<String,Object> findAllmaterialType(String searchValue,int page,int rows){
		Map<String,Object> map=new HashMap<String,Object>();
		PageBean pageBean=new PageBean(page,rows);
		map.put("pageBean",pageBean);
		map.put("searchValue",searchValue);
		List<MaterialType> MaManageList=materialTypeService.findAllmaterialType(map);
		int total=materialTypeService.findAllmaterialTypeCount(map);
		Map<String,Object> resultMap=new HashMap<String,Object>();
		resultMap.put("total", total);
		resultMap.put("rows", MaManageList);
		return resultMap;
	}
	/**
	 * @方法名: newmaterialTypeInfo
	 * @方法说明: 物资管理新增
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月16日上午11:36:49
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/newmaterialTypeInfo")
	@ResponseBody
	public JSONObject newmaterialTypeInfo(MaterialType materialType,HttpServletRequest req){
		HttpSession session=req.getSession();
		EmployeeInfo sessionemployeeInfo=(EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		int result=materialTypeService.newmaterialTypeInfo(materialType,sessionemployeeInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	@RequestMapping("/updatematerialType")
	@ResponseBody
	public JSONObject updatematerialType(MaterialType materialType){
		int result=materialTypeService.updatematerialType(materialType);
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	@RequestMapping("/deletematerialTypeInfo")
	@ResponseBody
	public JSONObject deletematerialTypeInfo(String mt_idss){
		int result=materialTypeService.deletematerialTypeInfo(mt_idss);
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
			jsonObject.put("conut", result);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
}