package com.imti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.Community;
import com.imti.model.CommunityInfoDetail;
import com.imti.model.PageBean;
import com.imti.service.CommunityInfoDetailInfoService;

import net.sf.json.JSONObject;

/**@文件名: CommunityInfoDetailController.java
 * @类功能说明: 小区信息Controller层
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月18日上午10:01:12
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月18日上午10:01:12</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@RequestMapping("CommunityInfoDetail")
@Controller
public class CommunityInfoDetailController {
	@Autowired
	private CommunityInfoDetailInfoService communityInfoService;
	/**
	 * @方法名: findAllCommunityInfoDetail
	 * @方法说明: 小区信息查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午3:08:49
	 * @param page
	 * @param rows
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllCommunityInfoDetail")
	@ResponseBody
	public Map<String,Object> findAllCommunityInfoDetail(int page,int rows){
		Map<String,Object> map=new HashMap<String,Object>();
		PageBean pageBean=new PageBean(page,rows);
		map.put("pageBean",pageBean);
		List<CommunityInfoDetail> CommunityList= communityInfoService.CommunityInfoDetail(map);
		int total=communityInfoService.findAllCommunityInfoDetailCount();
		Map<String,Object> resulMap=new HashMap<String, Object>();
		resulMap.put("total",total);
		resulMap.put("rows", CommunityList);
		return resulMap;
	}
	/**
	 * @方法名: updateCommunityInfoDetail
	 * @方法说明: 小区信息修改
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午3:09:25
	 * @param communityInfoDetail
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("updateCommunityInfoDetail")
	@ResponseBody
	public JSONObject updateCommunityInfoDetail(CommunityInfoDetail communityInfoDetail){
		JSONObject jsonObject=new JSONObject();
		int result=communityInfoService.updateCommunityInfoDetail(communityInfoDetail);
		if(result>0){
			jsonObject.put("msg",true);
		}else{
			jsonObject.put("msg",false);
		}
		return jsonObject;
	}
	@RequestMapping("/deleteCommunityInfoDetail")
	@ResponseBody
	public JSONObject deleteCommunityInfoDetail(String cd_idss){
		JSONObject jsonObject=new JSONObject();
		int result=communityInfoService.deleteCommunityInfoDetail(cd_idss);
		if(result>0){
			jsonObject.put("msg",true);
			jsonObject.put("conut", result);
		}else{
			jsonObject.put("msg",false);
		}
		return jsonObject;
	}
}