package com.imti.model;

/**
 * @�ļ���: RoleInfo.java
 * @�๦��˵��: ��ɫ��Ϣʵ��
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��4������10:44:05
 * @�޸�˵��:<br>
 * 
 *            <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��4������10:44:05</li> 
 *	 <li>����: </li>
 *            </pre>
 */
public class RoleInfo {

	private Integer ro_id; // ���(����)
	private String ro_menuids; // �˵�id
	private String ro_name; // ��ɫ��
	private Integer ro_state; // ״̬
	private Integer ro_delflag; // ɾ�����(0Ϊδɾ��,1Ϊ��ɾ��,Ĭ��0)
	private String ro_createTime; // ����ʱ��
	private Integer ro_opt_id; // ������
	private String ro_remark; // ��ע
	public Integer getRo_id() {
		return ro_id;
	}
	public void setRo_id(Integer ro_id) {
		this.ro_id = ro_id;
	}
	public String getRo_menuids() {
		return ro_menuids;
	}
	public void setRo_menuids(String ro_menuids) {
		this.ro_menuids = ro_menuids;
	}
	public String getRo_name() {
		return ro_name;
	}
	public void setRo_name(String ro_name) {
		this.ro_name = ro_name;
	}
	public Integer getRo_state() {
		return ro_state;
	}
	public void setRo_state(Integer ro_state) {
		this.ro_state = ro_state;
	}
	public Integer getRo_delflag() {
		return ro_delflag;
	}
	public void setRo_delflag(Integer ro_delflag) {
		this.ro_delflag = ro_delflag;
	}
	public String getRo_createTime() {
		return ro_createTime;
	}
	public void setRo_createTime(String ro_createTime) {
		this.ro_createTime = ro_createTime;
	}
	public Integer getRo_opt_id() {
		return ro_opt_id;
	}
	public void setRo_opt_id(Integer ro_opt_id) {
		this.ro_opt_id = ro_opt_id;
	}
	public String getRo_remark() {
		return ro_remark;
	}
	public void setRo_remark(String ro_remark) {
		this.ro_remark = ro_remark;
	}
	
	
}
