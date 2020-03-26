package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.Recyclematerials;

/**
 * @�ļ���: MaterialsDao.java
 * @�๦��˵��: 
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��14������9:06:07
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��14������9:06:07</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface MaterialsDao {
	/**
	 * @������: findAllmaterialsInfo
	 * @����˵��: ��ѯ���ʱ��е���������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��14������9:07:55
	 * @param map
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllMaterialsInfo(Map<String,Object> map);
	/**
	 * @������: findAllmaterialsInfoCount
	 * @����˵��: ��ѯ���ʱ��е��������ݵ������������ڷ�ҳ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��14������9:08:13
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllMaterialsInfoCount(Map<String,Object> map);
	/**
	 * @������: deleteMaterialsInfo
	 * @����˵��: ɾ������վ������Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��15������11:25:00
	 * @param rm_idss
	 * @return
	 * @return: int
	 */
	public int deleteMaterialsInfo(int rm_id);
	/**
	 * @������: saveMaterialsInfo
	 * @����˵��: �������վ���ʵ�dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��15������2:01:50
	 * @param recyclematerials
	 * @return
	 * @return: int
	 */
	public int saveMaterialsInfo(Recyclematerials recyclematerials);
	/**
	 * @������: updateMaterialsInfo
	 * @����˵��: �޸Ļ���վ������Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��15������2:53:34
	 * @param recyclematerials
	 * @return
	 * @return: int
	 */
	public int updateMaterialsInfo(Recyclematerials recyclematerials);
	/**
	 * @������: findAllNameRmId
	 * @����˵��: ��ѯ���л���վ���ʵ�name����������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������2:19:44
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllNameRmId();
	
}
