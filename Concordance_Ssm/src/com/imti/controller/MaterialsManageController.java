package com.imti.controller;

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
import com.imti.model.MaterialsManage;
import com.imti.model.PageBean;
import com.imti.service.MaterialsManageService;

import net.sf.json.JSONObject;

/**@文件名: MaterialsManageController.java
 * @类功能说明: 物资管理controller层
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月17日上午9:33:32
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月17日上午9:33:32</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("/MaterialsManageInfo")
public class MaterialsManageController {
	@Autowired
	private MaterialsManageService materialsManageService;
	/**
	 * @方法名: findMaterialsManageInfo
	 * @方法说明: 物资管理查询所有信息
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月17日上午9:36:05
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findMaterialsManageInfo")
	@ResponseBody
	public Map<String,Object> findMaterialsManageInfo(String mm_name,Integer page,Integer rows){
		Map<String,Object> map=new HashMap<String,Object>();
		PageBean pageBean=new PageBean(page,rows);
		map.put("mm_namess",mm_name);
		map.put("pageBean",pageBean);
		int total=materialsManageService.findMaterialsManageInfoCount(map);
		List<MaterialsManage> materialsManageList=materialsManageService.findMaterialsManageInfo(map);
		Map<String,Object> resulMap=new HashMap<String,Object>();
		resulMap.put("rows", materialsManageList);
		resulMap.put("total",total);
		return resulMap;
	}
	/**
	 * @方法名: newMaterialsManageInfo
	 * @方法说明: 物资管理新增
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月17日上午11:35:23
	 * @param req
	 * @param materialsManage
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/newMaterialsManageInfo")
	@ResponseBody
	public JSONObject newMaterialsManageInfo(HttpServletRequest req,MaterialsManage materialsManage){
		HttpSession session=req.getSession();
		EmployeeInfo sessionEmployeeInfo=(EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		int result=materialsManageService.newMaterialsManageInfo(materialsManage,sessionEmployeeInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: newMaterialsManageInfo
	 * @方法说明: 物资管理修改
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月17日上午11:35:57
	 * @param req
	 * @param materialsManage
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updateMaterialsManageInfo")
	@ResponseBody
	public JSONObject updateMaterialsManageInfo(MaterialsManage materialsManage){
		int result=materialsManageService.updateMaterialsManageInfo(materialsManage);
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	@RequestMapping("/deleteMaterialsManageInfo")
	@ResponseBody
	public JSONObject deleteMaterialsManageInfo(String mm_idss){
		int result=materialsManageService.deleteMaterialsManageInfo(mm_idss);
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
