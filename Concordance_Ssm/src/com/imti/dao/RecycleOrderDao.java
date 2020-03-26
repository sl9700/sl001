package com.imti.dao;

import java.util.List;

import java.util.Map;

import com.imti.model.RecycleOrder;

/**
 * @文件名: RecycleOrderDao.java
 * @类功能说明: 链接数据库的接口
 * @作者: wangyuntian
 * @Email: 841589654@qq.com
 * @日期: 2020年3月20日上午10:59:53
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: wangyuntian</li> 
 * 	 <li>日期: 2020年3月20日上午10:59:53</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface RecycleOrderDao {
	/**
	 * @方法名: findAllRecycleOrder
	 * @方法说明: 查询回收站订单全部
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午11:00:01
	 * @param map
	 * @return
	 * @return: List<RecycleOrder>
	 */
	public List<RecycleOrder> findAllRecycleOrder(Map<String,Object> map);
	/**
	 * @方法名: findAllRecycleOrderCount
	 * @方法说明:  查询回收站订单分页
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午11:00:06
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleOrderCount(Map<String, Object> map);
	/**
	 * @方法名: addRecycleOrder
	 * @方法说明: 增加回收站订单
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午11:00:10
	 * @param recycleOrder
	 * @return
	 * @return: int
	 */
	public int addRecycleOrder(RecycleOrder recycleOrder);
	/**
	 * @方法名: updateRecycleOrder
	 * @方法说明: 修改回收站订单
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午11:00:16
	 * @param recycleOrder
	 * @return
	 * @return: int
	 */
	public int updateRecycleOrder(RecycleOrder recycleOrder);
	/**
	 * @方法名: deleteRecycleOrder
	 * @方法说明: 删除回收站订单
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午11:00:20
	 * @param rco_id
	 * @return
	 * @return: int
	 */
	public int deleteRecycleOrder(int rco_id);
}
