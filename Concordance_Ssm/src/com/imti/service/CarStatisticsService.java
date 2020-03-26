package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.VehicleDispach;

public interface CarStatisticsService {
	/**
	 * @方法名: findAllCartsInfo
	 * @方法说明: 查询全部车辆统计
	 */
	public List<VehicleDispach> findAllCartsInfo(Map<String, Object> map);
	/**
	 * @方法名: findAllCartsInfoCount
	 * @方法说明: 把查询的全部信息分页
	 */
	public int findAllCartsInfoCount(Map<String, Object> map);
}
