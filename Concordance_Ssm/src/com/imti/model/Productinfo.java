package com.imti.model;
/**
 * @�ļ���: Productinfo.java
 * @�๦��˵��: ����վ����ʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��13������1:45:01
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��13������1:45:01</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class Productinfo {

	private Integer pr_id;	//����
	private Integer rco_id;	//����ID���
	private Integer rco_ids;	//�������
	private Integer re_id;	//����վID���
	private String re_name;	//����վ����
	private String pr_entryTime;	//���ʱ��
	private Double pr_weight;	//��������
	private Integer pr_state;	//״̬
	private Integer pr_delflag;	//ɾ�����
	private String pr_createTime;	//����ʱ��
	private Integer pr_opt_id;	//������
	private String pr_remark;	//��ע
	
	public Integer getRco_ids() {
		return rco_ids;
	}
	public void setRco_ids(Integer rco_ids) {
		this.rco_ids = rco_ids;
	}
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	public Integer getPr_id() {
		return pr_id;
	}
	public void setPr_id(Integer pr_id) {
		this.pr_id = pr_id;
	}
	public Integer getRco_id() {
		return rco_id;
	}
	public void setRco_id(Integer rco_id) {
		this.rco_id = rco_id;
	}
	public Integer getRe_id() {
		return re_id;
	}
	public void setRe_id(Integer re_id) {
		this.re_id = re_id;
	}
	public String getPr_entryTime() {
		return pr_entryTime;
	}
	public void setPr_entryTime(String pr_entryTime) {
		this.pr_entryTime = pr_entryTime;
	}
	public Double getPr_weight() {
		return pr_weight;
	}
	public void setPr_weight(Double pr_weight) {
		this.pr_weight = pr_weight;
	}
	public Integer getPr_state() {
		return pr_state;
	}
	public void setPr_state(Integer pr_state) {
		this.pr_state = pr_state;
	}
	public Integer getPr_delflag() {
		return pr_delflag;
	}
	public void setPr_delflag(Integer pr_delflag) {
		this.pr_delflag = pr_delflag;
	}
	public String getPr_createTime() {
		return pr_createTime;
	}
	public void setPr_createTime(String pr_createTime) {
		this.pr_createTime = pr_createTime;
	}
	public Integer getPr_opt_id() {
		return pr_opt_id;
	}
	public void setPr_opt_id(Integer pr_opt_id) {
		this.pr_opt_id = pr_opt_id;
	}
	public String getPr_remark() {
		return pr_remark;
	}
	public void setPr_remark(String pr_remark) {
		this.pr_remark = pr_remark;
	}
	
	
}
