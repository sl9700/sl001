package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.RoleInfo;

/**
 * @文件名: RoleInfoDao.java
 * @类功能说明: 角色信息的Dao接口
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月4日上午10:50:51
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月4日上午10:50:51</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface RoleInfoDao {
	/**
	 * @方法名: findMenuIdsByRoleId
	 * @方法说明: 查找所有菜单通过角色id
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:06:31
	 * @param roleId
	 * @return
	 * @return: String
	 */
	public String findMenuIdsByRoleId(int roleId);
	/**
	 * @方法名: findAllRoleInfo
	 * @方法说明: 查找所有菜单信息用于展示
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:07:11
	 * @param map
	 * @return
	 * @return: List<RoleInfo>
	 */
	public List<RoleInfo> findAllRoleInfo(Map<String,Object> map);
	/**
	 * @方法名: findAllRoleInfoCount
	 * @方法说明: 查找所有菜单信息的行数用于分页
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:07:41
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRoleInfoCount(Map<String,Object> map);
	/**
	 * @方法名: emRoleNameIsExist
	 * @方法说明: 光标移开验证角色信息是否存在
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:08:10
	 * @param map
	 * @return
	 * @return: int
	 */
	public int emRoleNameIsExist(Map<String,Object> map);
	/**
	 * @方法名: saveRoleInfo
	 * @方法说明: 修改与新增的保存方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:08:54
	 * @param roleInfo
	 * @return
	 * @return: int
	 */
	public int saveRoleInfo(RoleInfo roleInfo);
	/**
	 * @方法名: updateRoleInfo
	 * @方法说明: 修改角色信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:09:21
	 * @param roleInfo
	 * @return
	 * @return: int
	 */
	public int updateRoleInfo(RoleInfo roleInfo);
	/**
	 * @方法名: deleteRoleInfo
	 * @方法说明: 删除角色信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:09:35
	 * @param ro_id
	 * @return
	 * @return: int
	 */
	public int deleteRoleInfo(int ro_id);
	/**
	 * @方法名: roldIsUse
	 * @方法说明: 新增或修改员工信息时的角色修改
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:09:46
	 * @param ro_id
	 * @return
	 * @return: List<String>
	 */
	public List<String> roldIsUse(int ro_id);
	/**
	 * @方法名: saveAuth
	 * @方法说明: 保存新的角色的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:10:42
	 * @param map
	 * @return
	 * @return: int
	 */
	public int saveAuth(Map<String,Object> map);
	
}
