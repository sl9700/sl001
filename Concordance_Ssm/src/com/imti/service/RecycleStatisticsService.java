package com.imti.service;

import java.util.List;

import java.util.Map;


import com.imti.model.RecycleStatistics;
/**
 * @文件名: RecycleStatisticsService.java
 * @类功能说明:查询信息的接口
 * @作者: wangyuntian
 * @Email: 841589654@qq.com
 * @日期: 2020年3月20日上午10:56:28
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: wangyuntian</li> 
 * 	 <li>日期: 2020年3月20日上午10:56:28</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface RecycleStatisticsService {
/**
 * @方法名: findAllRecycleStatistics
 * @方法说明: 查询所有关于回收站统计的字段
 * @作者: wangyuntian
 * @邮箱：841589654@qq.com
 * @日期: 2020年3月20日上午10:56:34
 * @param map
 * @return
 * @return: List<RecycleStatistics>
 */
	public List<RecycleStatistics> findAllRecycleStatistics(Map<String,Object> map);
	/**
	 * @方法名: findAllRecycleStatisticsCount
	 * @方法说明: 查询字段分页
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午10:56:39
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleStatisticsCount(Map<String,Object> map);
}
