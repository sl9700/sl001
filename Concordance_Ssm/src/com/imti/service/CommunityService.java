package com.imti.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.imti.model.Community;

import net.sf.json.JSONObject;

/**@文件名: CommunityService.java
 * @类功能说明: 小区信息Service层接口
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月14日上午9:01:48
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月14日上午9:01:48</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface CommunityService {
	/**
	 * @方法名: findAllCommunity
	 * @方法说明: 试点小区信息查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月14日上午10:06:48
	 * @param map
	 * @return
	 * @return: List<Community>
	 */
	public List<Community> findAllCommunity(Map<String,Object> map);
	/**
	 * @方法名: findAllCommunityCount
	 * @方法说明: 试点小区信息总条数查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月14日上午10:07:53
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
	 * @日期: 2020年3月18日下午5:13:49
	 * @param req
	 * @param community
	 * @return
	 * @return: JSONObject
	 */
	public int newCommunityInfo(Community community);
	/**
	 * @方法名: updateCommunityInfo
	 * @方法说明: 试点小区修改
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午9:39:56
	 * @param community
	 * @return
	 * @return: JSONObject
	 */
	public int updateCommunityInfo(Community community);
	/**
	 * @方法名: deleteCommunityInfo
	 * @方法说明: 试点小区删除
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午9:54:12
	 * @param co_idss
	 * @return
	 * @return: JSONObject
	 */
	public int deleteCommunityInfo(String co_idss);
}
