package com.imti.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.RoleInfoDao;
import com.imti.model.RoleInfo;
import com.imti.service.RoleInfoService;
import com.imti.util.DateUtil;

/**
 * @�ļ���: RoleInfoServiceImpl.java
 * @�๦��˵��: ��ɫ��Ϣ��service�ӿ�ʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��4������10:58:47
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��4������10:58:47</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService{
	/**
	 * ����ɫdao�ӿ�ע��ioc����
	 */
	@Autowired
	private RoleInfoDao roleInfoDao;
	/**
	 * ��½ʱ�Ĳ˵���Ϣչʾ
	 */
	@Override
	public String findMenuIdByRoleId(int roleId) {
		return roleInfoDao.findMenuIdsByRoleId(roleId);
	}
	/**
	 * �Խ�ɫ��Ϣ��ɾ�Ĳ�ʱ�Ľ�ɫ��Ϣ��չʾ
	 */
	@Override
	public List<RoleInfo> findAllRoleInfo(Map<String, Object> map) {
		return roleInfoDao.findAllRoleInfo(map);
	}
	/**
	 * ��ɫ��Ϣ�������������ڷ�ҳ
	 */
	@Override
	public int findAllRoleInfoCount(Map<String, Object> map) {
		return roleInfoDao.findAllRoleInfoCount(map);
	}
	/**
	 * �鿴��ɫ�����Ƿ��Ѵ���
	 */
	@Override
	public int emRoleNameIsExist(Map<String, Object> map) {
		return roleInfoDao.emRoleNameIsExist(map);
	}
	/**
	 * �����ɫ��Ϣ
	 */
	@Override
	public int saveRoleInfo(RoleInfo roleInfo) {
		roleInfo.setRo_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		roleInfo.setRo_delflag(0);
		roleInfo.setRo_state(0);
		return roleInfoDao.saveRoleInfo(roleInfo);
	}
	/**
	 * �޸Ľ�ɫ��Ϣ
	 */
	@Override
	public int updateRoleInfo(RoleInfo roleInfo) {
		return roleInfoDao.updateRoleInfo(roleInfo);
	}
	/**
	 * ɾ����ɫ��Ϣ
	 */
	@Override
	public int deleteRoleInfo(String ro_idss) {
		String orIds[] = ro_idss.split(",");
		int count = 0;
		int result = 0;
		for(int i = 0;i<orIds.length;i++){
			result = roleInfoDao.deleteRoleInfo(Integer.parseInt(orIds[i]));
			if(result>0){
				count++;
			}
		}
		return count;
	}
	/**
	 * �����û�ʱ�Ľ�ɫ��Ϣ��չʾ
	 */
	@Override
	public List<String> roldIsUse(String ro_ids) {
		List<String> roleNames = new ArrayList<String>();
		String roIds[] = ro_ids.split(",");
		for(int i = 0;i < roIds.length;i++){
			List<String> roleNameList = roleInfoDao.roldIsUse(Integer.parseInt(roIds[i]));
			if(roleNameList.size()>0){
				roleNames.add(roleNameList.get(0));
			}
		}
		return roleNames;
	}
	/**
	 * ���渳����½�ɫ
	 */
	@Override
	public int saveAuth(Map<String, Object> map) {
		return roleInfoDao.saveAuth(map);
	}

}
