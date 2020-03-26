package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.Recyclematerials;

/**
 * @�ļ���: MaterialsService.java
 * @�๦��˵��: ���ʹ����service�ӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��14������8:50:43
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��14������8:50:43</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface MaterialsService {
	/**
	 * @������: findAllmaterialsInfo
	 * @����˵��: ��ѯ���ʱ�������Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��14������8:55:38
	 * @param map
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllMaterialsInfo(Map<String,Object> map);
	/**
	 * @������: findAllmaterialsInfoCount
	 * @����˵��: ��ѯ���ʱ���δ��ɾ���������������ڷ�ҳ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��14������8:56:17
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllMaterialsInfoCount(Map<String,Object> map);
	/**
	 * @������: deleteMaterialsInfo
	 * @����˵��: ɾ������վ���ʵ�service��ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��15������11:20:41
	 * @param em_idss
	 * @return
	 * @return: int
	 */
	public int deleteMaterialsInfo(String rm_idss);
	/**
	 * @������: saveMaterialsInfo
	 * @����˵��: �������վ���ʵķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��15������2:51:23
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
	 * @����: 2020��3��15������2:51:26
	 * @param recyclematerials
	 * @return
	 * @return: int
	 */
	public int updateMaterialsInfo(Recyclematerials recyclematerials);
	/**
	 * @������: findAllNameRmId
	 * @����˵��: �����������ֵĲ�ѯ�������������չʾ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������2:15:03
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllNameRmId();
	
	
}
