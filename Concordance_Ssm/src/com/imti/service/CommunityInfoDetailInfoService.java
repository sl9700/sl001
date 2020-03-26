package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.CommunityInfoDetail;

import net.sf.json.JSONObject;

/**@文件名: CommunityInfoService.java
 * @类功能说明: 
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月18日上午10:20:15
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月18日上午10:20:15</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface CommunityInfoDetailInfoService {
	/**
	 * @方法名: CommunityInfoDetail
	 * @方法说明: 小区信息查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午2:45:04
	 * @param map
	 * @return
	 * @return: List<CommunityInfoDetail>
	 */
	public List<CommunityInfoDetail> CommunityInfoDetail(Map<String,Object> map);
	/**
	 * @方法名: findAllCommunityInfoDetailCount
	 * @方法说明: 小区信息总条数查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午2:45:55
	 * @return
	 * @return: int
	 */
	public int findAllCommunityInfoDetailCount();
	/**
	 * @方法名: updateCommunityInfoDetail
	 * @方法说明: 小区信息修改
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午2:46:47
	 * @param communityInfoDetail
	 * @return
	 * @return: JSONObject
	 */
	public int updateCommunityInfoDetail(CommunityInfoDetail communityInfoDetail);
	/**
	 * @方法名: delectCommunityInfoDetail
	 * @方法说明: 删除小区信息
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月18日下午3:52:33
	 * @param cd_idss
	 * @return
	 * @return: int
	 */
	public int deleteCommunityInfoDetail(String cd_idss);
}
