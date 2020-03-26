package com.imti.dao;
/**@�ļ���: MaterialsManageDao.java
 * @�๦��˵��: ���ʹ�����������
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��15������2:46:03
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��15������2:46:03</li> 
 *	 <li>����: </li>
 * </pre>
 */

import java.util.List;
import java.util.Map;

import com.imti.model.MaterialsManage;

public interface MaterialsManageDao {
	/**
	 * @������: findmaterialsManage
	 * @����˵��: ���ʹ����ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��15������2:50:49
	 * @param mt_id
	 * @return
	 * @return: List<MaterialsManage>
	 */
public List<MaterialsManage> findMaterialsManageInfo(Map<String, Object> map);
/**
 * @������: newmaterialsManageInfo
 * @����˵��: ������������
 * @����: ShiLei
 * @���䣺2997426050@qq.com
 * @����: 2020��3��16������12:20:34
 * @param materialsManage
 * @return
 * @return: int
 */
public int newmaterialsManageInfo(MaterialsManage materialsManage);
/**
 * @������: findMaterialsManageInfoCount
 * @����˵��: ���ʹ�����������ѯ
 * @����: ShiLei
 * @���䣺2997426050@qq.com
 * @����: 2020��3��17������9:54:11
 * @param map
 * @return
 * @return: int
 */
public int findMaterialsManageInfoCount(Map<String, Object> map);
/**
 * @������: findMaterialsManageInfo
 * @����˵��: ���ʹ�������
 * @����: ShiLei
 * @���䣺2997426050@qq.com
 * @����: 2020��3��17������11:25:47
 * @param materialsManage
 * @return
 * @return: int
 */
public int newMaterialsManageInfo(MaterialsManage materialsManage);
/**
 * @������: updateMaterialsManageInfo
 * @����˵��: ���ʹ����޸�
 * @����: ShiLei
 * @���䣺2997426050@qq.com
 * @����: 2020��3��17������11:39:00
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
 * @����: 2020��3��17������12:02:22
 * @param mm_id
 * @return
 * @return: int
 */
public int deleteMaterialsManageInfo(int mm_id);
}
