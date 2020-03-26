package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.EmployeeInfo;
import com.imti.model.MaterialType;

import net.sf.json.JSONObject;

/**@文件名: MaterialTypeService.java
 * @类功能说明: 物资管理Service层接口
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月15日下午2:17:48
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月15日下午2:17:48</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface MaterialTypeService {
	/**
	 * @方法名: findAllmaterialType
	 * @方法说明: 物资类型查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月15日下午2:19:59
	 * @param map
	 * @return
	 * @return: List<Workbookinfo>
	 */
	public List<MaterialType> findAllmaterialType(Map<String,Object> map);
	/**
	 * @方法名: findAllmaterialTypeCount
	 * @方法说明: 物资类型总条数查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月15日下午2:21:23
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllmaterialTypeCount(Map<String,Object> map);
	/**
	 * @方法名: newmaterialTypeInfo
	 * @方法说明: 物资类型新增
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月16日下午6:28:13
	 * @param materialType
	 * @param employeeInfo
	 * @return
	 * @return: int
	 */
	public int newmaterialTypeInfo(MaterialType materialType,EmployeeInfo employeeInfo);
	/**
	 * @方法名: updatematerialType
	 * @方法说明: 物资类型修改
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月16日下午6:32:00
	 * @param materialType
	 * @return
	 * @return: int
	 */
	public int updatematerialType(MaterialType materialType);
	/**
	 * @方法名: deletematerialTypeInfo
	 * @方法说明: 物资类型删除
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月16日下午6:51:28
	 * @param mt_idss
	 * @return
	 * @return: int
	 */
	public int deletematerialTypeInfo(String mt_idss);
}
