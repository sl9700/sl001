package com.imti.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.imti.model.Community;

import net.sf.json.JSONObject;

/**@�ļ���: CommunityService.java
 * @�๦��˵��: С����ϢService��ӿ�
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��14������9:01:48
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��14������9:01:48</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface CommunityService {
	/**
	 * @������: findAllCommunity
	 * @����˵��: �Ե�С����Ϣ��ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��14������10:06:48
	 * @param map
	 * @return
	 * @return: List<Community>
	 */
	public List<Community> findAllCommunity(Map<String,Object> map);
	/**
	 * @������: findAllCommunityCount
	 * @����˵��: �Ե�С����Ϣ��������ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��14������10:07:53
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllCommunityCount(Map<String,Object> map);
	/**
	 * @������: newCommunityInfo
	 * @����˵��: �Ե�С������
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������5:13:49
	 * @param req
	 * @param community
	 * @return
	 * @return: JSONObject
	 */
	public int newCommunityInfo(Community community);
	/**
	 * @������: updateCommunityInfo
	 * @����˵��: �Ե�С���޸�
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������9:39:56
	 * @param community
	 * @return
	 * @return: JSONObject
	 */
	public int updateCommunityInfo(Community community);
	/**
	 * @������: deleteCommunityInfo
	 * @����˵��: �Ե�С��ɾ��
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������9:54:12
	 * @param co_idss
	 * @return
	 * @return: JSONObject
	 */
	public int deleteCommunityInfo(String co_idss);
}
