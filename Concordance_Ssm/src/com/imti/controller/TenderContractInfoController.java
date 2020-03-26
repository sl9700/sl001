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

/**@�ļ���: TenderContractInfoController.java
 * @�๦��˵��: Ͷ�����Controller��
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��13������5:41:29
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��13������5:41:29</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Controller
@RequestMapping("tenderContract")
public class TenderContractInfoController {
	@Autowired
	private TenderContractInfoService tenderContractInfoService;
	/**
	 * @������: findtenderContractInfo
	 * @����˵��: Ͷ�����������Ϣ��ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��13������5:57:49
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
	 * @������: newtenderContractInfoInfo
	 * @����˵��: Ͷ�����������
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��13������11:11:40
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
	 * @������: updatetenderContract
	 * @����˵��: Ͷ������޸�����
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��14������12:55:43
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
	 * @������: deleteTenderContract
	 * @����˵��: Ͷ�����ɾ������
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��14������4:52:32
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