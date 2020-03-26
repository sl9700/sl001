package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.Recycleemployeeinfo;

/**
 * @�ļ���: EmployeeInfoService.java
 * @�๦��˵��: �ڲ�Ա��ҵ�����service�ӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��2������8:29:02
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��2������8:29:02</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface EmployeeInfoService {
	/**
	 * @������: login
	 * @����˵��: �ڲ�Ա����½service�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��2������8:32:15
	 * @param employeeinfo
	 * @return
	 * @return: EmployeeInfo
	 */
	public EmployeeInfo login(EmployeeInfo employeeInfo);
	/**
	 * @������: findAllEmployeeInfo
	 * @����˵��: ��Ѱ����Ա����Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:25:09
	 * @param map
	 * @return
	 * @return: List<EmployeeInfo>
	 */
	public List<EmployeeInfo> findAllEmployeeInfo(Map<String,Object> map);
	/**
	 * @������: findAllEmployeeInfoCount
	 * @����˵��: ��������Ա����Ϣ�����������ڷ�ҳ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:25:46
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllEmployeeInfoCount(Map<String,Object> map);
	/**
	 * @������: deleteEmployeeInfoById
	 * @����˵��: ͨ��Ա��idɾ��Ա���ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:26:14
	 * @param em_idss
	 * @return
	 * @return: int
	 */
	public int deleteEmployeeInfoById(String em_idss);
	/**
	 * @������: emAccountIsExist
	 * @����˵��: ��֤���û����Ƿ��ѱ�ʹ��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:26:37
	 * @param map
	 * @return
	 * @return: int
	 */
	public int emAccountIsExist(Map<String,Object> map);
	/**
	 * @������: saveEmployeeInfo
	 * @����˵��: ����Ա����Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:27:00
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int saveEmployeeInfo(EmployeeInfo employeeInfo);
	/**
	 * @������: updateEmployeeInfo
	 * @����˵��: �޸�Ա����Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������4:27:28
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int updateEmployeeInfo(EmployeeInfo employeeInfo);
	/**
	 * @������: findAllNameByRemId
	 * @����˵��: ����վ��Ա�������Ĳ�ѯ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������2:14:41
	 * @return
	 * @return: List<Recycleemployeeinfo>
	 */
	public List<Recycleemployeeinfo> findAllNameByRemId();
	
}
