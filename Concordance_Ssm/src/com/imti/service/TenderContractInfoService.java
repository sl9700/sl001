package com.imti.service;
/**@�ļ���: TenderContractInfoService.java
 * @�๦��˵��: 
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��13������6:02:39
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��13������6:02:39</li> 
 *	 <li>����: </li>
 * </pre>
 */

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.TenderContractInfo;

import net.sf.json.JSONObject;

public interface TenderContractInfoService {
/**
 * @������: findtenderContractInfo
 * @����˵��: Ͷ�����������Ϣ��ѯ
 * @����: ShiLei
 * @���䣺2997426050@qq.com
 * @����: 2020��3��13������10:45:07
 * @param map
 * @return
 * @return: List<TenderContractInfo>
 */
public List<TenderContractInfo>findtenderContractInfo(Map<String, Object> map);
/**
 * @������: findTenderContractInfoCount
 * @����˵��: Ͷ�������Ϣ��������ѯ
 * @����: ShiLei
 * @���䣺2997426050@qq.com
 * @����: 2020��3��13������10:46:29
 * @param map
 * @return
 * @return: int
 */
public int findTenderContractInfoCount(Map<String, Object> map);
/**
 * @������: newtenderContractInfoInfo
 * @����˵��: Ͷ���������
 * @����: ShiLei
 * @���䣺2997426050@qq.com
 * @����: 2020��3��13������11:00:03
 * @param employeeInfo
 * @param tenderContractInfo
 * @return
 * @return: int
 */
public int newtenderContractInfoInfo(EmployeeInfo employeeInfo,TenderContractInfo tenderContractInfo);
/**
 * @������: updatetenderContract
 * @����˵��: Ͷ������޸���Ϣ
 * @����: ShiLei
 * @���䣺2997426050@qq.com
 * @����: 2020��3��14������12:27:33
 * @param tenderContractInfo
 * @return
 * @return: int
 */
public int updatetenderContract(TenderContractInfo tenderContractInfo);
/**
 * @������: deleteTenderContract
 * @����˵��: Ͷ�����ɾ����Ϣ
 * @����: ShiLei
 * @���䣺2997426050@qq.com
 * @����: 2020��3��14������4:38:48
 * @param td_idss
 * @return
 * @return: int
 */
public int deleteTenderContract(String td_idss);
}
