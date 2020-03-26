package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.Recyclematerials;

/**
 * @文件名: MaterialsDao.java
 * @类功能说明: 
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月14日上午9:06:07
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月14日上午9:06:07</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface MaterialsDao {
	/**
	 * @方法名: findAllmaterialsInfo
	 * @方法说明: 查询物资表中的所有数据
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月14日上午9:07:55
	 * @param map
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllMaterialsInfo(Map<String,Object> map);
	/**
	 * @方法名: findAllmaterialsInfoCount
	 * @方法说明: 查询物资表中的所有数据的总条数，用于分页
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月14日上午9:08:13
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllMaterialsInfoCount(Map<String,Object> map);
	/**
	 * @方法名: deleteMaterialsInfo
	 * @方法说明: 删除回收站物资信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月15日上午11:25:00
	 * @param rm_idss
	 * @return
	 * @return: int
	 */
	public int deleteMaterialsInfo(int rm_id);
	/**
	 * @方法名: saveMaterialsInfo
	 * @方法说明: 保存回收站物资的dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月15日下午2:01:50
	 * @param recyclematerials
	 * @return
	 * @return: int
	 */
	public int saveMaterialsInfo(Recyclematerials recyclematerials);
	/**
	 * @方法名: updateMaterialsInfo
	 * @方法说明: 修改回收站物资信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月15日下午2:53:34
	 * @param recyclematerials
	 * @return
	 * @return: int
	 */
	public int updateMaterialsInfo(Recyclematerials recyclematerials);
	/**
	 * @方法名: findAllNameRmId
	 * @方法说明: 查询所有回收站物资的name用于下拉框
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午2:19:44
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllNameRmId();
	
}
