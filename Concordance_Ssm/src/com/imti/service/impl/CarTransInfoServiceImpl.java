package com.imti.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.CarTransInfoDao;
import com.imti.model.VehicleDispach;
import com.imti.service.CarTransInfoService;
import com.imti.util.DateUtil;




@Service
public class CarTransInfoServiceImpl implements CarTransInfoService {
	
	@Autowired
	private CarTransInfoDao carTransInfoDao;
	
	/**
	 * 查询全部调度信息
	 */
	@Override
	public List<VehicleDispach> findAllCartsInfo(Map<String, Object> map) {
		
		return carTransInfoDao.findAllCartsInfo(map);
	}
	/**
	 * 全部信息安条数分页
	 */
	@Override
	public int findAllCartsInfoCount(Map<String, Object> map) {
		
		return carTransInfoDao.findAllCartsInfoCount(map);
	}
	/**
	 * 车源调度请求
	 */
	@Override
	public int addCartsInfo(VehicleDispach carTransInfo) {
		
		
		carTransInfo.setVd_delflag(0);
		carTransInfo.setVd_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		return carTransInfoDao.addCartsInfo(carTransInfo);
	}
	
	/**
	 * @方法名: addCartsInfo
	 * @方法说明: 车源修改
	
	 */
	@Override
	public int updateCartsInfo(VehicleDispach vehicleDispach) {
		return carTransInfoDao.updateCartsInfo(vehicleDispach);
	}

	
	
	/**
	 * @方法名: addCartsInfo
	 * @方法说明: 车源删除
	
	 */
	@Override
	public int deleteEmployeeInfo(String id) {
		String em_ids[] = id.split(",");
		int result=0;
		for(int i=0;i<em_ids.length;i++){
			result+=carTransInfoDao.deleteEmployeeInfo(Integer.parseInt(em_ids[i]));
			}
		return result;
	}
	

}
