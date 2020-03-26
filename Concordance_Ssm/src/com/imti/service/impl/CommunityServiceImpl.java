package com.imti.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.CommunityDao;
import com.imti.dao.CommunityInfoDetailDao;
import com.imti.model.Community;
import com.imti.model.CommunityInfoDetail;
import com.imti.service.CommunityService;
import com.imti.util.DateUtil;

/**@�ļ���: CommunityServiceImpl.java
 * @�๦��˵��: С����ϢService��ʵ����
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��14������9:05:17
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��14������9:05:17</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class CommunityServiceImpl implements CommunityService{
	@Autowired
	private CommunityDao communityDao;
	@Autowired
	CommunityInfoDetailDao communityInfoDetailDao;
	/**
	 * �Ե�С����Ϣ��ѯ
	 */
	@Override
	public List<Community> findAllCommunity(Map<String,Object> map) {
		return communityDao.findAllCommunity(map);
	}
	/**
	 * �Ե�С����Ϣ��������ѯ
	 */
	@Override
	public int findAllCommunityCount(Map<String, Object> map) {
		
		return communityDao.findAllCommunityCount(map);
	}
	/**
	 * С����������
	 */
	@Override
	public int newCommunityInfo(Community community) {
		
		community.setCo_createTime(DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
		community.setCo_delflag(0);
		community.setCo_state(0);
		int result=communityDao.newCommunityInfo(community);
		CommunityInfoDetail communityInfoDetail=new CommunityInfoDetail();
		int co_id=communityDao.findAllCommunityCountMAXid();
		communityInfoDetail.setCo_id(co_id);
		communityInfoDetail.setCd_delflag(0);
		communityInfoDetail.setCd_state(0);
		communityInfoDetail.setCd_opt_id(community.getCo_opt_id());
		communityInfoDetail.setCd_createTime(DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
		if(result>0){
			result=communityInfoDetailDao.newCommunityInfoDetailDao(communityInfoDetail);
		}
		return result;
	}
	/**
	 * �Ե�С���޸�
	 */
	@Override
	public int updateCommunityInfo(Community community) {
		return communityDao.updateCommunityInfo(community);
	}
	/**
	 * �Ե�С��ɾ��
	 */
	@Override
	public int deleteCommunityInfo(String co_idss) {
		String co_id[]=co_idss.split(",");
		int result=0;
		int conut=0;
		for (int i = 0; i < co_id.length; i++) {
			result= communityDao.deleteCommunityInfo(Integer.parseInt(co_id[0]));
			if(result>0){
				conut++;
			}
		}
		return conut;

	}

}
