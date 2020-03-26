package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.VehicleDispach;



/**@文件名: CarTransInfoService.java
 * @类功能说明: 车辆调度service层
 * </pre>
 */
public interface CarTransInfoService {
	/**
	 * @方法名: findAllCartsInfo
	 * @方法说明: 查询全部车辆调度
	 */
	public List<VehicleDispach> findAllCartsInfo(Map<String, Object> map);
	/**
	 * @方法名: findAllCartsInfoCount
	 * @方法说明: 把查询的全部信息分页
	 */
	public int findAllCartsInfoCount(Map<String, Object> map);
	/**
	 * @方法名: addCartsInfo
	 * @方法说明: 车源调度请求
	 */
	public int addCartsInfo(VehicleDispach vehicleDispach);
	
	
	/**
	 * @方法名: addCartsInfo
	 * @方法说明: 车源修改
	
	 */
	
	public int updateCartsInfo(VehicleDispach vehicleDispach);
	/**
	 * @方法名: addCartsInfo
	 * @方法说明: 车源删除
	
	 */
	
	public int deleteEmployeeInfo(String emIds);
	
}
