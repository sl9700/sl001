package com.imti.service.impl;
/**@文件名: MaterialsManageImpl.java
 * @类功能说明: 
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月17日上午9:48:00
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月17日上午9:48:00</li> 
 *	 <li>内容: </li>
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
	 * 物资管理查询
	 */
	@Override
	public List<MaterialsManage> findMaterialsManageInfo(Map<String, Object> map) {
		return materialsManageDao.findMaterialsManageInfo(map);
	}
	/**
	 * 物资管理总条数查询
	 */
	@Override
	public int findMaterialsManageInfoCount(Map<String, Object> map) {
		return materialsManageDao.findMaterialsManageInfoCount(map) ;
	}
	/**
	 * 物资管理新增
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
	 * 物资管理修改
	 */
	@Override
	public int updateMaterialsManageInfo(MaterialsManage materialsManage) {
		
		return materialsManageDao.updateMaterialsManageInfo(materialsManage);
	}
	/**
	 * 物资管理删除
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
