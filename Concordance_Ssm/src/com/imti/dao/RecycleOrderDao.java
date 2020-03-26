package com.imti.dao;

import java.util.List;

import java.util.Map;

import com.imti.model.RecycleOrder;

/**
 * @�ļ���: RecycleOrderDao.java
 * @�๦��˵��: �������ݿ�Ľӿ�
 * @����: wangyuntian
 * @Email: 841589654@qq.com
 * @����: 2020��3��20������10:59:53
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: wangyuntian</li> 
 * 	 <li>����: 2020��3��20������10:59:53</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface RecycleOrderDao {
	/**
	 * @������: findAllRecycleOrder
	 * @����˵��: ��ѯ����վ����ȫ��
	 * @����: wangyuntian
	 * @���䣺841589654@qq.com
	 * @����: 2020��3��20������11:00:01
	 * @param map
	 * @return
	 * @return: List<RecycleOrder>
	 */
	public List<RecycleOrder> findAllRecycleOrder(Map<String,Object> map);
	/**
	 * @������: findAllRecycleOrderCount
	 * @����˵��:  ��ѯ����վ������ҳ
	 * @����: wangyuntian
	 * @���䣺841589654@qq.com
	 * @����: 2020��3��20������11:00:06
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleOrderCount(Map<String, Object> map);
	/**
	 * @������: addRecycleOrder
	 * @����˵��: ���ӻ���վ����
	 * @����: wangyuntian
	 * @���䣺841589654@qq.com
	 * @����: 2020��3��20������11:00:10
	 * @param recycleOrder
	 * @return
	 * @return: int
	 */
	public int addRecycleOrder(RecycleOrder recycleOrder);
	/**
	 * @������: updateRecycleOrder
	 * @����˵��: �޸Ļ���վ����
	 * @����: wangyuntian
	 * @���䣺841589654@qq.com
	 * @����: 2020��3��20������11:00:16
	 * @param recycleOrder
	 * @return
	 * @return: int
	 */
	public int updateRecycleOrder(RecycleOrder recycleOrder);
	/**
	 * @������: deleteRecycleOrder
	 * @����˵��: ɾ������վ����
	 * @����: wangyuntian
	 * @���䣺841589654@qq.com
	 * @����: 2020��3��20������11:00:20
	 * @param rco_id
	 * @return
	 * @return: int
	 */
	public int deleteRecycleOrder(int rco_id);
}
