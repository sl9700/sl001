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

import com.imti.model.Community;
import com.imti.model.EmployeeInfo;
import com.imti.model.PageBean;
import com.imti.service.CommunityService;

import net.sf.json.JSONObject;

/**@文件名: CommunityController.java
 * @类功能说明: 试点小区信息Controller层
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月14日上午8:52:47
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月14日上午8:52:47</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("community")
public class CommunityController {
	@Autowired
	private CommunityService communityService;
	/**
	 * @方法名: findAllCommunity
	 * @方法说明: 试点小区信息查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月14日上午8:59:42
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllCommunity")
	@ResponseBody
	public Map<String,Object> findAllCommunity(int page,int rows){
		Map<String,Object> map=new HashMap<String,Object>();
		PageBean pageBean=new PageBean(page,rows);
		map.put("pageBean",pageBean);
		List<Community> CommunityList= communityService.findAllCommunity(map);
		int total=communityService.findAllCommunityCount(map);
		Map<String,Object> resulMap=new HashMap<String, Object>();
		resulMap.put("total",total);
		resulMap.put("rows", CommunityList);
		return resulMap;
	}
	/**
	 * @方法名: newCommunityInfo
	 * @方法说明: 试点小区新增
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午9:35:25
	 * @param req
	 * @param community
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/newCommunityInfo")
	@ResponseBody
	public JSONObject newCommunityInfo(HttpServletRequest req,Community community){
		HttpSession session=req.getSession();
		EmployeeInfo sessionEmployeeInfo=(EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		JSONObject jsonObject=new JSONObject();
		community.setCo_opt_id(sessionEmployeeInfo.getEm_id());
		int result=communityService.newCommunityInfo(community);
		if(result>0){
			jsonObject.put("msg",true);
		}else{
			jsonObject.put("msg",false);
		}
		return jsonObject;
	}
	
	@RequestMapping("/updateCommunityInfo")
	@ResponseBody
	public JSONObject updateCommunityInfo(Community community){
		JSONObject jsonObject=new JSONObject();
		int result=communityService.updateCommunityInfo(community);
		if(result>0){
			jsonObject.put("msg",true);
		}else{
			jsonObject.put("msg",false);
		}
		return jsonObject;
	}
	
	@RequestMapping("/deleteCommunityInfo")
	@ResponseBody
	public JSONObject deleteCommunityInfo(String co_idss){
		JSONObject jsonObject=new JSONObject();
		int result=communityService.deleteCommunityInfo(co_idss);
		if(result>0){
			jsonObject.put("msg",true);
			jsonObject.put("conut", result);
		}else{
			jsonObject.put("msg",false);
		}
		return jsonObject;
	}
}