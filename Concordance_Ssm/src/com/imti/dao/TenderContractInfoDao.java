package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.TenderContractInfo;

/**@文件名: TenderContractInfoDao.java
 * @类功能说明: 投标管理Dao层接口
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月13日下午6:06:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月13日下午6:06:52</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface TenderContractInfoDao {
	/**
	 * @方法名: findtenderContractInfo
	 * @方法说明: 投标管理查询所有信息
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月13日下午6:10:57
	 * @return
	 * @return: List<TenderContractInfo>
	 */
	public List<TenderContractInfo> findtenderContractInfo(Map<String, Object> map);
	/**
	 * @方法名: findTenderContractInfoCount
	 * @方法说明: 投标管信息总条数查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月13日下午11:08:40
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findTenderContractInfoCount(Map<String, Object> map);
	/**
	 * @方法名: newtenderContractInfoInfo
	 * @方法说明: 投标管新增数据
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月13日下午11:09:12
	 * @param tenderContractInfo
	 * @return
	 * @return: int
	 */
	public int newtenderContractInfoInfo(TenderContractInfo tenderContractInfo);
	/**
	 * @方法名: updatetenderContract
	 * @方法说明: 投标管修改数据
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月14日下午12:29:11
	 * @param tenderContractInfo
	 * @return
	 * @return: int
	 */
	public int updateTenderContract(TenderContractInfo tenderContractInfo);
	/**
	 * @方法名: deleteTenderContract
	 * @方法说明: 投标管删除数据
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月14日下午4:40:54
	 * @param td_id
	 * @return
	 * @return: int
	 */
	public int deleteTenderContract(int td_id);
}
