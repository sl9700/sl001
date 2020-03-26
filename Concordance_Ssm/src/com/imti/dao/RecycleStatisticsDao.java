package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.RecycleStatistics;
/**
 * @�ļ���: RecycleStatisticsDao.java
 * @�๦��˵��: �������ݿ�Ľӿ�
 * @����: wangyuntian
 * @Email: 841589654@qq.com
 * @����: 2020��3��20������10:54:59
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: wangyuntian</li> 
 * 	 <li>����: 2020��3��20������10:54:59</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface RecycleStatisticsDao {
/**
 * @������: findAllRecycleStatistics
 * @����˵��: ��ѯ���й��ڻ���վͳ�Ƶ��ֶ�
 * @����: wangyuntian
 * @���䣺841589654@qq.com
 * @����: 2020��3��20������10:55:06
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
	 * @����: 2020��3��20������10:55:25
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleStatisticsCount(Map<String,Object> map);
}
