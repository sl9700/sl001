package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.Productinfo;

/**
 * @文件名: WareHouseInfoDao.java
 * @类功能说明: 回收站出入库的管理dao接口
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月18日下午6:55:56
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月18日下午6:55:56</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface WareHouseInfoDao {
	
	/**
	 * @方法名: findAllWareHouseInfo
	 * @方法说明: 找到所有回收站出入库信息用于展示
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午7:02:51
	 * @param map
	 * @return
	 * @return: List<Productinfo>
	 */
	public List<Productinfo> findAllWareHouseInfo(Map<String,Object> map);
	/**
	 * @方法名: findAllWareHouseInfoCount
	 * @方法说明: 找到回收站所有信息的总条数，用于分页
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午7:02:55
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllWareHouseInfoCount(Map<String,Object> map);
	/**
	 * @方法名: addWareHouseInfo
	 * @方法说明: 新增入库信息的dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午9:24:39
	 * @param productinfo
	 * @return
	 * @return: int
	 */
	public int addWareHouseInfo(Productinfo productinfo);
	/**
	 * @方法名: updateWareHouseInfo
	 * @方法说明: 修改回收站出入库信息的dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午9:48:01
	 * @param productinfo
	 * @return
	 * @return: int
	 */
	public int updateWareHouseInfo(Productinfo productinfo);
	/**
	 * @方法名: deleteWareHouseInfo
	 * @方法说明: 删除回收站出入库信息的dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午9:48:03
	 * @param pr_id
	 * @return
	 * @return: int
	 */
	public int deleteWareHouseInfo(int pr_id);
	
}
