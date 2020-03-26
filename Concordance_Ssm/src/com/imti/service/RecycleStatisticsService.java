package com.imti.service;

import java.util.List;

import java.util.Map;


import com.imti.model.RecycleStatistics;
/**
 * @�ļ���: RecycleStatisticsService.java
 * @�๦��˵��:��ѯ��Ϣ�Ľӿ�
 * @����: wangyuntian
 * @Email: 841589654@qq.com
 * @����: 2020��3��20������10:56:28
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: wangyuntian</li> 
 * 	 <li>����: 2020��3��20������10:56:28</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface RecycleStatisticsService {
/**
 * @������: findAllRecycleStatistics
 * @����˵��: ��ѯ���й��ڻ���վͳ�Ƶ��ֶ�
 * @����: wangyuntian
 * @���䣺841589654@qq.com
 * @����: 2020��3��20������10:56:34
 * @param map
 * @return
 * @return: List<RecycleStatistics>
 */
	public List<RecycleStatistics> findAllRecycleStatistics(Map<String,Object> map);
	/**
	 * @������: findAllRecycleStatisticsCount
	 * @����˵��: ��ѯ�ֶη�ҳ
	 * @����: wangyuntian
	 * @���䣺841589654@qq.com
	 * @����: 2020��3��20������10:56:39
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleStatisticsCount(Map<String,Object> map);
}
