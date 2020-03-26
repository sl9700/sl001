package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.MaterialsManage;

import net.sf.json.JSONObject;


/**@文件名: MaterialsManageService.java
 * @类功能说明: 
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月17日上午9:37:47
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月17日上午9:37:47</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface MaterialsManageService {
	/**
	 * @方法名: findMaterialsManageInfo
	 * @方法说明: 物资管理查询所有信息
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月17日上午9:48:34
	 * @param map
	 * @return
	 * @return: List<MaterialsManage>
	 */
	public List<MaterialsManage> findMaterialsManageInfo(Map<String,Object> map);
	/**
	 * @方法名: findMaterialsManageInfoCount
	 * @方法说明: 物资管理查询总条数
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月17日上午9:48:44
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findMaterialsManageInfoCount(Map<String,Object> map);
	/**
	 * @方法名: findMaterialsManageInfo
	 * @方法说明: 物资管理新增
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月17日上午11:24:26
	 * @param materialsManage
	 * @return
	 * @return: int
	 */
	public int newMaterialsManageInfo(MaterialsManage materialsManage,EmployeeInfo employeeInfo);
	/**
	 * @方法名: updateMaterialsManageInfo
	 * @方法说明: 物资管理修改
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月17日上午11:37:36
	 * @param materialsManage
	 * @return
	 * @return: int
	 */
	public int updateMaterialsManageInfo(MaterialsManage materialsManage);
	/**
	 * @方法名: deleteMaterialsManageInfo
	 * @方法说明: 物资管理删除
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月17日下午12:01:11
	 * @param mm_id
	 * @return
	 * @return: JSONObject
	 */
	public int deleteMaterialsManageInfo(String mm_id);
}
