package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.RecycleStatistics;
/**
 * @文件名: RecycleStatisticsDao.java
 * @类功能说明: 链接数据库的接口
 * @作者: wangyuntian
 * @Email: 841589654@qq.com
 * @日期: 2020年3月20日上午10:54:59
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: wangyuntian</li> 
 * 	 <li>日期: 2020年3月20日上午10:54:59</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface RecycleStatisticsDao {
/**
 * @方法名: findAllRecycleStatistics
 * @方法说明: 查询所有关于回收站统计的字段
 * @作者: wangyuntian
 * @邮箱：841589654@qq.com
 * @日期: 2020年3月20日上午10:55:06
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
	 * @日期: 2020年3月20日上午10:55:25
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleStatisticsCount(Map<String,Object> map);
}
