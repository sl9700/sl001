package com.imti.model;
/**
 * @�ļ���: WorkBookDetailInfo.java
 * @�๦��˵��: �����ֵ�ӱ��ʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��9������5:14:10
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��9������5:14:10</li> 
 *	 <li>����: �����ֵ�ӱ��Javabeanʵ����</li>
 * </pre>
 */
public class WorkBookDetailInfo {

	private Integer wbd_id;	// �����ֵ�ӱ�����
	private Integer wb_id;	// ����-���
	private String wbd_name;	// �ӱ�����
	private Integer wbd_delflag;	// ɾ�����
	private Integer wbd_state;	// ״̬
	private Integer wbd_optId;	// ������
	private String wbd_createTime;	//����ʱ��
	private String wbd_remark;	//��ע
	public Integer getWbd_id() {
		return wbd_id;
	}
	public void setWbd_id(Integer wbd_id) {
		this.wbd_id = wbd_id;
	}
	public Integer getWb_id() {
		return wb_id;
	}
	public void setWb_id(Integer wb_id) {
		this.wb_id = wb_id;
	}
	public String getWbd_name() {
		return wbd_name;
	}
	public void setWbd_name(String wbd_name) {
		this.wbd_name = wbd_name;
	}
	public Integer getWbd_delflag() {
		return wbd_delflag;
	}
	public void setWbd_delflag(Integer wbd_delflag) {
		this.wbd_delflag = wbd_delflag;
	}
	public Integer getWbd_state() {
		return wbd_state;
	}
	public void setWbd_state(Integer wbd_state) {
		this.wbd_state = wbd_state;
	}
	public Integer getWbd_optId() {
		return wbd_optId;
	}
	public void setWbd_optId(Integer wbd_optId) {
		this.wbd_optId = wbd_optId;
	}
	public String getWbd_createTime() {
		return wbd_createTime;
	}
	public void setWbd_createTime(String wbd_createTime) {
		this.wbd_createTime = wbd_createTime;
	}
	public String getWbd_remark() {
		return wbd_remark;
	}
	public void setWbd_remark(String wbd_remark) {
		this.wbd_remark = wbd_remark;
	}
	
	
	
}
