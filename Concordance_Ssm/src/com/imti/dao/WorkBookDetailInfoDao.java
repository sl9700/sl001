package com.imti.dao;

import java.util.List;

import com.imti.model.WorkBookDetailInfo;

/**
 * @文件名: WorkBookDetailDao.java
 * @类功能说明: 查询子表信息的接口
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月9日下午8:51:05
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月9日下午8:51:05</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface WorkBookDetailInfoDao {
	/**
	 * @方法名: findWorkBookDetilByWbId
	 * @方法说明: 查询子表的接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午8:52:56
	 * @return
	 * @return: List<WorkBookDetailInfo>
	 */
	public List<WorkBookDetailInfo> findWorkBookDetailInfoByWbId(int wb_id);
	/**
	 * @方法名: addWorkBookDetailInfo
	 * @方法说明: 添加数据字典子表dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:56:18
	 * @param workBookDetailInfo
	 * @return
	 * @return: int
	 */
	public int addWorkBookDetailInfo(WorkBookDetailInfo workBookDetailInfo);
	/**
	 * @方法名: deleteWorkBookDetailInfo
	 * @方法说明: 删除数据字典子表接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月11日下午9:56:36
	 * @param wb_id
	 * @return
	 * @return: int
	 */
	public int deleteWorkBookDetailInfo(int wb_id);
	/**
	 * @方法名: delWorkBookDetailInfo
	 * @方法说明: 点击修改时，删除子表信息的dao接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月12日下午2:26:18
	 * @param wdb_id
	 * @return
	 * @return: int
	 */
	public int delWorkBookDetailInfo(int wdb_id);
	/**
	 * @方法名: updateWorkBookDetailInfo
	 * @方法说明: 修改子表信息时的update接口
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月12日下午2:26:46
	 * @param workBookDetailInfo
	 * @return
	 * @return: int
	 */
	public int updateWorkBookDetailInfo(WorkBookDetailInfo workBookDetailInfo);
	
}
