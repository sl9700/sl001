package com.imti.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.CarStatisticsDao;
import com.imti.model.VehicleDispach;
import com.imti.service.CarStatisticsService;
@Service
public class CarStatisticsServiceImpl implements CarStatisticsService{
	@Autowired
	private CarStatisticsDao carStatisticsDao;
	
	/**
	 * 查询全部调度信息
	 */
	@Override
	public List<VehicleDispach> findAllCartsInfo(Map<String, Object> map) {
		
		return carStatisticsDao.findAllCartsInfo(map);
	}
	/**
	 * 全部信息安条数分页
	 */
	@Override
	public int findAllCartsInfoCount(Map<String, Object> map) {
		
		return carStatisticsDao.findAllCartsInfoCount(map);
	}
}
