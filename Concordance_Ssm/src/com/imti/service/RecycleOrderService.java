package com.imti.service;

import java.util.List;

import java.util.Map;

import com.imti.model.RecycleOrder;

/**
 * @�ļ���: RecycleOrderService.java
 * @�๦��˵��: ��ѯ��Ϣ�Ľӿ�
 * @����: wangyuntian
 * @Email: 841589654@qq.com
 * @����: 2020��3��20������11:14:18
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: wangyuntian</li> 
 * 	 <li>����: 2020��3��20������11:14:18</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface RecycleOrderService {
	/**
	 * @������: findAllRecycleOrder
	 * @����˵��: ��ѯ����վ����ȫ�� 
	 * @����: wangyuntian
	 * @���䣺841589654@qq.com
	 * @����: 2020��3��20������11:23:18
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
	 * @����: 2020��3��20������11:23:22
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleOrderCount(Map<String,Object> map);
	/**
	 * @������: addRecycleOrder
	 * @����˵��:  ���ӻ���վ����
	 * @����: wangyuntian
	 * @���䣺841589654@qq.com
	 * @����: 2020��3��20������11:23:32
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
	 * @����: 2020��3��20������11:23:36
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
	 * @����: 2020��3��20������11:23:41
	 * @param rcoIds
	 * @return
	 * @return: int
	 */
	public int deleteRecycleOrder(String rcoIds);
	
}
