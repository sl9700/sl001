package com.imti.model;
/**
 * @�ļ���: Recycleemployeeinfo.java
 * @�๦��˵��: ����վԱ����Ϣ��ʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��13������1:58:57
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��13������1:58:57</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class Recycleemployeeinfo {

	private Integer rem_id;	//���(����)
	private Integer re_id;	//����վid(���)
	private String re_name;	//����վ���ƣ�������ѯ��
	private Integer em_id;	//�ڲ���Աid(���)
	private String em_name;	//�ڲ���Ա���ƣ�������ѯ��
	private Integer em_delflag;	//ɾ����ǣ�0Ϊδɾ����1Ϊɾ����Ĭ��0��
	private String rem_obligation;	//ְ��
	private Integer rem_delflag;	//ɾ����ǣ�0Ϊδɾ����1Ϊɾ����Ĭ��0��
	private Integer rem_state;	//״̬
	private String rem_createTime;	//����ʱ��
	private Integer rem_opt_id;	//������
	private String rem_remark;	//��ע
	
	
	public Integer getEm_delflag() {
		return em_delflag;
	}
	public void setEm_delflag(Integer em_delflag) {
		this.em_delflag = em_delflag;
	}
	public Integer getRem_id() {
		return rem_id;
	}
	public void setRem_id(Integer rem_id) {
		this.rem_id = rem_id;
	}
	public Integer getRe_id() {
		return re_id;
	}
	public void setRe_id(Integer re_id) {
		this.re_id = re_id;
	}
	public Integer getEm_id() {
		return em_id;
	}
	public void setEm_id(Integer em_id) {
		this.em_id = em_id;
	}
	public String getRem_obligation() {
		return rem_obligation;
	}
	public void setRem_obligation(String rem_obligation) {
		this.rem_obligation = rem_obligation;
	}
	public Integer getRem_delflag() {
		return rem_delflag;
	}
	public void setRem_delflag(Integer rem_delflag) {
		this.rem_delflag = rem_delflag;
	}
	public Integer getRem_state() {
		return rem_state;
	}
	public void setRem_state(Integer rem_state) {
		this.rem_state = rem_state;
	}
	public String getRem_createTime() {
		return rem_createTime;
	}
	public void setRem_createTime(String rem_createTime) {
		this.rem_createTime = rem_createTime;
	}
	public Integer getRem_opt_id() {
		return rem_opt_id;
	}
	public void setRem_opt_id(Integer rem_opt_id) {
		this.rem_opt_id = rem_opt_id;
	}
	public String getRem_remark() {
		return rem_remark;
	}
	public void setRem_remark(String rem_remark) {
		this.rem_remark = rem_remark;
	}
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	public String getEm_name() {
		return em_name;
	}
	public void setEm_name(String em_name) {
		this.em_name = em_name;
	}
	
	
}
