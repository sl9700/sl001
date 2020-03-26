package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.VehicleInfo;

public interface FindDriverPlateNumber {
	public List<EmployeeInfo> findDriver(Map<String, Object> map);

	
	
	public List<VehicleInfo> findPlateNumber(Map<String, Object> map);
	
	public List<VehicleInfo> findState(Map<String, Object> map);
	
}
