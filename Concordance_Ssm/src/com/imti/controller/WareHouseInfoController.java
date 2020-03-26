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
import com.imti.model.PageBean;
import com.imti.model.Productinfo;
import com.imti.service.WareHouseInfoService;

import net.sf.json.JSONObject;

/**
 * @�ļ���: WareHouseInfoController.java
 * @�๦��˵��: ����վ��������Ŀ��Ʋ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��18������6:45:15
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��18������6:45:15</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Controller
@RequestMapping("wareHouseInfo")
public class WareHouseInfoController {
	/**
	 * �������վ������Service�ӿ�
	 */
	@Autowired
	private WareHouseInfoService wareHouseInfoService;
	/**
	 * @������: findAllWareHouseInfo
	 * @����˵��: �ҵ����еĻ���վ�������Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������6:57:08
	 * @param searchByName
	 * @param page
	 * @param rows
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllWareHouseInfo")
	@ResponseBody
	public Map<String,Object> findAllWareHouseInfo(String searchByName,int page,int rows){
		Map<String,Object> map = new HashMap<String,Object>();
		PageBean pageBean = new PageBean(page,rows);
		map.put("searchByName", searchByName);
		map.put("pageBean", pageBean);
		List<Productinfo> proList = wareHouseInfoService.findAllWareHouseInfo(map);
		int total = wareHouseInfoService.findAllWareHouseInfoCount(map);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("total", total);
		resultMap.put("rows", proList);
		return resultMap;
	}
	/**
	 * @������: addWareHouseInfo
	 * @����˵��: ���������Ϣ�Ŀ��Ʋ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������9:29:51
	 * @param request
	 * @param productinfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/addWareHouseInfo")
	@ResponseBody
	public JSONObject addWareHouseInfo(HttpServletRequest request,Productinfo productinfo){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployeeInfo = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		productinfo.setPr_opt_id(sessionEmployeeInfo.getEm_id());
		JSONObject jsonObject = new JSONObject();
		int result = wareHouseInfoService.addWareHouseInfo(productinfo);
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @������: updateWareHouseInfo
	 * @����˵��: �޸Ļ���վ�������Ϣ�Ŀ��Ʋ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������9:34:46
	 * @param productinfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updateWareHouseInfo")
	@ResponseBody
	public JSONObject updateWareHouseInfo(Productinfo productinfo){
		JSONObject jsonObject = new JSONObject();
		int result = wareHouseInfoService.updateWareHouseInfo(productinfo);
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @������: deleteWareHouseInfo
	 * @����˵��: ɾ������վ�����Ϣ�Ŀ��Ʋ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������9:37:13
	 * @param pr_idss
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteWareHouseInfo")
	@ResponseBody
	public JSONObject deleteWareHouseInfo(String pr_idss){
		int result = wareHouseInfoService.deleteWareHouseInfo(pr_idss);
		JSONObject jsonObject = new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
			jsonObject.put("count", result);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
}
