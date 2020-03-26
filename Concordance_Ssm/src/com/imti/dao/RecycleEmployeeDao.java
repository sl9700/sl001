package com.imti.dao;

import java.util.List;

import com.imti.model.Recycleemployeeinfo;

	/**
	 * @�ļ���: RecycleEmployeeDao.java
	 * @�๦��˵��: ����վ��Ա��Ϣ�Ľӿ�
	 * @����: YangZhiYuan
	 * @Email: 982206231@qq.com
	 * @����: 2020��3��16������6:51:02
	 * @�޸�˵��:<br> 
	 * <pre>
	 * 	 <li>����: YangZhiYuan</li> 
	 * 	 <li>����: 2020��3��16������6:51:02</li> 
	 *	 <li>����: </li>
	 * </pre>
	 */
	public interface RecycleEmployeeDao {
	/**
	 * @������: findRecycleEmployeeInfoByReId
	 * @����˵��: ���ڲ�ѯ�����վ��صĻ���վ��Ա��Ϣ��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��16������6:52:37
	 * @param re_id
	 * @return
	 * @return: List<Recycleemployeeinfo>
	 */
	public List<Recycleemployeeinfo> findRecycleEmployeeInfoByReId(int re_id);
	
}
