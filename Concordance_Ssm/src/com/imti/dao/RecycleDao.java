package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.Recycle;
import com.imti.model.Recyclematerials;

/**
 * @�ļ���: RecycleDao.java
 * @�๦��˵��: ����վ��ϢDao�ӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��16������10:19:01
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��16������10:19:01</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface RecycleDao {
	/**
	 * @������: findAllRecycle
	 * @����˵��: ��ѯ���л���վ��Ϣ����չʾ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��16������10:24:30
	 * @param map
	 * @return
	 * @return: List<Recycle>
	 */
	public List<Recycle> findAllRecycle(Map<String,Object> map);
	/**
	 * @������: findAllRecycleCount
	 * @����˵��: ��ѯ���л���վ��Ϣ�����������ڷ�ҳ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��16������10:24:32
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleCount(Map<String,Object> map);
	/**
	 * @������: addRecycleInfo
	 * @����˵��: ��ӻ���վ��Ϣ��Dao��ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������9:30:53
	 * @param recycle
	 * @return
	 * @return: int
	 */
	public int addRecycleInfo(Recycle recycle);
	/**
	 * @������: getRecycleMaxId
	 * @����˵��: ��ȡĿǰ�������������������������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������9:31:22
	 * @return
	 * @return: int
	 */
	public int getRecycleMaxId();
	/**
	 * @������: deleteRecycleInfo
	 * @����˵��: ɾ������վ������Ϣ��Dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������4:08:42
	 * @param re_id
	 * @return
	 * @return: int
	 */
	public int deleteRecycleInfo(int re_id);
	/**
	 * @������: findAllNameByRecycle
	 * @����˵��: ����վ�������������б��չʾ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������5:08:20
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllNameByRecycle();
	/**
	 * @������: updateRecycleInfo
	 * @����˵��: �޸Ļ���վ������Ϣ��dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������11:52:39
	 * @param recycle
	 * @return
	 * @return: int
	 */
	public int updateRecycleInfo(Recycle recycle);
	
}
