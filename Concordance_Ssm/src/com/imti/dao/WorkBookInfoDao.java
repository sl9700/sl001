package com.imti.dao;

import java.util.List;
import java.util.Map;
import com.imti.model.WorkBookInfo;

/**
 * @文件名: WorkBookInfoDao.java
 * @类功能说明: 数据字典Dao接口层
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月9日下午7:43:50
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月9日下午7:43:50</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface WorkBookInfoDao {
	/**
	 * @方法名: findAllworkBook
	 * @方法说明: 查找所有数据字典主表的dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:57:03
	 * @param map
	 * @return
	 * @return: List<WorkBookInfo>
	 */
	public List<WorkBookInfo> findAllworkBook(Map<String, Object> map);
	/**
	 * @方法名: findAllworkBookCount
	 * @方法说明: 查询数据字典主表行数，用于分页
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:57:34
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllworkBookCount(Map<String, Object> map);
	/**
	 * @方法名: addWorkBookInfo
	 * @方法说明: 添加数据字典主表信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:57:57
	 * @param workBookInfo
	 * @return
	 * @return: int
	 */
	public int addWorkBookInfo(WorkBookInfo workBookInfo);
	/**
	 * @方法名: getWorkBookInfoMaxId
	 * @方法说明: 获取当前主表主键的最大值，用于添加数据字典子表的（主表外键）
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:58:30
	 * @return
	 * @return: int
	 */
	public int getWorkBookInfoMaxId();
	/**
	 * @方法名: deleteWorkBookInfo
	 * @方法说明: 删除数据字典主表信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:59:14
	 * @param wb_id
	 * @return
	 * @return: int
	 */
	public int deleteWorkBookInfo(int wb_id);
	/**
	 * @方法名: updateWorkBookInfo
	 * @方法说明: 修改主表信息的dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月12日下午2:27:23
	 * @param workBookInfo
	 * @return
	 * @return: int
	 */
	public int updateWorkBookInfo(WorkBookInfo workBookInfo);

}
