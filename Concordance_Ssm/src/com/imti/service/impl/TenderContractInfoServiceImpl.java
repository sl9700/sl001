package com.imti.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.TenderContractInfoDao;
import com.imti.model.EmployeeInfo;
import com.imti.model.TenderContractInfo;
import com.imti.service.TenderContractInfoService;
import com.imti.util.DateUtil;

/**@�ļ���: TenderContractInfoServiceImpl.java
 * @�๦��˵��: Ͷ�����Service��ʵ����
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��13������6:04:57
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��13������6:04:57</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class TenderContractInfoServiceImpl implements TenderContractInfoService{
	/**
	 *ע��dao��ӿ� 
	 */
	@Autowired
	private TenderContractInfoDao tenderContractInfoDao;
	/**
	 * Ͷ�����������Ϣ��ѯ
	 */
	@Override
	public List<TenderContractInfo> findtenderContractInfo(Map<String, Object> map) {
		
		return tenderContractInfoDao.findtenderContractInfo(map);
	}
	/**
	 * Ͷ�������Ϣ��������ѯ
	 */
	@Override
	public int findTenderContractInfoCount(Map<String, Object> map) {
		
		return tenderContractInfoDao.findTenderContractInfoCount(map);
	}
	/**
	 * Ͷ�����������
	 */
	@Override
	public int newtenderContractInfoInfo(EmployeeInfo employeeInfo, TenderContractInfo tenderContractInfo) {
		tenderContractInfo.setTd_delflag(0);
		tenderContractInfo.setTd_states(0);;
		tenderContractInfo.setTd_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		tenderContractInfo.setTd_opt_id(employeeInfo.getEm_id());
		return tenderContractInfoDao.newtenderContractInfoInfo(tenderContractInfo);
	}
	/**
	 * Ͷ����޸�����
	 */
	@Override
	public int updatetenderContract(TenderContractInfo tenderContractInfo) {
		return tenderContractInfoDao.updateTenderContract(tenderContractInfo);
	}
	@Override
	public int deleteTenderContract(String td_idss) {
		String td_ids[]=td_idss.split(",");
		int result=0;
		int conut=0;
		for (int i = 0; i < td_ids.length; i++) {
			result=tenderContractInfoDao.deleteTenderContract(Integer.parseInt(td_ids[i]));
			if(result>0){
				conut++;	
			}
		}
		return conut;
	}
}