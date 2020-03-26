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
import com.imti.model.VehicleDispach;
import com.imti.service.CarTransInfoService;
import com.imti.util.StringUtil;


/**@文件名: CarTransInfoController.java
 * @类功能说明: 车辆调度Controller层
 */
@Controller
@RequestMapping("cartsInfo")
public class CarTransInfoController {
	
	@Autowired
	private CarTransInfoService carTransInfoService;
	
	/**
	 * @方法名: findAllCartsInfo
	 * @方法说明: 查询车辆调度全部信息
	 */
	@ResponseBody
	@RequestMapping("findAllCartsInfo")
	 public Map<String, Object> findAllCartsInfo(String searchByName,String page,String rows){
		Map<String, Object> map=new HashMap<String,Object>();
		//分页方法层
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		//用工具类来判断前台传来的参数是否为空
		if (StringUtil.isNotEmpty(searchByName)){
			map.put("searchByName", searchByName);
		}
		map.put("pageBean", pageBean);
		//利用list把数据库中所有数据全查出来
		List<VehicleDispach> ctiList=carTransInfoService.findAllCartsInfo(map);
		//用来把查询出的所用数据排序并分页
		int total=carTransInfoService.findAllCartsInfoCount(map);
		Map<String, Object> map1=new HashMap<String,Object>();
		map1.put("total", total);
		map1.put("rows", ctiList);
		System.out.println(ctiList+"+++++");
		return map1;
	}
	
	
	
	
	
	
	/**
	 * @方法名: addCartsInfo
	 * @方法说明: 车源调度请求（新增）
	 */
	@ResponseBody
	@RequestMapping("/addCartsInfo")
	public Map<String, Object> addCartsInfo(VehicleDispach vehicleDispach,HttpServletRequest request){
		Map<String, Object> resultMap=new HashMap<String, Object>();
		HttpSession session=request.getSession();
		EmployeeInfo userSession=(EmployeeInfo) session.getAttribute("currentEmployeeInfo");
		System.out.println(userSession.getEm_name());
		vehicleDispach.setVd_opt_id(userSession.getEm_name());
		int result=carTransInfoService.addCartsInfo(vehicleDispach);
		if(result>0) {
			resultMap.put("msg", true);
		}else {
			resultMap.put("msg", false);
		}
		return resultMap;	
	}
	
	
	/**
	 * @方法名: addCartsInfo
	 * @方法说明: 车源调度请求（修改）
	 */
	@ResponseBody
	@RequestMapping("/updataCartsInfo")
	public Map<String, Object> updateCartsInfo(VehicleDispach vehicleDispach,HttpServletRequest request){
		System.out.println(vehicleDispach+"#############");
		Map<String, Object> resultMap=new HashMap<String, Object>();
		HttpSession session=request.getSession();
		EmployeeInfo userSession=(EmployeeInfo) session.getAttribute("currentEmployeeInfo");
		System.out.println(userSession.getEm_name());
		vehicleDispach.setVd_opt_id(userSession.getEm_name());
		int result=carTransInfoService.updateCartsInfo(vehicleDispach);
		if(result>0) {
			resultMap.put("msg", true);
		}else {
			resultMap.put("msg", false);
		}
		return resultMap;	
	}
	/**
	 * @方法名: addCartsInfo
	 * @方法说明: 车源调度请求（删除）
	 */
	@RequestMapping("/deleteEmployeeInfo")
	@ResponseBody
	public Map<String,Object> deleteEmployeeInfo(String emIds){
	
		Map<String,Object> map = new HashMap<String,Object>();
		int result = carTransInfoService.deleteEmployeeInfo(emIds);
		if(result>0){
			map.put("msg",true);
			map.put("count",result);
		}else{
			map.put("mag",false);
		}
		return map;		
	}
}
