package com.imti.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.EmployeeInfoDao;
import com.imti.model.EmployeeInfo;
import com.imti.model.Recycleemployeeinfo;
import com.imti.service.EmployeeInfoService;
import com.imti.util.DateUtil;
import com.imti.util.Md5;

/**
 * @�ļ���: EmployeeInfoServiceImpl.java
 * @�๦��˵��: �ڲ�Ա��serviceʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��2������8:35:07
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��2������8:35:07</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService{
	/**
	 * ��dao�ӿ�ע��ioc����
	 */
	@Autowired
	private EmployeeInfoDao employeeInfoDao;
	/**
	 * �ڲ�Ա����½�ӿ�serviceʵ����
	 */
	@Override
	public EmployeeInfo login(EmployeeInfo employeeInfo) {
		return employeeInfoDao.login(employeeInfo);
	}
	/**
	 * ���������û���Ϣ
	 */
	@Override
	public List<EmployeeInfo> findAllEmployeeInfo(Map<String,Object> map) {
		return employeeInfoDao.findAllEmployeeInfo(map);
	}
	/**
	 * �����û���Ϣ��������
	 */
	@Override
	public int findAllEmployeeInfoCount(Map<String,Object> map) {
		return employeeInfoDao.findAllEmployeeInfoCount(map);
	}
	/**
	 * ɾ���û���Ϣ
	 */
	@Override
	public int deleteEmployeeInfoById(String em_idss) {
		String emIds[] = em_idss.split(",");
		int result = 0;
		int count = 0;
		for(int i=0;i<emIds.length;i++){
			result = employeeInfoDao.deleteEmployeeInfoById(Integer.parseInt(emIds[i]));
			if(result>0){
				count++;
			}
		}
		return count;
	}
	/**
	 * ��֤�û����Ƿ��Ѵ���
	 */
	@Override
	public int emAccountIsExist(Map<String, Object> map) {
		return employeeInfoDao.emAccountIsExist(map);
	}
	/**
	 * �����û���Ϣ
	 */
	@Override
	public int saveEmployeeInfo(EmployeeInfo employeeInfo) {
		employeeInfo.setEm_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		employeeInfo.setEm_delflag(0);
		employeeInfo.setEm_state(0);
		return employeeInfoDao.saveEmployeeInfo(employeeInfo);
	}
	/**
	 * �޸��û���Ϣ�����ж������Ƿ��Ѵ���
	 */
	@Override
	public int updateEmployeeInfo(EmployeeInfo employeeInfo) {
		employeeInfo.setEm_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		employeeInfo.setEm_delflag(0);
		employeeInfo.setEm_state(0);
		String newPassword = employeeInfo.getEm_password();
		String oldPassword = employeeInfoDao.findPasswordByEmId(employeeInfo.getEm_id());
		if(newPassword.equals(oldPassword)){
			employeeInfo.setEm_password(oldPassword);
		}else {
			employeeInfo.setEm_password(Md5.MD5(newPassword));
		}
		return employeeInfoDao.updateEmployeeInfo(employeeInfo);
	}

	/**
	 * ����վ��Ա�������Ĳ�ѯ
	 */
	@Override
	public List<Recycleemployeeinfo> findAllNameByRemId() {
		return employeeInfoDao.findAllNameByRemId();
		
	}
}
