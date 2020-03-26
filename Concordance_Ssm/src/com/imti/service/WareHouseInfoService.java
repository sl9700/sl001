package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.Productinfo;

/**
 * @�ļ���: WareHouseInfoService.java
 * @�๦��˵��: ����վ���������service��ӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��18������7:04:55
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��18������7:04:55</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface WareHouseInfoService {
	
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
	 * @����˵��: ����µĳ������Ϣ��service�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������9:20:55
	 * @param productinfo
	 * @return
	 * @return: int
	 */
	public int addWareHouseInfo(Productinfo productinfo);
	/**
	 * @������: updateWareHouseInfo
	 * @����˵��: �޸Ļ���վ������service�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������9:40:57
	 * @param productinfo
	 * @return
	 * @return: int
	 */
	public int updateWareHouseInfo(Productinfo productinfo);
	/**
	 * @������: deleteWareHouseInfo
	 * @����˵��: ɾ������վ������service�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������9:41:00
	 * @param pr_idss
	 * @return
	 * @return: int
	 */
	public int deleteWareHouseInfo(String pr_idss);
	
}
