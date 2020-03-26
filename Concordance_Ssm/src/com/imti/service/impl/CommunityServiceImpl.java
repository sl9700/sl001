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

/**@文件名: CommunityServiceImpl.java
 * @类功能说明: 小区信息Service层实现类
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月14日上午9:05:17
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月14日上午9:05:17</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class CommunityServiceImpl implements CommunityService{
	@Autowired
	private CommunityDao communityDao;
	@Autowired
	CommunityInfoDetailDao communityInfoDetailDao;
	/**
	 * 试点小区信息查询
	 */
	@Override
	public List<Community> findAllCommunity(Map<String,Object> map) {
		return communityDao.findAllCommunity(map);
	}
	/**
	 * 试点小区信息总条数查询
	 */
	@Override
	public int findAllCommunityCount(Map<String, Object> map) {
		
		return communityDao.findAllCommunityCount(map);
	}
	/**
	 * 小区管理新增
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
	 * 试点小区修改
	 */
	@Override
	public int updateCommunityInfo(Community community) {
		return communityDao.updateCommunityInfo(community);
	}
	/**
	 * 试点小区删除
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
