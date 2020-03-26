package com.imti.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.EmpInfoDao;
import com.imti.dao.MaterialsInfoDao;
import com.imti.dao.RecycleDao;
import com.imti.model.EmployeeInfo;
import com.imti.model.Recycle;
import com.imti.model.Recycleemployeeinfo;
import com.imti.model.Recyclematerials;
import com.imti.model.WorkBookDetailInfo;
import com.imti.service.RecycleService;
import com.imti.util.DateUtil;

/**
 * @�ļ���: RecycleServiceImpl.java
 * @�๦��˵��: ����վ��Ϣservice�ӿڵ�ʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��16������10:15:54
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��16������10:15:54</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class RecycleServiceImpl implements RecycleService{
	/**
	 * ������վDao�ӿڵ��룬����sql���Ĳ�ѯ
	 */
	@Autowired
	private RecycleDao recycleDao;
	/**
	 * �������վ����ӱ���Ϣ�ӿ�
	 */
	@Autowired
	private MaterialsInfoDao materialsInfoDao;
	/**
	 * �������վ��Ա���Dao�ӿ�
	 */
	@Autowired
	private EmpInfoDao empInfoDao;
	/**
	 * �ҵ����еĻ���վ��Ϣ������չʾ
	 */
	@Override
	public List<Recycle> findAllRecycle(Map<String, Object> map) {
		return recycleDao.findAllRecycle(map);
	}
	/**
	 * ��ѯ������Ϣ����������չʾ
	 */
	@Override
	public int findAllRecycleCount(Map<String, Object> map) {
		return recycleDao.findAllRecycleCount(map);
	}
	/**
	 * ������ӱ���Ϣ
	 */
	@Override
	public int addRecycleInfo(Recycle recycle, EmployeeInfo employeeInfo) {
		recycle.setRe_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		recycle.setRe_delflag(0);
		recycle.setRe_state(0);
		recycle.setRe_opt_id(employeeInfo.getEm_id());
		int reResult = recycleDao.addRecycleInfo(recycle);
		List<Recyclematerials> materialsList = recycle.getMaterialsList();
		List<Recycleemployeeinfo> empList = recycle.getEmpList();
		if(reResult > 0){
			int reMaxId = recycleDao.getRecycleMaxId();
			for(int i = 0; i < materialsList.size(); i++){
				Recyclematerials materialsInfo = materialsList.get(i);
				materialsInfo.setRm_state(0);
				materialsInfo.setRm_opt_id(employeeInfo.getEm_id());
				materialsInfo.setRm_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
				materialsInfo.setRm_delflag(0);
				materialsInfo.setRe_id(reMaxId);
				materialsInfoDao.addMaterialsInfo(materialsInfo);
			}
			/* ------------------------------------------------------- */
			for(int i = 0; i < empList.size(); i++){
				Recycleemployeeinfo empInfo = empList.get(i);
				empInfo.setRem_state(0);
				empInfo.setRem_opt_id(employeeInfo.getEm_id());
				empInfo.setRem_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
				empInfo.setRem_delflag(0);
				empInfo.setRe_id(reMaxId);
				empInfoDao.addEmpInfo(empInfo);
			}
		}
		return reResult;
	}
	/**
	 * ����վ��������վɾ������
	 */
	@Override
	public int deleteRecycleInfo(int re_id) {
		int reResult = recycleDao.deleteRecycleInfo(re_id);
		if(reResult > 0){
			materialsInfoDao.deleteMaterialsInfo(re_id);
			empInfoDao.deleteEmpInfo(re_id);
		}
		return reResult;
	}
	/**
	 * ��ѯ���л���վ������Ϣ�����������б�
	 */
	@Override
	public List<Recyclematerials> findAllNameByRecycle() {
		return recycleDao.findAllNameByRecycle();
	}
	/**
	 * �޸Ļ���վ��Ϣ��ʵ����
	 */
	@Override
	public int updateRecycleInfo(Recycle recycle, EmployeeInfo employeeInfo) {
		int result = recycleDao.updateRecycleInfo(recycle);
		/* ����޸�����ťʱ���ж��ӱ�(����վԱ����Ϣ��)����ɾ�Ĳ��߼� */
		List<Recycleemployeeinfo> oldEmpList = empInfoDao.findRecycleEmpInfoByReId(recycle.getRe_id());
		List<Recycleemployeeinfo> newEmpList = recycle.getEmpList();
		/* ���ж��Ƿ�Ϊɾ������ */
		if(oldEmpList != null){
			for(Recycleemployeeinfo oldRei:oldEmpList){
				boolean flag = true;
				if(newEmpList != null){
					for(Recycleemployeeinfo newRei:newEmpList){
						if(newRei.getRem_id() != null && newRei.getRem_id() == oldRei.getRem_id()){
							flag = false;
						}
					}
				}
				if(flag){
					empInfoDao.delEmpInfo(oldRei.getRem_id());
				}
			}
		}
		/* ���ж��Ƿ�Ϊ�������޸� */
		if(newEmpList != null){
			for(Recycleemployeeinfo newRei:newEmpList){
				if (newRei.getRem_id() == null) {
					newRei.setRe_id(recycle.getRe_id());
					newRei.setRem_state(0);
					newRei.setRem_delflag(0);
					newRei.setRem_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
					newRei.setRem_opt_id(employeeInfo.getEm_id());
					empInfoDao.addEmpInfo(newRei);
				} else {
					empInfoDao.updEmpInfo(newRei);
				}
			}
		}
		/* ����޸�����ťʱ���ж��ӱ�(����վ������Ϣ��)����ɾ�Ĳ��߼� */
		List<Recyclematerials> oldMaterialsList = materialsInfoDao.findRecycleMaterialsInfoByReId(recycle.getRe_id());
		List<Recyclematerials> newMaterialsList = recycle.getMaterialsList();
		if(oldMaterialsList != null){
			for(Recyclematerials oldRm:oldMaterialsList){
				boolean flag = true;
				if(newMaterialsList != null){
					for(Recyclematerials newRm:newMaterialsList){
						if(newRm.getRm_id() != null && newRm.getRm_id() == oldRm.getRm_id()){
							flag = false;
						}
					}
				}
				if(flag){
					materialsInfoDao.delMaterialsInfo(oldRm.getRm_id());
				}
			}
		}
		if(newMaterialsList != null){
			for(Recyclematerials newRm:newMaterialsList){
				if(newRm.getRm_id() == null){
					newRm.setRe_id(recycle.getRe_id());
					newRm.setRm_delflag(0);
					newRm.setRm_state(0);
					newRm.setRm_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
					newRm.setRm_opt_id(employeeInfo.getEm_id());
					materialsInfoDao.addMaterialsInfo(newRm);
				} else{
					materialsInfoDao.updMaterialsInfo(newRm);
				}
			}
		}
		return result;
	}
	
}
