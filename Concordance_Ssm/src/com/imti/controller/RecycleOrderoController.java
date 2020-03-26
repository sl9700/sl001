package com.imti.controller;

import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.EmployeeInfo;
import com.imti.model.PageBean;
import com.imti.model.RecycleOrder;
import com.imti.service.RecycleOrderService;
import com.imti.util.StringUtil;
/**
 * @文件名: RecycleOrderoController.java
 * @类功能说明: 信息控制层
 * @作者: wangyuntian
 * @Email: 841589654@qq.com
 * @日期: 2020年3月20日上午11:20:57
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: wangyuntian</li> 
 * 	 <li>日期: 2020年3月20日上午11:20:57</li> 
 *	 <li>内容: </li>
 * </pre>
 */


@Controller
@RequestMapping("RecycleOrder")
public class RecycleOrderoController {

	@Autowired
	private RecycleOrderService recycleOrderService;
	/**
	 * @方法名: findAllRecycleOrder
	 * @方法说明:  查询回收站订单全部
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午10:58:49
	 * @param searchByName
	 * @param page
	 * @param rows
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllRecycleOrder")
	@ResponseBody
	public Map<String,Object> findAllRecycleOrder(String searchByName,int page,int rows){
		Map<String,Object> map=new HashMap<String,Object>();
		if(StringUtil.isEmpty(searchByName)){
			searchByName="";
		}
		PageBean pageBean=new PageBean(page, rows);
		map.put("pageBean", pageBean);
		map.put("searchByName", searchByName);
		int total=recycleOrderService.findAllRecycleOrderCount(map);
		Map<String,Object> map1=new HashMap<String,Object>();
		map1.put("rows", recycleOrderService.findAllRecycleOrder(map));
		map1.put("total", total);
		return map1;
	}
	/**
	 * @方法名: addRecycleOrder
	 * @方法说明:增加回收站订单 
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午10:59:03
	 * @param recycleOrder
	 * @param request
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/addRecycleOrder")
	@ResponseBody
	public Map<String,Object> addRecycleOrder(RecycleOrder recycleOrder, HttpServletRequest request){
		HttpSession session=request.getSession();
		EmployeeInfo em=(EmployeeInfo) session.getAttribute("currentEmployeeInfo");
		recycleOrder.setRco_opt_id(em.getEm_id());
		int result=recycleOrderService.addRecycleOrder(recycleOrder);
		Map<String,Object> map=new HashMap<String,Object>();
		if(result>0) {
			map.put("msg", true);
		}else {
			map.put("msg", false);
		}
		return map;
	}
	/**
	 * @方法名: updateRecycleOrder
	 * @方法说明:  修改订单
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午10:59:19
	 * @param recycleOrder
	 * @param request
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/updateRecycleOrder")
	@ResponseBody
	public Map<String,Object> updateRecycleOrder (RecycleOrder recycleOrder, HttpServletRequest request){
		HttpSession session=request.getSession();
		EmployeeInfo em=(EmployeeInfo) session.getAttribute("currentEmployeeInfo");
		recycleOrder.setRco_opt_id(em.getEm_id());
		int result=recycleOrderService.updateRecycleOrder(recycleOrder);
		Map<String,Object> map=new HashMap<String,Object>();
		if(result>0) {
			map.put("msg", true);
		}else {
			map.put("msg", false);
		}	
		return map;
	}
	/**
	 * @方法名: deleteRecycleOrder
	 * @方法说明:删除订单 
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午10:59:32
	 * @param rcoIds
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/deleteRecycleOrder")
	@ResponseBody
	public Map<String,Object> deleteRecycleOrder (String rcoIds){
		int result=recycleOrderService.deleteRecycleOrder(rcoIds);
		Map<String,Object> map=new HashMap<String,Object>();
		if(result>0) {
			map.put("msg", true);
			map.put("count", result);
		}else {
			map.put("msg", false);
		}	
		return map;
	}
	
}


