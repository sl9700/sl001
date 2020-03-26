package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.MaterialsManage;

import net.sf.json.JSONObject;


/**@�ļ���: MaterialsManageService.java
 * @�๦��˵��: 
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��17������9:37:47
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��17������9:37:47</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface MaterialsManageService {
	/**
	 * @������: findMaterialsManageInfo
	 * @����˵��: ���ʹ����ѯ������Ϣ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��17������9:48:34
	 * @param map
	 * @return
	 * @return: List<MaterialsManage>
	 */
	public List<MaterialsManage> findMaterialsManageInfo(Map<String,Object> map);
	/**
	 * @������: findMaterialsManageInfoCount
	 * @����˵��: ���ʹ����ѯ������
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��17������9:48:44
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findMaterialsManageInfoCount(Map<String,Object> map);
	/**
	 * @������: findMaterialsManageInfo
	 * @����˵��: ���ʹ�������
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��17������11:24:26
	 * @param materialsManage
	 * @return
	 * @return: int
	 */
	public int newMaterialsManageInfo(MaterialsManage materialsManage,EmployeeInfo employeeInfo);
	/**
	 * @������: updateMaterialsManageInfo
	 * @����˵��: ���ʹ����޸�
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��17������11:37:36
	 * @param materialsManage
	 * @return
	 * @return: int
	 */
	public int updateMaterialsManageInfo(MaterialsManage materialsManage);
	/**
	 * @������: deleteMaterialsManageInfo
	 * @����˵��: ���ʹ���ɾ��
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��17������12:01:11
	 * @param mm_id
	 * @return
	 * @return: JSONObject
	 */
	public int deleteMaterialsManageInfo(String mm_id);
}
