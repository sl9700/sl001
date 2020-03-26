package com.imti.service.impl;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imti.dao.MaterialTypeDao;
import com.imti.dao.MaterialsManageDao;
import com.imti.model.EmployeeInfo;
import com.imti.model.MaterialType;
import com.imti.model.MaterialsManage;
import com.imti.service.MaterialTypeService;
import com.imti.util.DateUtil;

/**@�ļ���: MaterialTypeServiceImpl.java
 * @�๦��˵��: 
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��15������2:23:02
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��15������2:23:02</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class MaterialTypeServiceImpl implements MaterialTypeService{
	@Autowired
	MaterialTypeDao materialTypeDao;
	/**
	 * ���ʹ����ѯ������Ϣ
	 */
	@Override
	public List<MaterialType> findAllmaterialType(Map<String, Object> map) {
		return materialTypeDao.findAllmaterialType(map);
	}
	@Override
	public int findAllmaterialTypeCount(Map<String, Object> map) {
		return materialTypeDao.findAllmaterialTypeCount(map);
	}
	/**
	 * ������������
	 */
	@Override
	public int newmaterialTypeInfo(MaterialType materialType, EmployeeInfo employeeInfo) {
		materialType.setMt_createTime(DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
		materialType.setMt_delflag(0);
		materialType.setMt_state(0);
		materialType.setMt_opt_id(employeeInfo.getEm_id());
		int mtResult= materialTypeDao.newmaterialTypeInfo(materialType);
		return mtResult;
	}
	/**
	 * ���������޸�
	 */
	@Override
	public int updatematerialType(MaterialType materialType) {
		
		return materialTypeDao.updatematerialType(materialType);
	}
	/**
	 *  ��������ɾ��
	 */
	@Override
	public int deletematerialTypeInfo(String mt_idss) {
		String mt_ids[]=mt_idss.split(",");
		int result=0;
		int conut=0;
		for (String mt_id : mt_ids) {
			result=materialTypeDao.deletematerialTypeInfo(Integer.parseInt(mt_id));
			if(result>0){
				conut++;	
			} 
		}
		return conut;
	}
}
