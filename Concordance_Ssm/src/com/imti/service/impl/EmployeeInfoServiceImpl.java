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
 * @文件名: EmployeeInfoServiceImpl.java
 * @类功能说明: 内部员工service实现类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月2日下午8:35:07
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月2日下午8:35:07</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService{
	/**
	 * 将dao接口注入ioc容器
	 */
	@Autowired
	private EmployeeInfoDao employeeInfoDao;
	/**
	 * 内部员工登陆接口service实现类
	 */
	@Override
	public EmployeeInfo login(EmployeeInfo employeeInfo) {
		return employeeInfoDao.login(employeeInfo);
	}
	/**
	 * 查找所有用户信息
	 */
	@Override
	public List<EmployeeInfo> findAllEmployeeInfo(Map<String,Object> map) {
		return employeeInfoDao.findAllEmployeeInfo(map);
	}
	/**
	 * 查找用户信息的总条数
	 */
	@Override
	public int findAllEmployeeInfoCount(Map<String,Object> map) {
		return employeeInfoDao.findAllEmployeeInfoCount(map);
	}
	/**
	 * 删除用户信息
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
	 * 验证用户名是否已存在
	 */
	@Override
	public int emAccountIsExist(Map<String, Object> map) {
		return employeeInfoDao.emAccountIsExist(map);
	}
	/**
	 * 保存用户信息
	 */
	@Override
	public int saveEmployeeInfo(EmployeeInfo employeeInfo) {
		employeeInfo.setEm_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		employeeInfo.setEm_delflag(0);
		employeeInfo.setEm_state(0);
		return employeeInfoDao.saveEmployeeInfo(employeeInfo);
	}
	/**
	 * 修改用户信息，并判断密码是否已存在
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
	 * 回收站人员的姓名的查询
	 */
	@Override
	public List<Recycleemployeeinfo> findAllNameByRemId() {
		return employeeInfoDao.findAllNameByRemId();
		
	}
}
