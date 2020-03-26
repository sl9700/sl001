package com.imti.service;
/**
 * @文件名: RecycleService.java
 * @类功能说明: 回收站信息service层
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月16日上午10:11:33
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月16日上午10:11:33</li> 
 *	 <li>内容: </li>
 * </pre>
 */

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.imti.model.EmployeeInfo;
import com.imti.model.Recycle;
import com.imti.model.Recycleemployeeinfo;
import com.imti.model.Recyclematerials;

public interface RecycleService {
	/**
	 * @方法名: findAllRecycle
	 * @方法说明: 查找所有回收站信息表
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月16日上午10:14:33
	 * @param map
	 * @return
	 * @return: List<Recycle>
	 */
	public List<Recycle> findAllRecycle(Map<String,Object> map);
	/**
	 * @方法名: findAllRecycleCount
	 * @方法说明: 查找所有回收站信息的条数，用于分页
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月16日上午10:15:05
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleCount(Map<String,Object> map);
	/**
	 * @方法名: addRecycleInfo
	 * @方法说明: 查询所有有关于回收站的信息表
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午2:14:16
	 * @param recycle
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int addRecycleInfo(Recycle recycle,EmployeeInfo employeeInfo);
	
	/**
	 * @方法名: deleteRecycleInfo
	 * @方法说明: 删除主表回收站信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午4:04:01
	 * @param re_id
	 * @return
	 * @return: int
	 */
	public int deleteRecycleInfo(int re_id);
	/**
	 * @方法名: findAllNameByRecycle
	 * @方法说明: 查找所有回收站名字，用于下拉列表
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午5:05:41
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllNameByRecycle();
	/**
	 * @方法名: updateRecycleInfo
	 * @方法说明: 回收站信息的修改方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日上午8:34:54
	 * @param recycle
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int updateRecycleInfo(Recycle recycle,EmployeeInfo employeeInfo);
	
}
