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
import com.imti.model.TenderContractInfo;
import com.imti.service.TenderContractInfoService;
import net.sf.json.JSONObject;

/**@文件名: TenderContractInfoController.java
 * @类功能说明: 投标管理Controller层
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月13日下午5:41:29
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月13日下午5:41:29</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("tenderContract")
public class TenderContractInfoController {
	@Autowired
	private TenderContractInfoService tenderContractInfoService;
	/**
	 * @方法名: findtenderContractInfo
	 * @方法说明: 投标管理所有信息查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月13日下午5:57:49
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findtenderContractInfo")
	@ResponseBody
	public Map<String,Object> findtenderContractInfo(String td_names,int page,int rows){
		Map<String,Object> map=new HashMap<String,Object>();
		PageBean pageBean=new PageBean(page,rows);
		map.put("td_names",td_names);
		map.put("pageBean",pageBean);
		int total=tenderContractInfoService.findTenderContractInfoCount(map);
		List<TenderContractInfo> tenderContractList=tenderContractInfoService.findtenderContractInfo(map);
		Map<String,Object> resulMap=new HashMap<String,Object>();
		resulMap.put("rows", tenderContractList);
		resulMap.put("total",total);
		return resulMap;
		
	}
	/**
	 * @方法名: newtenderContractInfoInfo
	 * @方法说明: 投标管新增数据
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月13日下午11:11:40
	 * @param req
	 * @param tenderContractInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/newtenderContractInfo")
	@ResponseBody
	public JSONObject newtenderContractInfoInfo(HttpServletRequest req,TenderContractInfo tenderContractInfo){
		HttpSession session=req.getSession();
		EmployeeInfo sessionEmployeeInfo=(EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		JSONObject jsonObject=new JSONObject();
		EmployeeInfo employeeInfo=new EmployeeInfo();
		employeeInfo.setEm_opt_id(sessionEmployeeInfo.getEm_id());
		int result=tenderContractInfoService.newtenderContractInfoInfo(employeeInfo,tenderContractInfo);
		if(result>0){
			jsonObject.put("msg",true);
		}else{
			jsonObject.put("msg",false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: updatetenderContract
	 * @方法说明: 投标管理修改数据
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月14日下午12:55:43
	 * @param tenderContractInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updatetenderContract")
	@ResponseBody
	public JSONObject updatetenderContract(TenderContractInfo tenderContractInfo){
		JSONObject jsonObject=new JSONObject();
		int result=tenderContractInfoService.updatetenderContract(tenderContractInfo);
		if(result>0){
			jsonObject.put("msg",true);
		}else{
			jsonObject.put("msg",false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: deleteTenderContract
	 * @方法说明: 投标管理删除数据
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月14日下午4:52:32
	 * @param td_idss
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteTenderContract")
	@ResponseBody
	public JSONObject deleteTenderContract(String td_idss){
		int result=tenderContractInfoService.deleteTenderContract(td_idss);
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