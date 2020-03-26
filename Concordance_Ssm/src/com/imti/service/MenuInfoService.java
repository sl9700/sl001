package com.imti.service;

import java.util.List;

import com.imti.model.MenuInfo;

import net.sf.json.JSONArray;

/**
 * @�ļ���: MenuInfoService.java
 * @�๦��˵��: �˵���Ϣservice�ӿڲ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��3������8:30:30
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��3������8:30:30</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface MenuInfoService {
	/**
	 * @������: findMenuInfoByRole
	 * @����˵��: ���ݲ�ͬ���û���ѯ��ͬ�Ĳ˵���Ϣ����½֮��Ĳ�ͬ�˵���Ϣ��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��3������8:42:28
	 * @return
	 * @return: List<MenuInfo>
	 */
	public JSONArray findMenuInfoByRole(String prentId,List<Integer> menuIds);
	/**
	 * @������: findAllMenuInfo
	 * @����˵��: �������в˵���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:28:58
	 * @param mn_parent
	 * @param menuIds
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray findAllMenuInfo(int mn_parent,String menuIds);
	/**
	 * @������: findAllMenuInfoForEdit
	 * @����˵��: ��ɫ��ȨʱΪ��ɫ�����˵���Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:29:17
	 * @param mn_parent
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray findAllMenuInfoForEdit(int mn_parent);
	/**
	 * @������: addMenuInfo
	 * @����˵��: ��Ӳ˵���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:30:31
	 * @param menuInfo
	 * @return
	 * @return: int
	 */
	public int addMenuInfo(MenuInfo menuInfo);
	/**
	 * @������: deleteMenuInfo
	 * @����˵��: ɾ���˵���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:30:45
	 * @param mn_id
	 * @return
	 * @return: int
	 */
	public int deleteMenuInfo(int mn_id);
	/**
	 * @������: updateMenuInfo
	 * @����˵��: �޸Ĳ˵���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:30:54
	 * @param menuInfo
	 * @return
	 * @return: int
	 */
	public int updateMenuInfo(MenuInfo menuInfo);
}
