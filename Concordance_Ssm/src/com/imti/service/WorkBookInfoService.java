package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.WorkBookInfo;

/**
 * @文件名: WorkBookInfoService.java
 * @类功能说明: 数据字典service接口
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月9日下午7:32:05
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月9日下午7:32:05</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface WorkBookInfoService {
	/**
	 * @方法名: findAllworkBook
	 * @方法说明: 查询所有的数据字典主表的数据
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午7:37:44
	 * @param map
	 * @return
	 * @return: List<WorkBookInfo>
	 */
	public List<WorkBookInfo> findAllworkBook(Map<String,Object> map);
	/**
	 * @方法名: findAllworkBookCount
	 * @方法说明: 查询所有的数据条数，用于分页
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午7:37:47
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllworkBookCount(Map<String,Object> map);
	/**
	 * @方法名: addWorkBookInfo
	 * @方法说明: 添加数据字典接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:53:57
	 * @param workBookInfo
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int addWorkBookInfo(WorkBookInfo workBookInfo,EmployeeInfo employeeInfo);
	/**
	 * @方法名: deleteWorkBookInfo
	 * @方法说明: 删除数据字典接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:54:23
	 * @param wb_id
	 * @return
	 * @return: int
	 */
	public int deleteWorkBookInfo(int wb_id);
	
	public int updateWorkBookInfo(WorkBookInfo workBookInfo,EmployeeInfo employeeInfo);
	
}
