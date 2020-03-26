package com.imti.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imti.model.CommunityInfoDetail;
import com.imti.dao.CommunityInfoDetailDao;
import com.imti.service.CommunityInfoDetailInfoService;

/**@文件名: CommunityInfoServiceImpl.java
 * @类功能说明: 小区信息service层实现类
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月18日上午10:23:23
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月18日上午10:23:23</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class CommunityInfoServiceImpl implements CommunityInfoDetailInfoService{
	@Autowired
	CommunityInfoDetailDao communityInfoDetailDao;
	/**
	 * 小区信息查询
	 */
	@Override
	public List<CommunityInfoDetail> CommunityInfoDetail(Map<String, Object> map) {
		
		return communityInfoDetailDao.CommunityInfoDetail(map);
	}
	/**
	 * 小区信息总条数查询
	 */
	@Override
	public int findAllCommunityInfoDetailCount() {
		return communityInfoDetailDao.findAllCommunityInfoDetailCount();
	}
	/**
	 * 小区信息修改
	 */
	@Override
	public int updateCommunityInfoDetail(CommunityInfoDetail communityInfoDetail) {
		
		return communityInfoDetailDao.updateCommunityInfoDetail(communityInfoDetail);
	}
	/**
	 * 小区信息删除
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
