package com.imti.service;
/**@文件名: TenderContractInfoService.java
 * @类功能说明: 
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月13日下午6:02:39
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月13日下午6:02:39</li> 
 *	 <li>内容: </li>
 * </pre>
 */

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.TenderContractInfo;

import net.sf.json.JSONObject;

public interface TenderContractInfoService {
/**
 * @方法名: findtenderContractInfo
 * @方法说明: 投标管理所有信息查询
 * @作者: ShiLei
 * @邮箱：2997426050@qq.com
 * @日期: 2020年3月13日下午10:45:07
 * @param map
 * @return
 * @return: List<TenderContractInfo>
 */
public List<TenderContractInfo>findtenderContractInfo(Map<String, Object> map);
/**
 * @方法名: findTenderContractInfoCount
 * @方法说明: 投标管理信息总条数查询
 * @作者: ShiLei
 * @邮箱：2997426050@qq.com
 * @日期: 2020年3月13日下午10:46:29
 * @param map
 * @return
 * @return: int
 */
public int findTenderContractInfoCount(Map<String, Object> map);
/**
 * @方法名: newtenderContractInfoInfo
 * @方法说明: 投标管理新增
 * @作者: ShiLei
 * @邮箱：2997426050@qq.com
 * @日期: 2020年3月13日下午11:00:03
 * @param employeeInfo
 * @param tenderContractInfo
 * @return
 * @return: int
 */
public int newtenderContractInfoInfo(EmployeeInfo employeeInfo,TenderContractInfo tenderContractInfo);
/**
 * @方法名: updatetenderContract
 * @方法说明: 投标管理修改信息
 * @作者: ShiLei
 * @邮箱：2997426050@qq.com
 * @日期: 2020年3月14日下午12:27:33
 * @param tenderContractInfo
 * @return
 * @return: int
 */
public int updatetenderContract(TenderContractInfo tenderContractInfo);
/**
 * @方法名: deleteTenderContract
 * @方法说明: 投标管理删除信息
 * @作者: ShiLei
 * @邮箱：2997426050@qq.com
 * @日期: 2020年3月14日下午4:38:48
 * @param td_idss
 * @return
 * @return: int
 */
public int deleteTenderContract(String td_idss);
}
