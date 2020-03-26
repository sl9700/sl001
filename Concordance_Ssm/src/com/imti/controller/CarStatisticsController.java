package com.imti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.PageBean;
import com.imti.model.VehicleDispach;
import com.imti.service.CarStatisticsService;
import com.imti.util.StringUtil;

@Controller
@RequestMapping("carStatistics")
public class CarStatisticsController {
	
	
	@Autowired
	private CarStatisticsService carStatisticsService;
	
	
	/**
	 * @方法名: findAllCartsInfo
	 * @方法说明: 查询车辆统计
	 */
	@ResponseBody
	@RequestMapping("findCarStatistics")
	 public Map<String, Object> findAllCartsInfo(String searchByName,String veType,String veLicense,String page,String rows){
		Map<String, Object> map=new HashMap<String,Object>();
		//分页方法层
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		//用工具类来判断前台传来的参数是否为空
		System.out.println(searchByName+"___--------");
		System.out.println(veType+"___------___--");
		System.out.println(veLicense+"___-----+--");
		if (StringUtil.isNotEmpty(searchByName)){
			map.put("searchByName", searchByName);
		}
		if (StringUtil.isNotEmpty(veType)){
			map.put("veType", veType);
		}
		if (StringUtil.isNotEmpty(veLicense)){
			map.put("veLicense", veLicense);
		}
		map.put("pageBean", pageBean);
		//利用list把数据库中所有数据全查出来
		List<VehicleDispach> ctiList=carStatisticsService.findAllCartsInfo(map);
		//用来把查询出的所用数据排序并分页
		int total=carStatisticsService.findAllCartsInfoCount(map);
		Map<String, Object> map1=new HashMap<String,Object>();
		map1.put("total", total);
		map1.put("rows", ctiList);
		System.out.println(ctiList+"+++++");
		return map1;
	}
}
