package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.Productinfo;

/**
 * @�ļ���: WareHouseInfoDao.java
 * @�๦��˵��: ����վ�����Ĺ���dao�ӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��18������6:55:56
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��18������6:55:56</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface WareHouseInfoDao {
	
	/**
	 * @������: findAllWareHouseInfo
	 * @����˵��: �ҵ����л���վ�������Ϣ����չʾ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������7:02:51
	 * @param map
	 * @return
	 * @return: List<Productinfo>
	 */
	public List<Productinfo> findAllWareHouseInfo(Map<String,Object> map);
	/**
	 * @������: findAllWareHouseInfoCount
	 * @����˵��: �ҵ�����վ������Ϣ�������������ڷ�ҳ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������7:02:55
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllWareHouseInfoCount(Map<String,Object> map);
	/**
	 * @������: addWareHouseInfo
	 * @����˵��: ���������Ϣ��dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������9:24:39
	 * @param productinfo
	 * @return
	 * @return: int
	 */
	public int addWareHouseInfo(Productinfo productinfo);
	/**
	 * @������: updateWareHouseInfo
	 * @����˵��: �޸Ļ���վ�������Ϣ��dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������9:48:01
	 * @param productinfo
	 * @return
	 * @return: int
	 */
	public int updateWareHouseInfo(Productinfo productinfo);
	/**
	 * @������: deleteWareHouseInfo
	 * @����˵��: ɾ������վ�������Ϣ��dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������9:48:03
	 * @param pr_id
	 * @return
	 * @return: int
	 */
	public int deleteWareHouseInfo(int pr_id);
	
}
