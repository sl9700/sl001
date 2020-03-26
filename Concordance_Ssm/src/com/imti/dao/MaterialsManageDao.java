package com.imti.dao;
/**@文件名: MaterialsManageDao.java
 * @类功能说明: 物资管理物资详情
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月15日下午2:46:03
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月15日下午2:46:03</li> 
 *	 <li>内容: </li>
 * </pre>
 */

import java.util.List;
import java.util.Map;

import com.imti.model.MaterialsManage;

public interface MaterialsManageDao {
	/**
	 * @方法名: findmaterialsManage
	 * @方法说明: 物资管理查询
	 * @作者: ShiLei
	 * @邮箱：2997426050@qq.com
	 * @日期: 2020年3月15日下午2:50:49
	 * @param mt_id
	 * @return
	 * @return: List<MaterialsManage>
	 */
public List<MaterialsManage> findMaterialsManageInfo(Map<String, Object> map);
/**
 * @方法名: newmaterialsManageInfo
 * @方法说明: 物资详情新增
 * @作者: ShiLei
 * @邮箱：2997426050@qq.com
 * @日期: 2020年3月16日下午12:20:34
 * @param materialsManage
 * @return
 * @return: int
 */
public int newmaterialsManageInfo(MaterialsManage materialsManage);
/**
 * @方法名: findMaterialsManageInfoCount
 * @方法说明: 物资管理总条数查询
 * @作者: ShiLei
 * @邮箱：2997426050@qq.com
 * @日期: 2020年3月17日上午9:54:11
 * @param map
 * @return
 * @return: int
 */
public int findMaterialsManageInfoCount(Map<String, Object> map);
/**
 * @方法名: findMaterialsManageInfo
 * @方法说明: 物资管理新增
 * @作者: ShiLei
 * @邮箱：2997426050@qq.com
 * @日期: 2020年3月17日上午11:25:47
 * @param materialsManage
 * @return
 * @return: int
 */
public int newMaterialsManageInfo(MaterialsManage materialsManage);
/**
 * @方法名: updateMaterialsManageInfo
 * @方法说明: 物资管理修改
 * @作者: ShiLei
 * @邮箱：2997426050@qq.com
 * @日期: 2020年3月17日上午11:39:00
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
 * @日期: 2020年3月17日下午12:02:22
 * @param mm_id
 * @return
 * @return: int
 */
public int deleteMaterialsManageInfo(int mm_id);
}
