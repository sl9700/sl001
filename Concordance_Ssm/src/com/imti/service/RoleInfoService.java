package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.RoleInfo;

/**
 * @�ļ���: RoleInfoService.java
 * @�๦��˵��: ��ɫ��Ϣ��service�ӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��4������10:58:16
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��4������10:58:16</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface RoleInfoService {
	/**
	 * @������: findMenuIdByRoleId
	 * @����˵��: ͨ����ɫid���Ҳ˵�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:32:28
	 * @param roleId
	 * @return
	 * @return: String
	 */
	public String findMenuIdByRoleId(int roleId);
	/**
	 * @������: findAllRoleInfo
	 * @����˵��: �������н�ɫ��Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:32:57
	 * @param map
	 * @return
	 * @return: List<RoleInfo>
	 */
	public List<RoleInfo> findAllRoleInfo(Map<String,Object> map);
	/**
	 * @������: findAllRoleInfoCount
	 * @����˵��: �������н�ɫ��Ϣ���������ڷ�ҳ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:33:24
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRoleInfoCount(Map<String,Object> map);
	/**
	 * @������: emRoleNameIsExist
	 * @����˵��: ���ҽ�ɫ���Ƿ��Ѵ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:33:53
	 * @param map
	 * @return
	 * @return: int
	 */
	public int emRoleNameIsExist(Map<String,Object> map);
	/**
	 * @������: saveRoleInfo
	 * @����˵��: �����ɫ��Ϣ�İ�ť��ط���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:34:20
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
	 * @����: 2020��3��9������4:34:40
	 * @param roleInfo
	 * @return
	 * @return: int
	 */
	public int updateRoleInfo(RoleInfo roleInfo);
	/**
	 * @������: deleteRoleInfo
	 * @����˵��: ɾ����ɫ��Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:34:55
	 * @param ro_idss
	 * @return
	 * @return: int
	 */
	public int deleteRoleInfo(String ro_idss);
	/**
	 * @������: roldIsUse
	 * @����˵��: �����ɫʱ��ѡ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:35:12
	 * @param ro_ids
	 * @return
	 * @return: List<String>
	 */
	public List<String> roldIsUse(String ro_ids);
	/**
	 * @������: saveAuth
	 * @����˵��: �����ɫ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:35:39
	 * @param map
	 * @return
	 * @return: int
	 */
	public int saveAuth(Map<String,Object> map);
	
}
