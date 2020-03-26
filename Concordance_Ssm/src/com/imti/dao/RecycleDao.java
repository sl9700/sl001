package com.imti.dao;

import java.util.List;
import java.util.Map;

import com.imti.model.Recycle;
import com.imti.model.Recyclematerials;

/**
 * @文件名: RecycleDao.java
 * @类功能说明: 回收站信息Dao接口
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月16日上午10:19:01
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月16日上午10:19:01</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface RecycleDao {
	/**
	 * @方法名: findAllRecycle
	 * @方法说明: 查询所有回收站信息用于展示
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月16日上午10:24:30
	 * @param map
	 * @return
	 * @return: List<Recycle>
	 */
	public List<Recycle> findAllRecycle(Map<String,Object> map);
	/**
	 * @方法名: findAllRecycleCount
	 * @方法说明: 查询所有回收站信息的条数，用于分页
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月16日上午10:24:32
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllRecycleCount(Map<String,Object> map);
	/**
	 * @方法名: addRecycleInfo
	 * @方法说明: 添加回收站信息的Dao层接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日上午9:30:53
	 * @param recycle
	 * @return
	 * @return: int
	 */
	public int addRecycleInfo(Recycle recycle);
	/**
	 * @方法名: getRecycleMaxId
	 * @方法说明: 获取目前主表的最大主键，用于添加主键
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日上午9:31:22
	 * @return
	 * @return: int
	 */
	public int getRecycleMaxId();
	/**
	 * @方法名: deleteRecycleInfo
	 * @方法说明: 删除回收站主表信息的Dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午4:08:42
	 * @param re_id
	 * @return
	 * @return: int
	 */
	public int deleteRecycleInfo(int re_id);
	/**
	 * @方法名: findAllNameByRecycle
	 * @方法说明: 回收站名称用于下拉列表的展示
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午5:08:20
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findAllNameByRecycle();
	/**
	 * @方法名: updateRecycleInfo
	 * @方法说明: 修改回收站主表信息的dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月18日上午11:52:39
	 * @param recycle
	 * @return
	 * @return: int
	 */
	public int updateRecycleInfo(Recycle recycle);
	
}
