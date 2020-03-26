package com.imti.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.MenuInfoDao;
import com.imti.model.MenuInfo;
import com.imti.service.MenuInfoService;
import com.imti.util.DateUtil;
import com.imti.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @文件名: MenuInfoServiceImpl.java
 * @类功能说明: 菜单信息service接口实现类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月3日下午8:43:32
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月3日下午8:43:32</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class MenuInfoServiceImpl implements MenuInfoService{
	/**
	 * 将菜单的dao接口注入ioc容器
	 */
	@Autowired
	private MenuInfoDao menuInfoDao;
	/**
	 * 查找菜单信息通过角色
	 */
	@Override
	public JSONArray findMenuInfoByRole(String prentId,List<Integer> menuIds) {
		JSONArray jsonArray = this.getMenuInfoByRole(prentId, menuIds);
		/* 递归 */
		for(int i=0;i<jsonArray.size();i++){
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			/* 判断当前节点状态 */
			if("open".equals(jsonObject.getString("state"))){
				continue;
			}else{
				jsonObject.put("children", findMenuInfoByRole(jsonObject.getInt("id")+"",menuIds));
			}
		}
		return jsonArray;
	}
	/**
	 * @方法名: getMenuInfoByRole
	 * @方法说明: 通过递归找到当前用户的菜单信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:45:58
	 * @param prentId
	 * @param menuIds
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray getMenuInfoByRole(String prentId,List<Integer> menuIds){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("prentId", prentId);
		map.put("menuIds", menuIds);
		/* 获取表中对应的数据 */
		List<MenuInfo> menuList = menuInfoDao.findMenuInfoByRole(map);
		JSONArray jsonArray = new JSONArray();
		for(int i=0;i<menuList.size();i++){
			MenuInfo menuInfo = menuList.get(i);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", menuInfo.getMn_id());
			jsonObject.put("text", menuInfo.getMn_menuName());
			if(hasChildren(menuInfo.getMn_id(),menuIds)){
				jsonObject.put("state", menuInfo.getMn_son());
			}else {
				jsonObject.put("state", "open");
			}
			jsonObject.put("state", menuInfo.getMn_son());
			jsonObject.put("iconCls", menuInfo.getMn_iconCls());
			JSONObject url = new JSONObject();
			url.put("url", menuInfo.getMn_path());
			jsonObject.put("attributes", url);
			jsonObject.put("mn_parent", menuInfo.getMn_parent());
			jsonObject.put("mn_createTime", menuInfo.getMn_createTime());
			jsonObject.put("mn_remark", menuInfo.getMn_remark());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	/**
	 * 递归，找寻所有菜单信息
	 */
	@Override
	public JSONArray findAllMenuInfo(int mn_parent,String menuIds) {
		JSONArray jsonArray = this.getAllMenuInfo(mn_parent,menuIds);
		for(int i = 0;i < jsonArray.size();i++){
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			if("open".equals(jsonObject.getString("state"))){
				continue;
			}else {
				jsonObject.put("children", findAllMenuInfo(jsonObject.getInt("id"),menuIds));
			}
		}
		return jsonArray;
	}
	/**
	 * @方法名: hasChildren
	 * @方法说明: 获取子节点，解决状态为close却没有子节点的死循环问题
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月8日下午5:06:40
	 * @param mn_parent
	 * @return 布尔类型
	 * @return: boolean
	 */
	public boolean hasChildren(int mn_parent,List<Integer> menuIds){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mn_parent", mn_parent);
		map.put("menuIds", menuIds);
		int count = menuInfoDao.hasChildren(map);
		if(count > 0){
			return true;
		}else {
			return false;
		}
	}
	/**
	 * @方法名: getAllMenuInfo
	 * @方法说明: 获取所有菜单信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:58:15
	 * @param mn_parent
	 * @param menuIds
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray getAllMenuInfo(int mn_parent,String menuIds){
		List<MenuInfo> menuList = menuInfoDao.findAllMenuInfo(mn_parent);
		JSONArray jsonArray = new JSONArray();
		for(int i=0;i<menuList.size();i++){
			MenuInfo menuInfo = menuList.get(i);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", menuInfo.getMn_id());
			jsonObject.put("text", menuInfo.getMn_menuName());
			jsonObject.put("state", menuInfo.getMn_son());
			jsonObject.put("iconCls", menuInfo.getMn_iconCls());
			/* 角色菜单信息的数据回显，不走数据库 */
			if(StringUtil.existStrArr(menuInfo.getMn_id()+"", menuIds.split(","))){
				jsonObject.put("checked", true);
			}
			JSONObject url = new JSONObject();
			url.put("url", menuInfo.getMn_path());
			jsonObject.put("attributes", url);
			jsonObject.put("mn_parent", menuInfo.getMn_parent());
			jsonObject.put("mn_createTime", menuInfo.getMn_createTime());
			jsonObject.put("mn_remark", menuInfo.getMn_remark());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	/**
	 * 角色授权时为角色新增菜单信息的方法
	 */
	@Override
	public JSONArray findAllMenuInfoForEdit(int mn_parent) {
		JSONArray jsonArray = this.getAllMenuInfoForEdit(mn_parent);
		for(int i = 0;i < jsonArray.size();i++){
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			if("open".equals(jsonObject.getString("mn_son"))){
				continue;
			}else {
				jsonObject.put("children", findAllMenuInfoForEdit(jsonObject.getInt("mn_id")));
			}
		}
		return jsonArray;
	}
	

	/**
	 * @方法名: getAllMenuInfoForEdit
	 * @方法说明: 角色授权时为角色新增菜单信息的方法，获取菜单信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午5:00:50
	 * @param mn_parent
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray getAllMenuInfoForEdit(int mn_parent){
		List<MenuInfo> menuList = menuInfoDao.findAllMenuInfo(mn_parent);
		JSONArray jsonArray = new JSONArray();
		for(int i=0;i<menuList.size();i++){
			MenuInfo menuInfo = menuList.get(i);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("mn_id", menuInfo.getMn_id());
			jsonObject.put("mn_menuName", menuInfo.getMn_menuName());
			jsonObject.put("mn_son", menuInfo.getMn_son());
			jsonObject.put("mn_iconCls", menuInfo.getMn_iconCls());
			jsonObject.put("mn_path", menuInfo.getMn_path());
			jsonObject.put("mn_parent", menuInfo.getMn_parent());
			jsonObject.put("mn_createTime", menuInfo.getMn_createTime());
			jsonObject.put("mn_remark", menuInfo.getMn_remark());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	/**
	 * 添加菜单信息
	 */
	@Override
	public int addMenuInfo(MenuInfo menuInfo) {
		int updateParent = menuInfoDao.updateParentMenuInfo(menuInfo.getMn_parent());
		int result = 0;
		if(updateParent > 0){
			menuInfo.setMn_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
			menuInfo.setMn_delflag(0);
			menuInfo.setMn_son("open");
			menuInfo.setMn_state(0);
			result = menuInfoDao.addMenuInfo(menuInfo);
		}
		return result;
	}
	/**
	 * 删除菜单信息
	 */
	@Override
	public int deleteMenuInfo(int mn_id) {
		return menuInfoDao.deleteMenuInfo(mn_id);
	}
	/**
	 * 修改菜单信息
	 */
	@Override
	public int updateMenuInfo(MenuInfo menuInfo) {
		menuInfo.setMn_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		menuInfo.setMn_delflag(0);
		menuInfo.setMn_state(0);
		return menuInfoDao.updateMenuInfo(menuInfo);
	}
}