package com.imti.dao;

import java.util.List;

import com.imti.model.Recyclematerials;

/**
 * @�ļ���: RecycleMaterialsDao.java
 * @�๦��˵��: ����վ���ʵ�dao�ӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��16������6:36:38
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��16������6:36:38</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface RecycleMaterialsDao {
	/**
	 * @������: findRecycleMaterialsInfoByReId
	 * @����˵��: ͨ��re_id��ѯ���л���վ���ʵ���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��16������6:40:21
	 * @param re_id
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findRecycleMaterialsInfoByReId(int re_id);
	
}
