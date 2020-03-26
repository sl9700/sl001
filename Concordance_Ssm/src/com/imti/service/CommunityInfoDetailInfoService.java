package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.CommunityInfoDetail;

import net.sf.json.JSONObject;

/**@�ļ���: CommunityInfoService.java
 * @�๦��˵��: 
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��18������10:20:15
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��18������10:20:15</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface CommunityInfoDetailInfoService {
	/**
	 * @������: CommunityInfoDetail
	 * @����˵��: С����Ϣ��ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������2:45:04
	 * @param map
	 * @return
	 * @return: List<CommunityInfoDetail>
	 */
	public List<CommunityInfoDetail> CommunityInfoDetail(Map<String,Object> map);
	/**
	 * @������: findAllCommunityInfoDetailCount
	 * @����˵��: С����Ϣ��������ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������2:45:55
	 * @return
	 * @return: int
	 */
	public int findAllCommunityInfoDetailCount();
	/**
	 * @������: updateCommunityInfoDetail
	 * @����˵��: С����Ϣ�޸�
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������2:46:47
	 * @param communityInfoDetail
	 * @return
	 * @return: JSONObject
	 */
	public int updateCommunityInfoDetail(CommunityInfoDetail communityInfoDetail);
	/**
	 * @������: delectCommunityInfoDetail
	 * @����˵��: ɾ��С����Ϣ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��18������3:52:33
	 * @param cd_idss
	 * @return
	 * @return: int
	 */
	public int deleteCommunityInfoDetail(String cd_idss);
}
