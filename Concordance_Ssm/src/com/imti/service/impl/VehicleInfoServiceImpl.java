package com.imti.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.controller.VehicleInfoController;
import com.imti.dao.VehicleInfoDao;
import com.imti.model.VehicleInfo;
import com.imti.service.VehicleInfoService;
import com.imti.util.DateUtil;

/**@文件名: VehicleInfoServiceImpl.java
 * @类功能说明: 
 * @作者: XuJiaWei
 * @Email: 2568492004@qq.com
 * @日期: 2020年3月17日上午11:14:53
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: XuJiaWei</li> 
 * 	 <li>日期: 2020年3月17日上午11:14:53</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class VehicleInfoServiceImpl implements VehicleInfoService{
	
	@Autowired
	private VehicleInfoDao vehicleInfoDao;
	/**
	 * 查询所有车辆信息
	 */
	@Override
	public List<VehicleInfo> findAllvehicleInfo(Map<String, Object> map) {
		return vehicleInfoDao.findAllvehicleInfo(map);
	}
	/**
	 * 获取所有行
	 */
	@Override
	public int findAllvehicleInfoCount() {
		return vehicleInfoDao.findAllvehicleInfoCount();
	}
	@Override
	public int deleteVehicleInfo(String ve_idss) {
		String veids[]=ve_idss.split(",");
		int result=0;
		for(int i=0;i<veids.length;i++){
			result=vehicleInfoDao.deleteVehicleInfo(Integer.parseInt(veids[i]));
			
		}
		return result;
	}
	@Override
	public int veAccountIsExist(Map<String, Object> map) {
		
		return vehicleInfoDao.veAccountIsExist(map);
	}
	@Override
	public int saveVehicleInfo(VehicleInfo vehicleInfo) {
		
		vehicleInfo.setVe_delflag(0);
		vehicleInfo.setVe_createTime(DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
		vehicleInfo.setVe_state(0);
		return vehicleInfoDao.saveVehicleInfo(vehicleInfo);
	}
	@Override
	public int updateVehicleInfo(VehicleInfo vehicleInfo) {
		System.out.println(vehicleInfo+"12345689");
		return vehicleInfoDao.updateVehicleInfo(vehicleInfo);
	}
}
