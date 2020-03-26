package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.WorkBookInfo;

/**
 * @�ļ���: WorkBookInfoService.java
 * @�๦��˵��: �����ֵ�service�ӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��9������7:32:05
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��9������7:32:05</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface WorkBookInfoService {
	/**
	 * @������: findAllworkBook
	 * @����˵��: ��ѯ���е������ֵ����������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������7:37:44
	 * @param map
	 * @return
	 * @return: List<WorkBookInfo>
	 */
	public List<WorkBookInfo> findAllworkBook(Map<String,Object> map);
	/**
	 * @������: findAllworkBookCount
	 * @����˵��: ��ѯ���е��������������ڷ�ҳ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������7:37:47
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllworkBookCount(Map<String,Object> map);
	/**
	 * @������: addWorkBookInfo
	 * @����˵��: ��������ֵ�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:53:57
	 * @param workBookInfo
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int addWorkBookInfo(WorkBookInfo workBookInfo,EmployeeInfo employeeInfo);
	/**
	 * @������: deleteWorkBookInfo
	 * @����˵��: ɾ�������ֵ�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:54:23
	 * @param wb_id
	 * @return
	 * @return: int
	 */
	public int deleteWorkBookInfo(int wb_id);
	
	public int updateWorkBookInfo(WorkBookInfo workBookInfo,EmployeeInfo employeeInfo);
	
}
