package com.imti.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.RecycleStatisticsDao;
import com.imti.model.RecycleStatistics;
import com.imti.service.RecycleStatisticsService;
/**
 * @文件名: RecycleStatisticsServiceImpl.java
 * @类功能说明: 实现RecycleStatisticsService接口
 * @作者: wangyuntian
 * @Email: 841589654@qq.com
 * @日期: 2020年3月20日上午10:56:51
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: wangyuntian</li> 
 * 	 <li>日期: 2020年3月20日上午10:56:51</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class RecycleStatisticsServiceImpl implements RecycleStatisticsService {

	@Autowired
	private RecycleStatisticsDao recycleStatisticsDao;
	
	@Override
	public List<RecycleStatistics> findAllRecycleStatistics(Map<String, Object> map) {
		return recycleStatisticsDao.findAllRecycleStatistics(map);
	}
	@Override
	public int findAllRecycleStatisticsCount(Map<String, Object> map) {
		return recycleStatisticsDao.findAllRecycleStatisticsCount(map);
	}

	

}
