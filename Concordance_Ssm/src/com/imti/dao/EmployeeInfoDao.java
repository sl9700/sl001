package com.imti.dao;
/**
 * @�ļ���: EmployeeinfoDao.java
 * @�๦��˵��: �ڲ��û����ݳ־ò�Dao�ӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��2������8:17:10
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��2������8:17:10</li> 
 *	 <li>����: </li>
 * </pre>
 */

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.Recycleemployeeinfo;

public interface EmployeeInfoDao {
	/**
	 * @������: login
	 * @����˵��: �ڲ�Ա����½����
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��2������8:20:29
	 * @param employeeinfo
	 * @return
	 * @return: EmployeeInfo
	 */
	public EmployeeInfo login(EmployeeInfo employeeInfo);
	/**
	 * @������: findAllEmployeeInfo
	 * @����˵��: ���������û���Ϣ����
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:53:11
	 * @param map
	 * @return
	 * @return: List<EmployeeInfo>
	 */
	public List<EmployeeInfo> findAllEmployeeInfo(Map<String,Object> map);
	/**
	 * @������: findAllEmployeeInfoCount
	 * @����˵��: �����û���Ϣ��������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:53:39
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllEmployeeInfoCount(Map<String,Object> map);
	/**
	 * @������: deleteEmployeeInfoById
	 * @����˵��: ͨ��Ա��idɾ���û���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:54:06
	 * @param em_id
	 * @return
	 * @return: int
	 */
	public int deleteEmployeeInfoById(int em_id);
	/**
	 * @������: emAccountIsExist
	 * @����˵��: ����ƿ��ж��û����Ƿ��Ѵ��ڵķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:55:00
	 * @param map
	 * @return
	 * @return: int
	 */
	public int emAccountIsExist(Map<String,Object> map);
	/**
	 * @������: saveEmployeeInfo
	 * @����˵��: �û���Ϣ�ı��水ť
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:55:43
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int saveEmployeeInfo(EmployeeInfo employeeInfo);
	/**
	 * @������: updateEmployeeInfo
	 * @����˵��: �޸�Ա����Ϣ�İ�ť��ط���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:56:16
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int updateEmployeeInfo(EmployeeInfo employeeInfo);
	/**
	 * @������: findPasswordByEmId
	 * @����˵��: Md5����֮����֤�����Ƿ��޸ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:56:47
	 * @param em_id
	 * @return
	 * @return: String
	 */
	public String findPasswordByEmId(int em_id);
	/**
	 * @������: findAllNameByRemId
	 * @����˵��: ��ѯ����Ա��name
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������2:18:50
	 * @return
	 * @return: List<Recycleemployeeinfo>
	 */
	public List<Recycleemployeeinfo> findAllNameByRemId();
	
}
