package com.imti.service;
/**
 * @�ļ���: RecycleService.java
 * @�๦��˵��: ����վ��Ϣservice��
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��16������10:11:33
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��16������10:11:33</li> 
 *	 <li>����: </li>
 * </pre>
 */

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.imti.model.EmployeeInfo;
import com.imti.model.Recycle;
import com.imti.model.Recycleemployeeinfo;
import com.imti.model.Recyclematerials;

public interface RecycleService {
	/**
	 * @������: findAllRecycle
	 * @����˵��: �������л���վ��Ϣ��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��16������10:14:33
	 * @param map
	 * @return
	 * @return: List<Recycle>
	 */
	public List<Recycle> findAllRecycle(Map<String,Object> map);
	/**
	 * @������: findAllRecycleCount
	 * @����˵��: �������л���վ��Ϣ�����������ڷ�ҳ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��16������10:15:05
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleCount(Map<String,Object> map);
	/**
	 * @������: addRecycleInfo
	 * @����˵��: ��ѯ�����й��ڻ���վ����Ϣ��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������2:14:16
	 * @param recycle
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int addRecycleInfo(Recycle recycle,EmployeeInfo employeeInfo);
	
	/**
	 * @������: deleteRecycleInfo
	 * @����˵��: ɾ���������վ��Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������4:04:01
	 * @param re_id
	 * @return
	 * @return: int
	 */
	public int deleteRecycleInfo(int re_id);
	/**
	 * @������: findAllNameByRecycle
	 * @����˵��: �������л���վ���֣����������б�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������5:05:41
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllNameByRecycle();
	/**
	 * @������: updateRecycleInfo
	 * @����˵��: ����վ��Ϣ���޸ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������8:34:54
	 * @param recycle
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int updateRecycleInfo(Recycle recycle,EmployeeInfo employeeInfo);
	
}
