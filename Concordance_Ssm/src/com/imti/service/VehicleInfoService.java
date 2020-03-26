package com.imti.service;
/**@文件名: VehicleInfoService.java
 * @类功能说明: 
 * @作者: XuJiaWei
 * @Email: 2568492004@qq.com
 * @日期: 2020年3月17日上午11:08:58
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: XuJiaWei</li> 
 * 	 <li>日期: 2020年3月17日上午11:08:58</li> 
 *	 <li>内容: </li>
 * </pre>
 */
import java.util.List;
import java.util.Map;

import com.imti.controller.VehicleInfoController;
import com.imti.model.VehicleInfo;

public interface VehicleInfoService {
	
	public List<VehicleInfo> findAllvehicleInfo(Map<String,Object> map);
	
	public int findAllvehicleInfoCount();

	public int deleteVehicleInfo(String ve_idss);
	
	public int veAccountIsExist(Map<String,Object> map);
	
	public int saveVehicleInfo(VehicleInfo vehicleInfo);
	
	public int updateVehicleInfo(VehicleInfo vehicleInfo);
}
