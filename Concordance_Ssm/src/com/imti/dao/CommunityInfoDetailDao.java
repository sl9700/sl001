package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.CommunityInfoDetail;

/**@文件名: CommunityInfoDetailDao.java
 * @类功能说明:  小区信息Dao层
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月18日上午10:32:39
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月18日上午10:32:39</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface CommunityInfoDetailDao {
	/**
	 * @方法名: CommunityInfoDetail
	 * @方法说明: 小区信息查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午2:51:18
	 * @param map
	 * @return
	 * @return: List<CommunityInfoDetail>
	 */
	public List<CommunityInfoDetail> CommunityInfoDetail(Map<String, Object> map);
	/**
	 * @方法名: findAllCommunityInfoDetailCount
	 * @方法说明: 小区信息总条数查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午2:51:40
	 * @return
	 * @return: int
	 */
	public int findAllCommunityInfoDetailCount();
	/**
	 * @方法名: updateCommunityInfoDetail
	 * @方法说明: 小区信息修改
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午2:52:04
	 * @param communityInfoDetail
	 * @return
	 * @return: int
	 */
	public int updateCommunityInfoDetail(CommunityInfoDetail communityInfoDetail);
	/**
	 * @方法名: deleteCommunityInfoDetail
	 * @方法说明: 小区信息删除
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午4:02:21
	 * @param cd_idss
	 * @return
	 * @return: int
	 */
	public int deleteCommunityInfoDetail(int cd_id);
	/**
	 * @方法名: newCommunityInfoDetailDao
	 * @方法说明: 小区信息新增
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月19日下午3:52:06
	 * @param co_id
	 * @return
	 * @return: int
	 */
	public int newCommunityInfoDetailDao(CommunityInfoDetail communityInfoDetail);
}