package com.imti.service.impl;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.RecycleOrderDao;
import com.imti.model.RecycleOrder;
import com.imti.service.RecycleOrderService;
/**
 * @文件名: RecycleOrderServiceImpl.java
 * @类功能说明: 实现RecycleOrderService接口
 * @作者: wangyuntian
 * @Email: 841589654@qq.com
 * @日期: 2020年3月20日上午11:15:10
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: wangyuntian</li> 
 * 	 <li>日期: 2020年3月20日上午11:15:10</li> 
 *	 <li>内容: </li>
 * </pre>
 */

@Service
public class RecycleOrderServiceImpl implements RecycleOrderService {

	@Autowired
	private RecycleOrderDao recycleOrderDao;
	
	
	@Override
	public List<RecycleOrder> findAllRecycleOrder(Map<String,Object> map) {
		return recycleOrderDao.findAllRecycleOrder(map);
	}



	@Override
	public int findAllRecycleOrderCount(Map<String, Object> map) {
		return recycleOrderDao.findAllRecycleOrderCount(map);
	}

	@Override
	public int addRecycleOrder(RecycleOrder recycleOrder) {
		recycleOrder.setRco_delflag(0);
		recycleOrder.setRco_state(0);
		return recycleOrderDao.addRecycleOrder(recycleOrder);
	}



	
	@Override
	public int updateRecycleOrder(RecycleOrder recycleOrder) {
		recycleOrder.setRco_delflag(0);
		recycleOrder.setRco_state(0);
		return recycleOrderDao.updateRecycleOrder(recycleOrder);
	}



	
	@Override
	public int deleteRecycleOrder(String rcoIds) {
		String rco_ds[]=rcoIds.split(",");
		int result=0;
		for(int i=0;i<rcoIds.length();i++) {
			result+=recycleOrderDao.deleteRecycleOrder(Integer.parseInt(rco_ds[i]));
		}
		return result;
	}
	
	


}
