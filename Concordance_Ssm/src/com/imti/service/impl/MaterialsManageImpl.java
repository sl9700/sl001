package com.imti.service.impl;
/**@�ļ���: MaterialsManageImpl.java
 * @�๦��˵��: 
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��17������9:48:00
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��17������9:48:00</li> 
 *	 <li>����: </li>
 * </pre>
 */

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.MaterialsManageDao;
import com.imti.model.EmployeeInfo;
import com.imti.model.MaterialsManage;
import com.imti.service.MaterialsManageService;
import com.imti.util.DateUtil;
@Service
public class MaterialsManageImpl implements MaterialsManageService{
	@Autowired
	private MaterialsManageDao materialsManageDao;
	/**
	 * ���ʹ����ѯ
	 */
	@Override
	public List<MaterialsManage> findMaterialsManageInfo(Map<String, Object> map) {
		return materialsManageDao.findMaterialsManageInfo(map);
	}
	/**
	 * ���ʹ�����������ѯ
	 */
	@Override
	public int findMaterialsManageInfoCount(Map<String, Object> map) {
		return materialsManageDao.findMaterialsManageInfoCount(map) ;
	}
	/**
	 * ���ʹ�������
	 */
	@Override
	public int newMaterialsManageInfo(MaterialsManage materialsManage,EmployeeInfo employeeInfo) {
		materialsManage.setMm_createTime(DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
		materialsManage.setMm_delflag(0);
		materialsManage.setMm_state(0);
		materialsManage.setMm_opt_id(employeeInfo.getEm_id());
		return materialsManageDao.newMaterialsManageInfo(materialsManage);
	}
	/**
	 * ���ʹ����޸�
	 */
	@Override
	public int updateMaterialsManageInfo(MaterialsManage materialsManage) {
		
		return materialsManageDao.updateMaterialsManageInfo(materialsManage);
	}
	/**
	 * ���ʹ���ɾ��
	 */
	@Override
	public int deleteMaterialsManageInfo(String mm_idss) {
		int result=0;
		int conut=0;
		String mm_id[]=mm_idss.split(",");
		for (int i = 0; i < mm_id.length; i++) {
			result=materialsManageDao.deleteMaterialsManageInfo(Integer.parseInt(mm_id[i]));
				if(result>0){
					conut++;
				}
		}
		
		return conut;
		
		
	}

}
