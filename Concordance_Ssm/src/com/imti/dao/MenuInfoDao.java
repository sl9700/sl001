package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.MenuInfo;

/**
 * @�ļ���: MenuInfoDao.java
 * @�๦��˵��: �˵���ϢDao�ӿ���
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��3������8:02:53
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��3������8:02:53</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface MenuInfoDao {
	/**
	 * @������: findMenuInfoByRole
	 * @����˵��: ���ݵ�ǰ�û���ӵ�еĲ˵���ȡ�˵���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��3������8:39:32
	 * @param map
	 * @return
	 * @return: List<MenuInfo>
	 */
	public List<MenuInfo> findMenuInfoByRole(Map<String,Object> map);
	/**
	 * @������: findAllMenuInfo
	 * @����˵��: ��ѯ���в˵���Ϣ����
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:00:49
	 * @param mn_parent
	 * @return
	 * @return: List<MenuInfo>
	 */
	public List<MenuInfo> findAllMenuInfo(int mn_parent);
	/**
	 * @������: updateParentMenuInfo
	 * @����˵��: �޸Ĳ˵���Ϣ����open��Ϊclose��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:01:21
	 * @param mn_id
	 * @return
	 * @return: int
	 */
	public int updateParentMenuInfo(int mn_id);
	/**
	 * @������: addMenuInfo
	 * @����˵��: ��Ӳ˵���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:03:34
	 * @param menuInfo
	 * @return
	 * @return: int
	 */
	public int addMenuInfo(MenuInfo menuInfo);
	/**
	 * @������: hasChildren
	 * @����˵��: �鿴�Ƿ����ӽڵ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:03:45
	 * @param map
	 * @return
	 * @return: int
	 */
	public int hasChildren(Map<String,Object> map);
	/**
	 * @������: deleteMenuInfo
	 * @����˵��: ɾ���˵���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:04:09
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
	 * @����: 2020��3��9������4:04:19
	 * @param menuInfo
	 * @return
	 * @return: int
	 */
	public int updateMenuInfo(MenuInfo menuInfo);
}
