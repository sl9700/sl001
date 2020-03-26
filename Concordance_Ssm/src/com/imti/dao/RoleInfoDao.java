package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.RoleInfo;

/**
 * @�ļ���: RoleInfoDao.java
 * @�๦��˵��: ��ɫ��Ϣ��Dao�ӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��4������10:50:51
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��4������10:50:51</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface RoleInfoDao {
	/**
	 * @������: findMenuIdsByRoleId
	 * @����˵��: �������в˵�ͨ����ɫid
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:06:31
	 * @param roleId
	 * @return
	 * @return: String
	 */
	public String findMenuIdsByRoleId(int roleId);
	/**
	 * @������: findAllRoleInfo
	 * @����˵��: �������в˵���Ϣ����չʾ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:07:11
	 * @param map
	 * @return
	 * @return: List<RoleInfo>
	 */
	public List<RoleInfo> findAllRoleInfo(Map<String,Object> map);
	/**
	 * @������: findAllRoleInfoCount
	 * @����˵��: �������в˵���Ϣ���������ڷ�ҳ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:07:41
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRoleInfoCount(Map<String,Object> map);
	/**
	 * @������: emRoleNameIsExist
	 * @����˵��: ����ƿ���֤��ɫ��Ϣ�Ƿ����
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:08:10
	 * @param map
	 * @return
	 * @return: int
	 */
	public int emRoleNameIsExist(Map<String,Object> map);
	/**
	 * @������: saveRoleInfo
	 * @����˵��: �޸��������ı��淽��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:08:54
	 * @param roleInfo
	 * @return
	 * @return: int
	 */
	public int saveRoleInfo(RoleInfo roleInfo);
	/**
	 * @������: updateRoleInfo
	 * @����˵��: �޸Ľ�ɫ��Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:09:21
	 * @param roleInfo
	 * @return
	 * @return: int
	 */
	public int updateRoleInfo(RoleInfo roleInfo);
	/**
	 * @������: deleteRoleInfo
	 * @����˵��: ɾ����ɫ��Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:09:35
	 * @param ro_id
	 * @return
	 * @return: int
	 */
	public int deleteRoleInfo(int ro_id);
	/**
	 * @������: roldIsUse
	 * @����˵��: �������޸�Ա����Ϣʱ�Ľ�ɫ�޸�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:09:46
	 * @param ro_id
	 * @return
	 * @return: List<String>
	 */
	public List<String> roldIsUse(int ro_id);
	/**
	 * @������: saveAuth
	 * @����˵��: �����µĽ�ɫ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:10:42
	 * @param map
	 * @return
	 * @return: int
	 */
	public int saveAuth(Map<String,Object> map);
	
}
