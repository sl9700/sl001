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
 * @文件名: RoleInfoServiceImpl.java
 * @类功能说明: 角色信息的service接口实现类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月4日上午10:58:47
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月4日上午10:58:47</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService{
	/**
	 * 将角色dao接口注入ioc容器
	 */
	@Autowired
	private RoleInfoDao roleInfoDao;
	/**
	 * 登陆时的菜单信息展示
	 */
	@Override
	public String findMenuIdByRoleId(int roleId) {
		return roleInfoDao.findMenuIdsByRoleId(roleId);
	}
	/**
	 * 对角色信息增删改查时的角色信息的展示
	 */
	@Override
	public List<RoleInfo> findAllRoleInfo(Map<String, Object> map) {
		return roleInfoDao.findAllRoleInfo(map);
	}
	/**
	 * 角色信息的总条数，用于分页
	 */
	@Override
	public int findAllRoleInfoCount(Map<String, Object> map) {
		return roleInfoDao.findAllRoleInfoCount(map);
	}
	/**
	 * 查看角色名称是否已存在
	 */
	@Override
	public int emRoleNameIsExist(Map<String, Object> map) {
		return roleInfoDao.emRoleNameIsExist(map);
	}
	/**
	 * 保存角色信息
	 */
	@Override
	public int saveRoleInfo(RoleInfo roleInfo) {
		roleInfo.setRo_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		roleInfo.setRo_delflag(0);
		roleInfo.setRo_state(0);
		return roleInfoDao.saveRoleInfo(roleInfo);
	}
	/**
	 * 修改角色信息
	 */
	@Override
	public int updateRoleInfo(RoleInfo roleInfo) {
		return roleInfoDao.updateRoleInfo(roleInfo);
	}
	/**
	 * 删除角色信息
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
	 * 新增用户时的角色信息的展示
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
	 * 保存赋予的新角色
	 */
	@Override
	public int saveAuth(Map<String, Object> map) {
		return roleInfoDao.saveAuth(map);
	}

}
