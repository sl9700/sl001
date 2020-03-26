package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.MaterialType;

/**@文件名: MaterialTypeDao.java
 * @类功能说明: 物资管理Dao层
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月15日下午2:26:26
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月15日下午2:26:26</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface MaterialTypeDao {
	/**
	 * @方法名: findAllmaterialType
	 * @方法说明: 物资管理查询所有信息
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月15日下午2:27:26
	 * @param map
	 * @return
	 * @return: List<MaterialType>
	 */
	public List<MaterialType> findAllmaterialType(Map<String, Object> map);
	/**
	 * @方法名: findAllmaterialTypeCount
	 * @方法说明:  物资类型总条数查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月15日下午2:28:38
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllmaterialTypeCount(Map<String, Object> map);
	/**
	 * @方法名: newmaterialTypeInfo
	 * @方法说明: 物资类型新增
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月16日下午12:18:04
	 * @return
	 * @return: int
	 */
	public int newmaterialTypeInfo(MaterialType materialType);
	/**
	 * @方法名: updatematerialType
	 * @方法说明:  物资类型修改
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月16日下午6:31:08
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
	 * @日期: 2020年3月16日下午6:58:56
	 * @param mt_id
	 * @return
	 * @return: int
	 */
	public int deletematerialTypeInfo(int mt_id);
}
