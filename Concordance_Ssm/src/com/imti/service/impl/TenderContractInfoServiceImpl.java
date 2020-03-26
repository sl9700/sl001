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

/**@文件名: TenderContractInfoServiceImpl.java
 * @类功能说明: 投标管理Service层实现类
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月13日下午6:04:57
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月13日下午6:04:57</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class TenderContractInfoServiceImpl implements TenderContractInfoService{
	/**
	 *注入dao层接口 
	 */
	@Autowired
	private TenderContractInfoDao tenderContractInfoDao;
	/**
	 * 投标管理所有信息查询
	 */
	@Override
	public List<TenderContractInfo> findtenderContractInfo(Map<String, Object> map) {
		
		return tenderContractInfoDao.findtenderContractInfo(map);
	}
	/**
	 * 投标管理信息总条数查询
	 */
	@Override
	public int findTenderContractInfoCount(Map<String, Object> map) {
		
		return tenderContractInfoDao.findTenderContractInfoCount(map);
	}
	/**
	 * 投标管新增数据
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
	 * 投标管修改数据
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