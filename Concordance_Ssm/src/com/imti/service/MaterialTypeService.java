package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.MaterialType;

import net.sf.json.JSONObject;

/**@�ļ���: MaterialTypeService.java
 * @�๦��˵��: ���ʹ���Service��ӿ�
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��15������2:17:48
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��15������2:17:48</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface MaterialTypeService {
	/**
	 * @������: findAllmaterialType
	 * @����˵��: �������Ͳ�ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��15������2:19:59
	 * @param map
	 * @return
	 * @return: List<Workbookinfo>
	 */
	public List<MaterialType> findAllmaterialType(Map<String,Object> map);
	/**
	 * @������: findAllmaterialTypeCount
	 * @����˵��: ����������������ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��15������2:21:23
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllmaterialTypeCount(Map<String,Object> map);
	/**
	 * @������: newmaterialTypeInfo
	 * @����˵��: ������������
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��16������6:28:13
	 * @param materialType
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int newmaterialTypeInfo(MaterialType materialType,EmployeeInfo employeeInfo);
	/**
	 * @������: updatematerialType
	 * @����˵��: ���������޸�
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��16������6:32:00
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
	 * @����: 2020��3��16������6:51:28
	 * @param mt_idss
	 * @return
	 * @return: int
	 */
	public int deletematerialTypeInfo(String mt_idss);
}
