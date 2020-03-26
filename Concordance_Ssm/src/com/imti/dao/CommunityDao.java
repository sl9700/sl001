package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.Community;

/**@文件名: CommunityDao.java
 * @类功能说明: 小区信息Dao层接口
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月14日上午9:08:53
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月14日上午9:08:53</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface CommunityDao {
	/**
	 * @方法名: CommunityService
	 * @方法说明: 试点小区信息查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月14日上午9:10:22
	 * @return
	 * @return: List<Community>
	 */
	public List<Community> findAllCommunity(Map<String,Object> map);
	/**
	 * @方法名: findAllCommunityCount
	 * @方法说明: 试点小区信息总条数查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月14日上午10:05:53
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllCommunityCount(Map<String,Object> map);
	/**
	 * @方法名: newCommunityInfo
	 * @方法说明: 试点小区新增
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午5:18:24
	 * @param community
	 * @return
	 * @return: int
	 */
	public int newCommunityInfo(Community community);
	/**
	 * @方法名: updateCommunityInfo
	 * @方法说明: 试点小区修改
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午9:41:38
	 * @param community
	 * @return
	 * @return: int
	 */
	public int updateCommunityInfo(Community community);
	/**
	 * @方法名: deleteCommunityInfo
	 * @方法说明: 试点小区删除
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午9:56:56
	 * @param co_id
	 * @return
	 * @return: int
	 */
	public int deleteCommunityInfo(int co_id);
	/**
	 * @方法名: findAllCommunityCountMAXid
	 * @方法说明: 试点小区查询最大ID
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月19日下午3:47:45
	 * @return
	 * @return: int
	 */
	public int findAllCommunityCountMAXid();
}
