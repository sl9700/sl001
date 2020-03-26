package com.imti.dao;

import java.util.List;

import com.imti.model.Recycleemployeeinfo;

	/**
	 * @文件名: RecycleEmployeeDao.java
	 * @类功能说明: 回收站人员信息的接口
	 * @作者: YangZhiYuan
	 * @Email: 982206231@qq.com
	 * @日期: 2020年3月16日下午6:51:02
	 * @修改说明:<br> 
	 * <pre>
	 * 	 <li>作者: YangZhiYuan</li> 
	 * 	 <li>日期: 2020年3月16日下午6:51:02</li> 
	 *	 <li>内容: </li>
	 * </pre>
	 */
	public interface RecycleEmployeeDao {
	/**
	 * @方法名: findRecycleEmployeeInfoByReId
	 * @方法说明: 用于查询与回收站相关的回收站人员信息表
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月16日下午6:52:37
	 * @param re_id
	 * @return
	 * @return: List<Recycleemployeeinfo>
	 */
	public List<Recycleemployeeinfo> findRecycleEmployeeInfoByReId(int re_id);
	
}
