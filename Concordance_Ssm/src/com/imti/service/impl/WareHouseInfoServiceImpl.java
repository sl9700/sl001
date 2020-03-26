package com.imti.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.WareHouseInfoDao;
import com.imti.model.Productinfo;
import com.imti.service.WareHouseInfoService;
import com.imti.util.DateUtil;

/**
 * @�ļ���: WareHouseInfoServiceImpl.java
 * @�๦��˵��: 
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��18������7:06:55
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��18������7:06:55</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class WareHouseInfoServiceImpl implements WareHouseInfoService{
	/**
	 * �������վ������Dao�ӿ�
	 */
	@Autowired
	private WareHouseInfoDao wareHouseInfoDao;
	/**
	 * ��ѯ����վ������������Ϣ����չʾ
	 */
	@Override
	public List<Productinfo> findAllWareHouseInfo(Map<String, Object> map) {
		return wareHouseInfoDao.findAllWareHouseInfo(map);
	}
	/**
	 * ��ѯ����վ������������Ϣ�������������ڷ�ҳ
	 */
	@Override
	public int findAllWareHouseInfoCount(Map<String, Object> map) {
		return wareHouseInfoDao.findAllWareHouseInfoCount(map);
	}
	/**
	 * ����µ������Ϣ��serviceʵ����
	 */
	@Override
	public int addWareHouseInfo(Productinfo productinfo) {
		productinfo.setPr_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		productinfo.setPr_state(0);
		productinfo.setPr_delflag(0);
		return wareHouseInfoDao.addWareHouseInfo(productinfo);
	}
	/**
	 * �޸������Ϣ��service���Ʋ�
	 */
	@Override
	public int updateWareHouseInfo(Productinfo productinfo) {
		productinfo.setPr_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		productinfo.setPr_delflag(0);
		productinfo.setPr_state(0);
		return wareHouseInfoDao.updateWareHouseInfo(productinfo);
	}
	/**
	 * ɾ�������Ϣ��service���Ʋ�
	 */
	@Override
	public int deleteWareHouseInfo(String pr_idss) {
		String prIds[] = pr_idss.split(",");
		int result = 0;
		int count = 0;
		for(int i=0;i<prIds.length;i++){
			result = wareHouseInfoDao.deleteWareHouseInfo(Integer.parseInt(prIds[i]));
			if(result>0){
				count++;
			}
		}
		return count;
	}
}
