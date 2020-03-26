package com.imti.service.impl;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.imti.dao.FindDriverPlateNumber;
import com.imti.model.EmployeeInfo;


import com.imti.model.VehicleInfo;
import com.imti.service.FindDriverPlateNumberService;
@Service
public class FindDriverPlateNumberServiceImpl implements FindDriverPlateNumberService{
	@Autowired
	private FindDriverPlateNumber findDriverPlateNumber;
	@Override
	public List<EmployeeInfo> findDriver(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return findDriverPlateNumber.findDriver(map);
	}

	@Override
	public List<VehicleInfo> findPlateNumber(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return findDriverPlateNumber.findPlateNumber(map);
	}

	@Override
	public List<VehicleInfo> findState(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return findDriverPlateNumber.findState(map);
	}

	
	
}
