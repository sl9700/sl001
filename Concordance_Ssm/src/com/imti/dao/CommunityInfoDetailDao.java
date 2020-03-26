package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.CommunityInfoDetail;

/**@�ļ���: CommunityInfoDetailDao.java
 * @�๦��˵��:  С����ϢDao��
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��18������10:32:39
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��18������10:32:39</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface CommunityInfoDetailDao {
	/**
	 * @������: CommunityInfoDetail
	 * @����˵��: С����Ϣ��ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������2:51:18
	 * @param map
	 * @return
	 * @return: List<CommunityInfoDetail>
	 */
	public List<CommunityInfoDetail> CommunityInfoDetail(Map<String, Object> map);
	/**
	 * @������: findAllCommunityInfoDetailCount
	 * @����˵��: С����Ϣ��������ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������2:51:40
	 * @return
	 * @return: int
	 */
	public int findAllCommunityInfoDetailCount();
	/**
	 * @������: updateCommunityInfoDetail
	 * @����˵��: С����Ϣ�޸�
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������2:52:04
	 * @param communityInfoDetail
	 * @return
	 * @return: int
	 */
	public int updateCommunityInfoDetail(CommunityInfoDetail communityInfoDetail);
	/**
	 * @������: deleteCommunityInfoDetail
	 * @����˵��: С����Ϣɾ��
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������4:02:21
	 * @param cd_idss
	 * @return
	 * @return: int
	 */
	public int deleteCommunityInfoDetail(int cd_id);
	/**
	 * @������: newCommunityInfoDetailDao
	 * @����˵��: С����Ϣ����
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��19������3:52:06
	 * @param co_id
	 * @return
	 * @return: int
	 */
	public int newCommunityInfoDetailDao(CommunityInfoDetail communityInfoDetail);
}