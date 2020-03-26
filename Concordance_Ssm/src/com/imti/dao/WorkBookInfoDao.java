package com.imti.dao;

import java.util.List;
import java.util.Map;
import com.imti.model.WorkBookInfo;

/**
 * @�ļ���: WorkBookInfoDao.java
 * @�๦��˵��: �����ֵ�Dao�ӿڲ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��9������7:43:50
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��9������7:43:50</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface WorkBookInfoDao {
	/**
	 * @������: findAllworkBook
	 * @����˵��: �������������ֵ������dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:57:03
	 * @param map
	 * @return
	 * @return: List<WorkBookInfo>
	 */
	public List<WorkBookInfo> findAllworkBook(Map<String, Object> map);
	/**
	 * @������: findAllworkBookCount
	 * @����˵��: ��ѯ�����ֵ��������������ڷ�ҳ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:57:34
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllworkBookCount(Map<String, Object> map);
	/**
	 * @������: addWorkBookInfo
	 * @����˵��: ��������ֵ�������Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:57:57
	 * @param workBookInfo
	 * @return
	 * @return: int
	 */
	public int addWorkBookInfo(WorkBookInfo workBookInfo);
	/**
	 * @������: getWorkBookInfoMaxId
	 * @����˵��: ��ȡ��ǰ�������������ֵ��������������ֵ��ӱ�ģ����������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:58:30
	 * @return
	 * @return: int
	 */
	public int getWorkBookInfoMaxId();
	/**
	 * @������: deleteWorkBookInfo
	 * @����˵��: ɾ�������ֵ�������Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:59:14
	 * @param wb_id
	 * @return
	 * @return: int
	 */
	public int deleteWorkBookInfo(int wb_id);
	/**
	 * @������: updateWorkBookInfo
	 * @����˵��: �޸�������Ϣ��dao�ӿ�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��12������2:27:23
	 * @param workBookInfo
	 * @return
	 * @return: int
	 */
	public int updateWorkBookInfo(WorkBookInfo workBookInfo);

}
