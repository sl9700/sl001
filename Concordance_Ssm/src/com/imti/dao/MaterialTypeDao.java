package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.MaterialType;

/**@�ļ���: MaterialTypeDao.java
 * @�๦��˵��: ���ʹ���Dao��
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��15������2:26:26
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��15������2:26:26</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface MaterialTypeDao {
	/**
	 * @������: findAllmaterialType
	 * @����˵��: ���ʹ����ѯ������Ϣ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��15������2:27:26
	 * @param map
	 * @return
	 * @return: List<MaterialType>
	 */
	public List<MaterialType> findAllmaterialType(Map<String, Object> map);
	/**
	 * @������: findAllmaterialTypeCount
	 * @����˵��:  ����������������ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��15������2:28:38
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllmaterialTypeCount(Map<String, Object> map);
	/**
	 * @������: newmaterialTypeInfo
	 * @����˵��: ������������
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��16������12:18:04
	 * @return
	 * @return: int
	 */
	public int newmaterialTypeInfo(MaterialType materialType);
	/**
	 * @������: updatematerialType
	 * @����˵��:  ���������޸�
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��16������6:31:08
	 * @param materialType
	 * @return
	 * @return: int
	 */
	public int updatematerialType(MaterialType materialType);
	/**
	 * @������: deletematerialTypeInfo
	 * @����˵��: ��������ɾ��
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��16������6:58:56
	 * @param mt_id
	 * @return
	 * @return: int
	 */
	public int deletematerialTypeInfo(int mt_id);
}
