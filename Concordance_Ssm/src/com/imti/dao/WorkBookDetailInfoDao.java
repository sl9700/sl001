package com.imti.dao;

import java.util.List;

import com.imti.model.WorkBookDetailInfo;

/**
 * @�ļ���: WorkBookDetailDao.java
 * @�๦��˵��: ��ѯ�ӱ���Ϣ�Ľӿ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��9������8:51:05
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��9������8:51:05</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface WorkBookDetailInfoDao {
	/**
	 * @������: findWorkBookDetilByWbId
	 * @����˵��: ��ѯ�ӱ�Ľӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������8:52:56
	 * @return
	 * @return: List<WorkBookDetailInfo>
	 */
	public List<WorkBookDetailInfo> findWorkBookDetailInfoByWbId(int wb_id);
	/**
	 * @������: addWorkBookDetailInfo
	 * @����˵��: ��������ֵ��ӱ�dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:56:18
	 * @param workBookDetailInfo
	 * @return
	 * @return: int
	 */
	public int addWorkBookDetailInfo(WorkBookDetailInfo workBookDetailInfo);
	/**
	 * @������: deleteWorkBookDetailInfo
	 * @����˵��: ɾ�������ֵ��ӱ�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:56:36
	 * @param wb_id
	 * @return
	 * @return: int
	 */
	public int deleteWorkBookDetailInfo(int wb_id);
	/**
	 * @������: delWorkBookDetailInfo
	 * @����˵��: ����޸�ʱ��ɾ���ӱ���Ϣ��dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��12������2:26:18
	 * @param wdb_id
	 * @return
	 * @return: int
	 */
	public int delWorkBookDetailInfo(int wdb_id);
	/**
	 * @������: updateWorkBookDetailInfo
	 * @����˵��: �޸��ӱ���Ϣʱ��update�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��12������2:26:46
	 * @param workBookDetailInfo
	 * @return
	 * @return: int
	 */
	public int updateWorkBookDetailInfo(WorkBookDetailInfo workBookDetailInfo);
	
}
