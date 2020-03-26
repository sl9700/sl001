package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.RoleInfo;

/**
 * @文件名: RoleInfoService.java
 * @类功能说明: 角色信息的service接口
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月4日上午10:58:16
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月4日上午10:58:16</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface RoleInfoService {
	/**
	 * @方法名: findMenuIdByRoleId
	 * @方法说明: 通过角色id查找菜单
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:32:28
	 * @param roleId
	 * @return
	 * @return: String
	 */
	public String findMenuIdByRoleId(int roleId);
	/**
	 * @方法名: findAllRoleInfo
	 * @方法说明: 查找所有角色信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:32:57
	 * @param map
	 * @return
	 * @return: List<RoleInfo>
	 */
	public List<RoleInfo> findAllRoleInfo(Map<String,Object> map);
	/**
	 * @方法名: findAllRoleInfoCount
	 * @方法说明: 查找所有角色信息的行数用于分页
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:33:24
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRoleInfoCount(Map<String,Object> map);
	/**
	 * @方法名: emRoleNameIsExist
	 * @方法说明: 查找角色名是否已存在
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:33:53
	 * @param map
	 * @return
	 * @return: int
	 */
	public int emRoleNameIsExist(Map<String,Object> map);
	/**
	 * @方法名: saveRoleInfo
	 * @方法说明: 保存角色信息的按钮相关方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:34:20
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
	 * @日期: 2020年3月9日下午4:34:40
	 * @param roleInfo
	 * @return
	 * @return: int
	 */
	public int updateRoleInfo(RoleInfo roleInfo);
	/**
	 * @方法名: deleteRoleInfo
	 * @方法说明: 删除角色信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:34:55
	 * @param ro_idss
	 * @return
	 * @return: int
	 */
	public int deleteRoleInfo(String ro_idss);
	/**
	 * @方法名: roldIsUse
	 * @方法说明: 赋予角色时的选择框
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:35:12
	 * @param ro_ids
	 * @return
	 * @return: List<String>
	 */
	public List<String> roldIsUse(String ro_ids);
	/**
	 * @方法名: saveAuth
	 * @方法说明: 赋予角色的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:35:39
	 * @param map
	 * @return
	 * @return: int
	 */
	public int saveAuth(Map<String,Object> map);
	
}
