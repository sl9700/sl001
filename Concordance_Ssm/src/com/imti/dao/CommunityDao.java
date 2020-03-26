package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.Community;

/**@�ļ���: CommunityDao.java
 * @�๦��˵��: С����ϢDao��ӿ�
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��14������9:08:53
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��14������9:08:53</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface CommunityDao {
	/**
	 * @������: CommunityService
	 * @����˵��: �Ե�С����Ϣ��ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��14������9:10:22
	 * @return
	 * @return: List<Community>
	 */
	public List<Community> findAllCommunity(Map<String,Object> map);
	/**
	 * @������: findAllCommunityCount
	 * @����˵��: �Ե�С����Ϣ��������ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��14������10:05:53
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
	 * @����: 2020��3��18������5:18:24
	 * @param community
	 * @return
	 * @return: int
	 */
	public int newCommunityInfo(Community community);
	/**
	 * @������: updateCommunityInfo
	 * @����˵��: �Ե�С���޸�
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������9:41:38
	 * @param community
	 * @return
	 * @return: int
	 */
	public int updateCommunityInfo(Community community);
	/**
	 * @������: deleteCommunityInfo
	 * @����˵��: �Ե�С��ɾ��
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������9:56:56
	 * @param co_id
	 * @return
	 * @return: int
	 */
	public int deleteCommunityInfo(int co_id);
	/**
	 * @������: findAllCommunityCountMAXid
	 * @����˵��: �Ե�С����ѯ���ID
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��19������3:47:45
	 * @return
	 * @return: int
	 */
	public int findAllCommunityCountMAXid();
}
