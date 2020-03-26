package com.imti.dao;

import java.util.List;

import com.imti.model.Recyclematerials;

/**
 * @文件名: MaterialsInfoDao.java
 * @类功能说明: 
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月17日上午9:18:43
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月17日上午9:18:43</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface MaterialsInfoDao {
	/**
	 * @方法名: addMaterialsInfo
	 * @方法说明: 添加子表的回收站物资管理的信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日上午9:35:50
	 * @param recyclematerials
	 * @return
	 * @return: int
	 */
	public int addMaterialsInfo(Recyclematerials recyclematerials);
	/**
	 * @方法名: updMaterialsInfo
	 * @方法说明: 修改回收站物资表的dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午5:29:45
	 * @param recyclematerials
	 * @return
	 * @return: int
	 */
	public int updMaterialsInfo(Recyclematerials recyclematerials);
	
	/**
	 * @方法名: deleteMaterialsInfo
	 * @方法说明: 删除回收站物资信息(子表)的Dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午4:09:25
	 * @param re_id
	 * @return
	 * @return: int
	 */
	public int deleteMaterialsInfo(int re_id);
	/**
	 * @方法名: findRecycleMaterialsInfoByReId
	 * @方法说明: 查找相关的回收站管理的子表信息（用回收站外键id）
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午5:32:25
	 * @param re_id
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findRecycleMaterialsInfoByReId(int re_id);
	/**
	 * @方法名: delMaterialsInfo
	 * @方法说明: 删除一部分子表数据的方法，根据子表的主键
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日下午5:54:31
	 * @param rm_id
	 * @return
	 * @return: int
	 */
	public int delMaterialsInfo(int rm_id);
	
}
