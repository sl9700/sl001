package com.imti.service;

import java.util.List;

import com.imti.model.MenuInfo;

import net.sf.json.JSONArray;

/**
 * @文件名: MenuInfoService.java
 * @类功能说明: 菜单信息service接口层
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月3日下午8:30:30
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月3日下午8:30:30</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface MenuInfoService {
	/**
	 * @方法名: findMenuInfoByRole
	 * @方法说明: 根据不同的用户查询不同的菜单信息，登陆之后的不同菜单信息。
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月3日下午8:42:28
	 * @return
	 * @return: List<MenuInfo>
	 */
	public JSONArray findMenuInfoByRole(String prentId,List<Integer> menuIds);
	/**
	 * @方法名: findAllMenuInfo
	 * @方法说明: 查找所有菜单信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:28:58
	 * @param mn_parent
	 * @param menuIds
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray findAllMenuInfo(int mn_parent,String menuIds);
	/**
	 * @方法名: findAllMenuInfoForEdit
	 * @方法说明: 角色授权时为角色新增菜单信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:29:17
	 * @param mn_parent
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray findAllMenuInfoForEdit(int mn_parent);
	/**
	 * @方法名: addMenuInfo
	 * @方法说明: 添加菜单信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:30:31
	 * @param menuInfo
	 * @return
	 * @return: int
	 */
	public int addMenuInfo(MenuInfo menuInfo);
	/**
	 * @方法名: deleteMenuInfo
	 * @方法说明: 删除菜单信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:30:45
	 * @param mn_id
	 * @return
	 * @return: int
	 */
	public int deleteMenuInfo(int mn_id);
	/**
	 * @方法名: updateMenuInfo
	 * @方法说明: 修改菜单信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:30:54
	 * @param menuInfo
	 * @return
	 * @return: int
	 */
	public int updateMenuInfo(MenuInfo menuInfo);
}
