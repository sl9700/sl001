package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.TenderContractInfo;

/**@�ļ���: TenderContractInfoDao.java
 * @�๦��˵��: Ͷ�����Dao��ӿ�
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��13������6:06:52
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��13������6:06:52</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface TenderContractInfoDao {
	/**
	 * @������: findtenderContractInfo
	 * @����˵��: Ͷ������ѯ������Ϣ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��13������6:10:57
	 * @return
	 * @return: List<TenderContractInfo>
	 */
	public List<TenderContractInfo> findtenderContractInfo(Map<String, Object> map);
	/**
	 * @������: findTenderContractInfoCount
	 * @����˵��: Ͷ�����Ϣ��������ѯ
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��13������11:08:40
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findTenderContractInfoCount(Map<String, Object> map);
	/**
	 * @������: newtenderContractInfoInfo
	 * @����˵��: Ͷ�����������
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��13������11:09:12
	 * @param tenderContractInfo
	 * @return
	 * @return: int
	 */
	public int newtenderContractInfoInfo(TenderContractInfo tenderContractInfo);
	/**
	 * @������: updatetenderContract
	 * @����˵��: Ͷ����޸�����
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��14������12:29:11
	 * @param tenderContractInfo
	 * @return
	 * @return: int
	 */
	public int updateTenderContract(TenderContractInfo tenderContractInfo);
	/**
	 * @������: deleteTenderContract
	 * @����˵��: Ͷ���ɾ������
	 * @����: ShiLei
	 * @���䣺2997426050@qq.com
	 * @����: 2020��3��14������4:40:54
	 * @param td_id
	 * @return
	 * @return: int
	 */
	public int deleteTenderContract(int td_id);
}
