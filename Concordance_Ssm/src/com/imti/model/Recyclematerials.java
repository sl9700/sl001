package com.imti.model;

/**
 * @�ļ���: Recyclematerials.java
 * @�๦��˵��: ����վ��ϸ��Ϣ��ʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��13������2:03:10
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��13������2:03:10</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class Recyclematerials {
	
	private Integer rm_id;	//���(����)
	private Integer re_id;	//����վid(���)
	private String re_name;	//����վ����
	private Integer re_delflag;	//ɾ����ǣ�0Ϊδɾ����1Ϊɾ����Ĭ��0��
	private Integer mm_id;	//����id(���)
	private String mm_name;	//��������
	private Integer mm_delflag;	//ɾ����ǣ�0Ϊδɾ����1Ϊɾ����Ĭ��0��
	private Integer rm_total;	//����
	private Integer rm_loss;	//�����
	private Integer rm_delflag;	//ɾ����ǣ�0Ϊδɾ����1Ϊɾ����Ĭ��0��
	private Integer rm_state;	//״̬
	private String rm_createTime;	//����ʱ��
	private Integer rm_opt_id;	//������
	private String rm_remark;	//��ע	
	
	/*private List<Materialsmanage> mmList;	//���ʹ����*/	
	
	
	public Integer getRm_id() {
		return rm_id;
	}
	public Integer getRe_delflag() {
		return re_delflag;
	}
	public void setRe_delflag(Integer re_delflag) {
		this.re_delflag = re_delflag;
	}
	public void setRm_id(Integer rm_id) {
		this.rm_id = rm_id;
	}
	public Integer getRe_id() {
		return re_id;
	}
	public void setRe_id(Integer re_id) {
		this.re_id = re_id;
	}
	public Integer getMm_id() {
		return mm_id;
	}
	public void setMm_id(Integer mm_id) {
		this.mm_id = mm_id;
	}
	public Integer getRm_total() {
		return rm_total;
	}
	public void setRm_total(Integer rm_total) {
		this.rm_total = rm_total;
	}
	public Integer getRm_loss() {
		return rm_loss;
	}
	public void setRm_loss(Integer rm_loss) {
		this.rm_loss = rm_loss;
	}
	public Integer getRm_delflag() {
		return rm_delflag;
	}
	public void setRm_delflag(Integer rm_delflag) {
		this.rm_delflag = rm_delflag;
	}
	public Integer getRm_state() {
		return rm_state;
	}
	public void setRm_state(Integer rm_state) {
		this.rm_state = rm_state;
	}
	public String getRm_createTime() {
		return rm_createTime;
	}
	public void setRm_createTime(String rm_createTime) {
		this.rm_createTime = rm_createTime;
	}
	public Integer getRm_opt_id() {
		return rm_opt_id;
	}
	public void setRm_opt_id(Integer rm_opt_id) {
		this.rm_opt_id = rm_opt_id;
	}
	public String getRm_remark() {
		return rm_remark;
	}
	public void setRm_remark(String rm_remark) {
		this.rm_remark = rm_remark;
	}
	
	/*public List<Materialsmanage> getMmList() {
		return mmList;
	}
	public void setMmList(List<Materialsmanage> mmList) {
		this.mmList = mmList;
	}*/
	
	public String getMm_name() {
		return mm_name;
	}
	public void setMm_name(String mm_name) {
		this.mm_name = mm_name;
	}
	
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	
	public Integer getMm_delflag() {
		return mm_delflag;
	}
	public void setMm_delflag(Integer mm_delflag) {
		this.mm_delflag = mm_delflag;
	}
	@Override
	public String toString() {
		return "Recyclematerials [rm_id=" + rm_id + ", re_id=" + re_id + ", re_name=" + re_name + ", mm_id=" + mm_id
				+ ", mm_name=" + mm_name + ", rm_total=" + rm_total + ", rm_loss=" + rm_loss + ", rm_delflag="
				+ rm_delflag + ", rm_state=" + rm_state + ", rm_createTime=" + rm_createTime + ", rm_opt_id="
				+ rm_opt_id + ", rm_remark=" + rm_remark + "]";
	}
	
	
	
}
