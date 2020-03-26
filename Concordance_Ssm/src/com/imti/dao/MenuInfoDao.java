package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.MenuInfo;

/**
 * @文件名: MenuInfoDao.java
 * @类功能说明: 菜单信息Dao接口类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月3日下午8:02:53
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月3日下午8:02:53</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface MenuInfoDao {
	/**
	 * @方法名: findMenuInfoByRole
	 * @方法说明: 根据当前用户所拥有的菜单获取菜单信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月3日下午8:39:32
	 * @param map
	 * @return
	 * @return: List<MenuInfo>
	 */
	public List<MenuInfo> findMenuInfoByRole(Map<String,Object> map);
	/**
	 * @方法名: findAllMenuInfo
	 * @方法说明: 查询所有菜单信息方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:00:49
	 * @param mn_parent
	 * @return
	 * @return: List<MenuInfo>
	 */
	public List<MenuInfo> findAllMenuInfo(int mn_parent);
	/**
	 * @方法名: updateParentMenuInfo
	 * @方法说明: 修改菜单信息（将open改为close）
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:01:21
	 * @param mn_id
	 * @return
	 * @return: int
	 */
	public int updateParentMenuInfo(int mn_id);
	/**
	 * @方法名: addMenuInfo
	 * @方法说明: 添加菜单信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:03:34
	 * @param menuInfo
	 * @return
	 * @return: int
	 */
	public int addMenuInfo(MenuInfo menuInfo);
	/**
	 * @方法名: hasChildren
	 * @方法说明: 查看是否有子节点
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:03:45
	 * @param map
	 * @return
	 * @return: int
	 */
	public int hasChildren(Map<String,Object> map);
	/**
	 * @方法名: deleteMenuInfo
	 * @方法说明: 删除菜单信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:04:09
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
	 * @日期: 2020年3月9日下午4:04:19
	 * @param menuInfo
	 * @return
	 * @return: int
	 */
	public int updateMenuInfo(MenuInfo menuInfo);
}
