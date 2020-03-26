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

/**@�ļ���: MaterialsManageController.java
 * @�๦��˵��: ���ʹ���controller��
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��17������9:33:32
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��17������9:33:32</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Controller
@RequestMapping("/MaterialsManageInfo")
public class MaterialsManageController {
	@Autowired
	private MaterialsManageService materialsManageService;
	/**
	 * @������: findMaterialsManageInfo
	 * @����˵��: ���ʹ����ѯ������Ϣ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��17������9:36:05
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
	 * @������: newMaterialsManageInfo
	 * @����˵��: ���ʹ�������
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��17������11:35:23
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
	 * @������: newMaterialsManageInfo
	 * @����˵��: ���ʹ����޸�
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��17������11:35:57
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
