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
 * @�ļ���: MaterialsServiceImpl.java
 * @�๦��˵��: ���ʵ�service�ӿڵ�ʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��14������9:00:20
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��14������9:00:20</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class MaterialsServiceImpl implements MaterialsService{
	/**
	 * �����ʵ�dao�ӿ�ע��
	 */
	@Autowired
	private MaterialsDao materialsDao;
	/**
	 * ��ѯ���ʱ��е�������Ϣ
	 */
	@Override
	public List<Recyclematerials> findAllMaterialsInfo(Map<String, Object> map) {
		return materialsDao.findAllMaterialsInfo(map);
	}
	/**
	 * ��ѯ���ʱ�������δɾ�����������������ڷ�ҳ
	 */
	@Override
	public int findAllMaterialsInfoCount(Map<String, Object> map) {
		return materialsDao.findAllMaterialsInfoCount(map);
	}
	/**
	 * ɾ������վ���ʵ�service�ӿ�ʵ����
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
	 * �������վ���ʵ�serviceʵ����
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
	 * �����������ֵĲ�ѯ�������������չʾ
	 */
	@Override
	public List<Recyclematerials> findAllNameRmId() {
		return materialsDao.findAllNameRmId();
	}
	
}
