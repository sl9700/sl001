package com.imti.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.MaterialsDao;
import com.imti.model.Recyclematerials;
import com.imti.service.MaterialsService;
import com.imti.util.DateUtil;

/**
 * @文件名: MaterialsServiceImpl.java
 * @类功能说明: 物资的service接口的实现类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月14日上午9:00:20
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月14日上午9:00:20</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class MaterialsServiceImpl implements MaterialsService{
	/**
	 * 将物资的dao接口注入
	 */
	@Autowired
	private MaterialsDao materialsDao;
	/**
	 * 查询物资表中的所有信息
	 */
	@Override
	public List<Recyclematerials> findAllMaterialsInfo(Map<String, Object> map) {
		return materialsDao.findAllMaterialsInfo(map);
	}
	/**
	 * 查询物资表中所有未删除的数据条数，用于分页
	 */
	@Override
	public int findAllMaterialsInfoCount(Map<String, Object> map) {
		return materialsDao.findAllMaterialsInfoCount(map);
	}
	/**
	 * 删除回收站物资的service接口实现类
	 */
	@Override
	public int deleteMaterialsInfo(String rm_idss) {
		String rmIds[] = rm_idss.split(",");
		int result = 0;
		int count = 0;
		for(int i=0;i<rmIds.length;i++){
			result = materialsDao.deleteMaterialsInfo(Integer.parseInt(rmIds[i]));
			if(result>0){
				count++;
			}
		}
		return count;
	}
	/**
	 * 保存回收站物资的service实现类
	 */
	@Override
	public int saveMaterialsInfo(Recyclematerials recyclematerials) {
		recyclematerials.setRm_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		recyclematerials.setRm_state(0);
		recyclematerials.setRm_delflag(0);
		return materialsDao.saveMaterialsInfo(recyclematerials);
	}
	@Override
	public int updateMaterialsInfo(Recyclematerials recyclematerials) {
		recyclematerials.setRm_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		recyclematerials.setRm_state(0);
		recyclematerials.setRm_delflag(0);
		return materialsDao.updateMaterialsInfo(recyclematerials);
	}
	
	/**
	 * 物资类别的名字的查询，用于下拉框的展示
	 */
	@Override
	public List<Recyclematerials> findAllNameRmId() {
		return materialsDao.findAllNameRmId();
	}
	
}
