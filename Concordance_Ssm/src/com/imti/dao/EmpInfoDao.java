package com.imti.dao;

import java.util.List;

import com.imti.model.Recycleemployeeinfo;

/**
 * @文件名: EmpInfoDao.java
 * @类功能说明: 
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月17日上午9:22:39
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月17日上午9:22:39</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface EmpInfoDao {
	/**
	 * @方法名: addEmpInfo
	 * @方法说明: 添加回收站人员管理的信息（子表的dao接口）
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日上午9:36:13
	 * @param recycleemployeeinfo
	 * @return
	 * @return: int
	 */
	public int addEmpInfo(Recycleemployeeinfo recycleemployeeinfo);
	
	/**
	 * @方法名: deleteEmpInfo
	 * @方法说明: 删除回收站人员信息(子表)的接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午4:10:17
	 * @param re_id
	 * @return
	 * @return: int
	 */
	public int deleteEmpInfo(int re_id);
	/**
	 * @方法名: findRecycleInfoByReId
	 * @方法说明: 回收站修改表时的方法（获取旧表的相关信息）
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日上午11:54:14
	 * @param re_id
	 * @return
	 * @return: List<Recycleemployeeinfo>
	 */
	public List<Recycleemployeeinfo> findRecycleEmpInfoByReId(int re_id);
	/**
	 * @方法名: delEmpInfo
	 * @方法说明: 删除子表信息方法dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日上午11:56:13
	 * @param rem_id
	 * @return
	 * @return: int
	 */
	public int delEmpInfo(int rem_id);
	/**
	 * @方法名: updEmpInfo
	 * @方法说明: 修改回收站子表信息的dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日上午11:59:06
	 * @param newRei
	 * @return
	 * @return: int
	 */
	public int updEmpInfo(Recycleemployeeinfo newRei);
	
}
