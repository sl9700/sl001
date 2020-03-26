package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.VehicleInfo;

/**@文件名: VehicleInfoDao.java
 * @类功能说明: 
 * @作者: XuJiaWei
 * @Email: 2568492004@qq.com
 * @日期: 2020年3月17日上午11:26:35
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: XuJiaWei</li> 
 * 	 <li>日期: 2020年3月17日上午11:26:35</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface VehicleInfoDao {
	
	public List<VehicleInfo> findAllvehicleInfo(Map<String,Object> map);
	
	public int findAllvehicleInfoCount();
	
	public int deleteVehicleInfo(int ve_idss);

	public int veAccountIsExist(Map<String,Object> map);
	
	public int saveVehicleInfo(VehicleInfo vehicleInfo);
	
	public int updateVehicleInfo(VehicleInfo vehicleInfo);
}
