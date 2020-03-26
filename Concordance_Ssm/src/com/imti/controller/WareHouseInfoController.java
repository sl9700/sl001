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
 * @文件名: WareHouseInfoController.java
 * @类功能说明: 回收站出入库管理的控制层
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月18日下午6:45:15
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月18日下午6:45:15</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("wareHouseInfo")
public class WareHouseInfoController {
	/**
	 * 导入回收站出入库的Service接口
	 */
	@Autowired
	private WareHouseInfoService wareHouseInfoService;
	/**
	 * @方法名: findAllWareHouseInfo
	 * @方法说明: 找到所有的回收站出入库信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午6:57:08
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
	 * @方法名: addWareHouseInfo
	 * @方法说明: 新增入库信息的控制层
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午9:29:51
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
	 * @方法名: updateWareHouseInfo
	 * @方法说明: 修改回收站出入库信息的控制层
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午9:34:46
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
	 * @方法名: deleteWareHouseInfo
	 * @方法说明: 删除回收站入库信息的控制层
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午9:37:13
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
