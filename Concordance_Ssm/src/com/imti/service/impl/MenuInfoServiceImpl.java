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
 * @�ļ���: MenuInfoServiceImpl.java
 * @�๦��˵��: �˵���Ϣservice�ӿ�ʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��3������8:43:32
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��3������8:43:32</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class MenuInfoServiceImpl implements MenuInfoService{
	/**
	 * ���˵���dao�ӿ�ע��ioc����
	 */
	@Autowired
	private MenuInfoDao menuInfoDao;
	/**
	 * ���Ҳ˵���Ϣͨ����ɫ
	 */
	@Override
	public JSONArray findMenuInfoByRole(String prentId,List<Integer> menuIds) {
		JSONArray jsonArray = this.getMenuInfoByRole(prentId, menuIds);
		/* �ݹ� */
		for(int i=0;i<jsonArray.size();i++){
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			/* �жϵ�ǰ�ڵ�״̬ */
			if("open".equals(jsonObject.getString("state"))){
				continue;
			}else{
				jsonObject.put("children", findMenuInfoByRole(jsonObject.getInt("id")+"",menuIds));
			}
		}
		return jsonArray;
	}
	/**
	 * @������: getMenuInfoByRole
	 * @����˵��: ͨ���ݹ��ҵ���ǰ�û��Ĳ˵���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:45:58
	 * @param prentId
	 * @param menuIds
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray getMenuInfoByRole(String prentId,List<Integer> menuIds){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("prentId", prentId);
		map.put("menuIds", menuIds);
		/* ��ȡ���ж�Ӧ������ */
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
	 * �ݹ飬��Ѱ���в˵���Ϣ
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
	 * @������: hasChildren
	 * @����˵��: ��ȡ�ӽڵ㣬���״̬Ϊcloseȴû���ӽڵ����ѭ������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��8������5:06:40
	 * @param mn_parent
	 * @return ��������
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
	 * @������: getAllMenuInfo
	 * @����˵��: ��ȡ���в˵���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:58:15
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
			/* ��ɫ�˵���Ϣ�����ݻ��ԣ��������ݿ� */
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
	 * ��ɫ��ȨʱΪ��ɫ�����˵���Ϣ�ķ���
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
	 * @������: getAllMenuInfoForEdit
	 * @����˵��: ��ɫ��ȨʱΪ��ɫ�����˵���Ϣ�ķ�������ȡ�˵���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������5:00:50
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
	 * ��Ӳ˵���Ϣ
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
	 * ɾ���˵���Ϣ
	 */
	@Override
	public int deleteMenuInfo(int mn_id) {
		return menuInfoDao.deleteMenuInfo(mn_id);
	}
	/**
	 * �޸Ĳ˵���Ϣ
	 */
	@Override
	public int updateMenuInfo(MenuInfo menuInfo) {
		menuInfo.setMn_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		menuInfo.setMn_delflag(0);
		menuInfo.setMn_state(0);
		return menuInfoDao.updateMenuInfo(menuInfo);
	}
}