package com.imti.dao;

import java.util.List;

import com.imti.model.Recycleemployeeinfo;

/**
 * @�ļ���: EmpInfoDao.java
 * @�๦��˵��: 
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��17������9:22:39
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��17������9:22:39</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface EmpInfoDao {
	/**
	 * @������: addEmpInfo
	 * @����˵��: ��ӻ���վ��Ա�������Ϣ���ӱ��dao�ӿڣ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������9:36:13
	 * @param recycleemployeeinfo
	 * @return
	 * @return: int
	 */
	public int addEmpInfo(Recycleemployeeinfo recycleemployeeinfo);
	
	/**
	 * @������: deleteEmpInfo
	 * @����˵��: ɾ������վ��Ա��Ϣ(�ӱ�)�Ľӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������4:10:17
	 * @param re_id
	 * @return
	 * @return: int
	 */
	public int deleteEmpInfo(int re_id);
	/**
	 * @������: findRecycleInfoByReId
	 * @����˵��: ����վ�޸ı�ʱ�ķ�������ȡ�ɱ�������Ϣ��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������11:54:14
	 * @param re_id
	 * @return
	 * @return: List<Recycleemployeeinfo>
	 */
	public List<Recycleemployeeinfo> findRecycleEmpInfoByReId(int re_id);
	/**
	 * @������: delEmpInfo
	 * @����˵��: ɾ���ӱ���Ϣ����dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������11:56:13
	 * @param rem_id
	 * @return
	 * @return: int
	 */
	public int delEmpInfo(int rem_id);
	/**
	 * @������: updEmpInfo
	 * @����˵��: �޸Ļ���վ�ӱ���Ϣ��dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������11:59:06
	 * @param newRei
	 * @return
	 * @return: int
	 */
	public int updEmpInfo(Recycleemployeeinfo newRei);
	
}
