package com.imti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.EmployeeInfo;
import com.imti.model.VehicleInfo;
import com.imti.service.FindDriverPlateNumberService;
import com.imti.util.StringUtil;
@Controller
@RequestMapping("find")
public class FindDriverPlateNumberController {
	@Autowired
	private FindDriverPlateNumberService findDriverPlateNumberService;
	
	
	@ResponseBody
	@RequestMapping("plateNumber")
	 public Map<String, Object> findPlateNumber(String s_roleName){
		Map<String, Object> map=new HashMap<String,Object>();
		
		//用工具类来判断前台传来的参数是否为空
		if (StringUtil.isNotEmpty(s_roleName)){
			map.put("searchByName", s_roleName);
		}
		
		//利用list把数据库中所有数据全查出来
		List<VehicleInfo> ctiList=findDriverPlateNumberService.findPlateNumber(map);
		Map<String, Object> map1=new HashMap<String,Object>();
		map1.put("rows", ctiList);
		
		return map1;
	}
	@ResponseBody
	@RequestMapping("driver")
	 public Map<String, Object> findDriver(String s_roleNames){
		Map<String, Object> map=new HashMap<String,Object>();
		System.out.println(s_roleNames+"............");
		//用工具类来判断前台传来的参数是否为空
		if (StringUtil.isNotEmpty(s_roleNames)){
			map.put("searchByName", s_roleNames);
			
		}
		
		
		//利用list把数据库中所有数据全查出来
		List<EmployeeInfo> ctiList=findDriverPlateNumberService.findDriver(map);
		Map<String, Object> map1=new HashMap<String,Object>();
		map1.put("rows", ctiList);
		System.out.println(ctiList+"++++");
		return map1;
	}
	
	@ResponseBody
	@RequestMapping("State")
	 public Map<String, Object> findState(String s_roleNames){
		Map<String, Object> map=new HashMap<String,Object>();
		System.out.println(s_roleNames+"............");
		//用工具类来判断前台传来的参数是否为空
		if (StringUtil.isNotEmpty(s_roleNames)){
			map.put("searchByName", s_roleNames);
			
		}
		
		
		//利用list把数据库中所有数据全查出来
		List<VehicleInfo> ctiList=findDriverPlateNumberService.findState(map);
		Map<String, Object> map1=new HashMap<String,Object>();
		map1.put("rows", ctiList);
		System.out.println(ctiList+"+0-----");
		return map1;
	}
}
