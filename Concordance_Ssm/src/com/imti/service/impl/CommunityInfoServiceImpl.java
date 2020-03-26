package com.imti.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imti.model.CommunityInfoDetail;
import com.imti.dao.CommunityInfoDetailDao;
import com.imti.service.CommunityInfoDetailInfoService;

/**@�ļ���: CommunityInfoServiceImpl.java
 * @�๦��˵��: С����Ϣservice��ʵ����
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��18������10:23:23
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��18������10:23:23</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class CommunityInfoServiceImpl implements CommunityInfoDetailInfoService{
	@Autowired
	CommunityInfoDetailDao communityInfoDetailDao;
	/**
	 * С����Ϣ��ѯ
	 */
	@Override
	public List<CommunityInfoDetail> CommunityInfoDetail(Map<String, Object> map) {
		
		return communityInfoDetailDao.CommunityInfoDetail(map);
	}
	/**
	 * С����Ϣ��������ѯ
	 */
	@Override
	public int findAllCommunityInfoDetailCount() {
		return communityInfoDetailDao.findAllCommunityInfoDetailCount();
	}
	/**
	 * С����Ϣ�޸�
	 */
	@Override
	public int updateCommunityInfoDetail(CommunityInfoDetail communityInfoDetail) {
		
		return communityInfoDetailDao.updateCommunityInfoDetail(communityInfoDetail);
	}
	/**
	 * С����Ϣɾ��
	 */
	@Override
	public int deleteCommunityInfoDetail(String cd_idss) {
		String cd_id[]=cd_idss.split(",");
		int result=0;
		int conut=0;
		for (int i = 0; i < cd_id.length; i++) {
			result= communityInfoDetailDao.deleteCommunityInfoDetail(Integer.parseInt(cd_id[0]));
			if(result>0){
				conut++;
			}
		}
		return conut;
	}

}
