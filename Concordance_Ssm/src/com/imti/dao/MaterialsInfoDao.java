package com.imti.dao;

import java.util.List;

import com.imti.model.Recyclematerials;

/**
 * @�ļ���: MaterialsInfoDao.java
 * @�๦��˵��: 
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��17������9:18:43
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��17������9:18:43</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface MaterialsInfoDao {
	/**
	 * @������: addMaterialsInfo
	 * @����˵��: ����ӱ�Ļ���վ���ʹ������Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������9:35:50
	 * @param recyclematerials
	 * @return
	 * @return: int
	 */
	public int addMaterialsInfo(Recyclematerials recyclematerials);
	/**
	 * @������: updMaterialsInfo
	 * @����˵��: �޸Ļ���վ���ʱ��dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������5:29:45
	 * @param recyclematerials
	 * @return
	 * @return: int
	 */
	public int updMaterialsInfo(Recyclematerials recyclematerials);
	
	/**
	 * @������: deleteMaterialsInfo
	 * @����˵��: ɾ������վ������Ϣ(�ӱ�)��Dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������4:09:25
	 * @param re_id
	 * @return
	 * @return: int
	 */
	public int deleteMaterialsInfo(int re_id);
	/**
	 * @������: findRecycleMaterialsInfoByReId
	 * @����˵��: ������صĻ���վ������ӱ���Ϣ���û���վ���id��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������5:32:25
	 * @param re_id
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findRecycleMaterialsInfoByReId(int re_id);
	/**
	 * @������: delMaterialsInfo
	 * @����˵��: ɾ��һ�����ӱ����ݵķ����������ӱ������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������5:54:31
	 * @param rm_id
	 * @return
	 * @return: int
	 */
	public int delMaterialsInfo(int rm_id);
	
}
