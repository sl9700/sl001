package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.Recycleemployeeinfo;

/**
 * @文件名: EmployeeInfoService.java
 * @类功能说明: 内部员工业务处理层service接口
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月2日下午8:29:02
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月2日下午8:29:02</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface EmployeeInfoService {
	/**
	 * @方法名: login
	 * @方法说明: 内部员工登陆service接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月2日下午8:32:15
	 * @param employeeinfo
	 * @return
	 * @return: EmployeeInfo
	 */
	public EmployeeInfo login(EmployeeInfo employeeInfo);
	/**
	 * @方法名: findAllEmployeeInfo
	 * @方法说明: 找寻所有员工信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:25:09
	 * @param map
	 * @return
	 * @return: List<EmployeeInfo>
	 */
	public List<EmployeeInfo> findAllEmployeeInfo(Map<String,Object> map);
	/**
	 * @方法名: findAllEmployeeInfoCount
	 * @方法说明: 查找所有员工信息的条数，用于分页
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:25:46
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllEmployeeInfoCount(Map<String,Object> map);
	/**
	 * @方法名: deleteEmployeeInfoById
	 * @方法说明: 通过员工id删除员工的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:26:14
	 * @param em_idss
	 * @return
	 * @return: int
	 */
	public int deleteEmployeeInfoById(String em_idss);
	/**
	 * @方法名: emAccountIsExist
	 * @方法说明: 验证该用户名是否已被使用
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:26:37
	 * @param map
	 * @return
	 * @return: int
	 */
	public int emAccountIsExist(Map<String,Object> map);
	/**
	 * @方法名: saveEmployeeInfo
	 * @方法说明: 保存员工信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:27:00
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int saveEmployeeInfo(EmployeeInfo employeeInfo);
	/**
	 * @方法名: updateEmployeeInfo
	 * @方法说明: 修改员工信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午4:27:28
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int updateEmployeeInfo(EmployeeInfo employeeInfo);
	/**
	 * @方法名: findAllNameByRemId
	 * @方法说明: 回收站人员的姓名的查询
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午2:14:41
	 * @return
	 * @return: List<Recycleemployeeinfo>
	 */
	public List<Recycleemployeeinfo> findAllNameByRemId();
	
}
