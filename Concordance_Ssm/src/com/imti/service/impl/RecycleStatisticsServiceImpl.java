package com.imti.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.RecycleStatisticsDao;
import com.imti.model.RecycleStatistics;
import com.imti.service.RecycleStatisticsService;
/**
 * @�ļ���: RecycleStatisticsServiceImpl.java
 * @�๦��˵��: ʵ��RecycleStatisticsService�ӿ�
 * @����: wangyuntian
 * @Email: 841589654@qq.com
 * @����: 2020��3��20������10:56:51
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: wangyuntian</li> 
 * 	 <li>����: 2020��3��20������10:56:51</li> 
 *	 <li>����: </li>
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
