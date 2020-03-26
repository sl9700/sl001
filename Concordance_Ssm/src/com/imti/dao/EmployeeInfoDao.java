package com.imti.dao;
/**
 * @文件名: EmployeeinfoDao.java
 * @类功能说明: 内部用户数据持久层Dao接口
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月2日下午8:17:10
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月2日下午8:17:10</li> 
 *	 <li>内容: </li>
 * </pre>
 */

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.Recycleemployeeinfo;

public interface EmployeeInfoDao {
	/**
	 * @方法名: login
	 * @方法说明: 内部员工登陆方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月2日下午8:20:29
	 * @param employeeinfo
	 * @return
	 * @return: EmployeeInfo
	 */
	public EmployeeInfo login(EmployeeInfo employeeInfo);
	/**
	 * @方法名: findAllEmployeeInfo
	 * @方法说明: 查找所有用户信息方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:53:11
	 * @param map
	 * @return
	 * @return: List<EmployeeInfo>
	 */
	public List<EmployeeInfo> findAllEmployeeInfo(Map<String,Object> map);
	/**
	 * @方法名: findAllEmployeeInfoCount
	 * @方法说明: 查找用户信息的总条数
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:53:39
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllEmployeeInfoCount(Map<String,Object> map);
	/**
	 * @方法名: deleteEmployeeInfoById
	 * @方法说明: 通过员工id删除用户信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:54:06
	 * @param em_id
	 * @return
	 * @return: int
	 */
	public int deleteEmployeeInfoById(int em_id);
	/**
	 * @方法名: emAccountIsExist
	 * @方法说明: 光标移开判断用户名是否已存在的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:55:00
	 * @param map
	 * @return
	 * @return: int
	 */
	public int emAccountIsExist(Map<String,Object> map);
	/**
	 * @方法名: saveEmployeeInfo
	 * @方法说明: 用户信息的保存按钮
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:55:43
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int saveEmployeeInfo(EmployeeInfo employeeInfo);
	/**
	 * @方法名: updateEmployeeInfo
	 * @方法说明: 修改员工信息的按钮相关方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:56:16
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int updateEmployeeInfo(EmployeeInfo employeeInfo);
	/**
	 * @方法名: findPasswordByEmId
	 * @方法说明: Md5加密之后验证密码是否修改方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:56:47
	 * @param em_id
	 * @return
	 * @return: String
	 */
	public String findPasswordByEmId(int em_id);
	/**
	 * @方法名: findAllNameByRemId
	 * @方法说明: 查询所有员工name
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午2:18:50
	 * @return
	 * @return: List<Recycleemployeeinfo>
	 */
	public List<Recycleemployeeinfo> findAllNameByRemId();
	
}
