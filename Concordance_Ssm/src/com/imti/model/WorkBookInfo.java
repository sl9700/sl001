package com.imti.model;

import java.util.List;

/**
 * @�ļ���: WorkBookInfo.java
 * @�๦��˵��: �����ֵ������ʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��9������5:13:04
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��9������5:13:04</li> 
 *	 <li>����: �����ֵ������Javabeanʵ����</li>
 * </pre>
 */
public class WorkBookInfo {

	private Integer wb_id;	//�����ֵ����������
	private String wb_name;	//�����ֵ��name
	private Integer wb_delflag;	//ɾ�����
	private Integer wb_state;	//״̬
	private String wb_createTime;	//����ʱ��
	private Integer wb_optId;	//������
	private String wb_remark;	//��ע
	
	private List<WorkBookDetailInfo> wbdList;	//���ӱ���������ʵ����

	public Integer getWb_id() {
		return wb_id;
	}

	public void setWb_id(Integer wb_id) {
		this.wb_id = wb_id;
	}

	public String getWb_name() {
		return wb_name;
	}

	public void setWb_name(String wb_name) {
		this.wb_name = wb_name;
	}

	public Integer getWb_delflag() {
		return wb_delflag;
	}

	public void setWb_delflag(Integer wb_delflag) {
		this.wb_delflag = wb_delflag;
	}

	public Integer getWb_state() {
		return wb_state;
	}

	public void setWb_state(Integer wb_state) {
		this.wb_state = wb_state;
	}

	public String getWb_createTime() {
		return wb_createTime;
	}

	public void setWb_createTime(String wb_createTime) {
		this.wb_createTime = wb_createTime;
	}

	public Integer getWb_optId() {
		return wb_optId;
	}

	public void setWb_optId(Integer wb_optId) {
		this.wb_optId = wb_optId;
	}

	public String getWb_remark() {
		return wb_remark;
	}

	public void setWb_remark(String wb_remark) {
		this.wb_remark = wb_remark;
	}

	public List<WorkBookDetailInfo> getWbdList() {
		return wbdList;
	}

	public void setWbdList(List<WorkBookDetailInfo> wbdList) {
		this.wbdList = wbdList;
	}

	@Override
	public String toString() {
		return "WorkBookInfo [wb_id=" + wb_id + ", wb_name=" + wb_name + ", wb_delflag=" + wb_delflag + ", wb_state="
				+ wb_state + ", wb_createTime=" + wb_createTime + ", wb_optId=" + wb_optId + ", wb_remark=" + wb_remark
				+ ", wbdList=" + wbdList + "]";
	}
	
	
}
