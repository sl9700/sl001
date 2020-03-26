package com.imti.service;

import java.util.List;
import java.util.Map;

import com.imti.model.Recyclematerials;

/**
 * @文件名: MaterialsService.java
 * @类功能说明: 物资管理的service接口
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月14日上午8:50:43
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月14日上午8:50:43</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface MaterialsService {
	/**
	 * @方法名: findAllmaterialsInfo
	 * @方法说明: 查询物资表所有信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月14日上午8:55:38
	 * @param map
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllMaterialsInfo(Map<String,Object> map);
	/**
	 * @方法名: findAllmaterialsInfoCount
	 * @方法说明: 查询物资表中未被删除的总条数，用于分页
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月14日上午8:56:17
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllMaterialsInfoCount(Map<String,Object> map);
	/**
	 * @方法名: deleteMaterialsInfo
	 * @方法说明: 删除回收站物资的service层接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月15日上午11:20:41
	 * @param em_idss
	 * @return
	 * @return: int
	 */
	public int deleteMaterialsInfo(String rm_idss);
	/**
	 * @方法名: saveMaterialsInfo
	 * @方法说明: 保存回收站物资的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月15日下午2:51:23
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
	 * @日期: 2020年3月15日下午2:51:26
	 * @param recyclematerials
	 * @return
	 * @return: int
	 */
	public int updateMaterialsInfo(Recyclematerials recyclematerials);
	/**
	 * @方法名: findAllNameRmId
	 * @方法说明: 物资类别的名字的查询，用于下拉框的展示
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午2:15:03
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllNameRmId();
	
	
}
