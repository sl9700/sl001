package com.imti.model;
/**@�ļ���: MaterialType.java
 * @�๦��˵��: ��������ʵ����
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��1������5:06:46
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��1������5:06:46</li> 
 *	 <li>����: </li>
 * </pre>
 */

import java.util.List;

public class MaterialType {
	private	Integer				  mt_id					;//	���(����)
	private	String				  mt_name				;//	��������
	private	Integer				  mt_delflag			;//	ɾ����ǣ�0Ϊδɾ����1Ϊɾ����Ĭ��0��
	private	Integer				  mt_state				;//	״̬
	private	String				  mt_createTime			;//	����ʱ��
	private	Integer				  mt_opt_id				;//	������
	private	String				  mt_remark				;//	��ע
	private List<MaterialsManage> MaManageList			;//��������
	public Integer getMt_id() {
		return mt_id;
	}
	public void setMt_id(Integer mt_id) {
		this.mt_id = mt_id;
	}
	public String getMt_name() {
		return mt_name;
	}
	public void setMt_name(String mt_name) {
		this.mt_name = mt_name;
	}
	public Integer getMt_delflag() {
		return mt_delflag;
	}
	public void setMt_delflag(Integer mt_delflag) {
		this.mt_delflag = mt_delflag;
	}
	public Integer getMt_state() {
		return mt_state;
	}
	public void setMt_state(Integer mt_state) {
		this.mt_state = mt_state;
	}
	public String getMt_createTime() {
		return mt_createTime;
	}
	public void setMt_createTime(String mt_createTime) {
		this.mt_createTime = mt_createTime;
	}
	public Integer getMt_opt_id() {
		return mt_opt_id;
	}
	public void setMt_opt_id(Integer mt_opt_id) {
		this.mt_opt_id = mt_opt_id;
	}
	public String getMt_remark() {
		return mt_remark;
	}
	public void setMt_remark(String mt_remark) {
		this.mt_remark = mt_remark;
	}
	public List<MaterialsManage> getMaManageList() {
		return MaManageList;
	}
	public void setMaManageList(List<MaterialsManage> maManageList) {
		MaManageList = maManageList;
	}
	
	
}
