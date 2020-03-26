package com.imti.dao;

import java.util.List;

import com.imti.model.Recyclematerials;

/**
 * @文件名: RecycleMaterialsDao.java
 * @类功能说明: 回收站物资的dao接口
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月16日下午6:36:38
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月16日下午6:36:38</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface RecycleMaterialsDao {
	/**
	 * @方法名: findRecycleMaterialsInfoByReId
	 * @方法说明: 通过re_id查询所有回收站物资的信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月16日下午6:40:21
	 * @param re_id
	 * @return
	 * @return: List<Recyclematerials>
	 */
	public List<Recyclematerials> findRecycleMaterialsInfoByReId(int re_id);
	
}
