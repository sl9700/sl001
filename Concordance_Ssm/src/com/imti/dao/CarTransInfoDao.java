package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.VehicleDispach;




public interface CarTransInfoDao {
	/**
	 * @方法名: findAllCartsInfo
	 * @方法说明: 查询全部调度信息

	 */
	public List<VehicleDispach> findAllCartsInfo(Map<String, Object> map);
	/**
	 * @方法名: findAllCartsInfoCount
	 * @方法说明: 把查询出的全部信息分页
	 */
	public int findAllCartsInfoCount(Map<String, Object> map);
	/**
	 * @方法名: addCartsInfo
	 * @方法说明: 车源添加
	
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
	
	public int deleteEmployeeInfo(Integer id);

}
