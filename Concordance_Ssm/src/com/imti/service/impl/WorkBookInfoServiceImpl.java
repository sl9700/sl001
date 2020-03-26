package com.imti.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.WorkBookDetailInfoDao;
import com.imti.dao.WorkBookInfoDao;
import com.imti.model.EmployeeInfo;
import com.imti.model.WorkBookDetailInfo;
import com.imti.model.WorkBookInfo;
import com.imti.service.WorkBookInfoService;
import com.imti.util.DateUtil;

/**
 * @�ļ���: WorkBookInfoServiceImpl.java
 * @�๦��˵��: �����ֵ�serviceʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��9������7:40:20
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��9������7:40:20</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class WorkBookInfoServiceImpl implements WorkBookInfoService{
	/**
	 * �����ֵ�������Ϣ��dao�ӿ�
	 */
	@Autowired
	private WorkBookInfoDao workBookInfoDao;
	/**
	 * �����ֵ��ӱ��dao�ӿ�
	 */
	@Autowired
	private WorkBookDetailInfoDao workBookDetailInfoDao;
	/**
	 * ��ʾ��������ķ���
	 */
	@Override
	public List<WorkBookInfo> findAllworkBook(Map<String, Object> map) {
		return workBookInfoDao.findAllworkBook(map);
	}
	/**
	 * ��ѯ�������������ڷ�ҳ
	 */
	@Override
	public int findAllworkBookCount(Map<String, Object> map) {
		return workBookInfoDao.findAllworkBookCount(map);
	}
	/**
	 * ������Ϣʱ�ķ���
	 */
	@Override
	public int addWorkBookInfo(WorkBookInfo workBookInfo,EmployeeInfo employeeInfo) {
		workBookInfo.setWb_optId(employeeInfo.getEm_id());
		workBookInfo.setWb_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		workBookInfo.setWb_delflag(0);
		workBookInfo.setWb_state(0);
		int wbResult = workBookInfoDao.addWorkBookInfo(workBookInfo);
		List<WorkBookDetailInfo> wbdList = workBookInfo.getWbdList();
		if(wbResult > 0){
			int wbMaxId = workBookInfoDao.getWorkBookInfoMaxId();
			for(int i = 0;i < wbdList.size();i++){
				WorkBookDetailInfo wbdInfo = wbdList.get(i);
				wbdInfo.setWbd_delflag(0);
				wbdInfo.setWbd_optId(employeeInfo.getEm_id());
				wbdInfo.setWbd_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
				wbdInfo.setWbd_state(0);
				wbdInfo.setWb_id(wbMaxId);
				workBookDetailInfoDao.addWorkBookDetailInfo(wbdInfo);
			}
		}
		return wbResult;
	}
	/**
	 * ɾ�������ֵ��е��������õķ���
	 */
	@Override
	public int deleteWorkBookInfo(int wb_id) {
		int wbResult = workBookInfoDao.deleteWorkBookInfo(wb_id);
		if(wbResult > 0){
			workBookDetailInfoDao.deleteWorkBookDetailInfo(wb_id);
		}
		return wbResult;
	}
	/**
	 * �����ֵ��е��޸İ�ťservice�����
	 */
	@Override
	public int updateWorkBookInfo(WorkBookInfo workBookInfo,EmployeeInfo employeeInfo) {
		int result = workBookInfoDao.updateWorkBookInfo(workBookInfo);
		List<WorkBookDetailInfo> oldWbdList = workBookDetailInfoDao.findWorkBookDetailInfoByWbId(workBookInfo.getWb_id());
		List<WorkBookDetailInfo> newWbdList = workBookInfo.getWbdList();
		if(oldWbdList != null){
			for(WorkBookDetailInfo oldWbd:oldWbdList){
				boolean flag = true;
				if(newWbdList != null){
					for(WorkBookDetailInfo newWbd:newWbdList){
						if(newWbd.getWbd_id() != null && newWbd.getWbd_id() == oldWbd.getWbd_id()){
							flag = false;
						}
					}
				}
				if(flag){
					workBookDetailInfoDao.delWorkBookDetailInfo(oldWbd.getWbd_id());
				}
			}
		}
		if(newWbdList != null){
			for(WorkBookDetailInfo newWbd:newWbdList){
				if(newWbd.getWbd_id() == null){
					newWbd.setWb_id(workBookInfo.getWb_id());
					newWbd.setWbd_delflag(0);
					newWbd.setWbd_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
					newWbd.setWbd_state(0);
					newWbd.setWbd_optId(employeeInfo.getEm_id());
					workBookDetailInfoDao.addWorkBookDetailInfo(newWbd);
				}else {
					workBookDetailInfoDao.updateWorkBookDetailInfo(newWbd);
				}
			}
		}
		return result;
	}

}
