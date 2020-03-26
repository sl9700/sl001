package com.imti.model;

import java.util.List;

/**
 * @�ļ���: Recycle.java
 * @�๦��˵��: ����վ��Ϣ��ʵ����
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��13������1:52:08
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��13������1:52:08</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class Recycle {

	private Integer re_id;	//����վ��Ϣ������
	private Integer co_id;	//С��id(���)
	private String re_name;	//����վ����
	private String re_coordinate;	//����
	private String re_recycletime;	//����ʱ��
	private Double re_capacity;	//����(kg)
	private String re_iconCls;	//ͼ��
	private Integer re_state;	//״̬
	private Integer re_delflag;	//ɾ����ǣ�0Ϊδɾ����1Ϊɾ����Ĭ��0��
	private String re_createTime;	//����ʱ��
	private Integer re_opt_id;	//������
	private String re_remark;	//��ע
	
	private List<Recyclematerials> materialsList;	//������վ���ʱ�ע�����վ��Ϣʵ������
	private List<Recycleemployeeinfo> empList;	//������վ��Աע�����վ��Ϣʵ������
	
	public Integer getRe_id() {
		return re_id;
	}
	public void setRe_id(Integer re_id) {
		this.re_id = re_id;
	}
	public Integer getCo_id() {
		return co_id;
	}
	public void setCo_id(Integer co_id) {
		this.co_id = co_id;
	}
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	public String getRe_coordinate() {
		return re_coordinate;
	}
	public void setRe_coordinate(String re_coordinate) {
		this.re_coordinate = re_coordinate;
	}
	public String getRe_recycletime() {
		return re_recycletime;
	}
	public void setRe_recycletime(String re_recycletime) {
		this.re_recycletime = re_recycletime;
	}
	public Double getRe_capacity() {
		return re_capacity;
	}
	public void setRe_capacity(Double re_capacity) {
		this.re_capacity = re_capacity;
	}
	public String getRe_iconCls() {
		return re_iconCls;
	}
	public void setRe_iconCls(String re_iconCls) {
		this.re_iconCls = re_iconCls;
	}
	public Integer getRe_state() {
		return re_state;
	}
	public void setRe_state(Integer re_state) {
		this.re_state = re_state;
	}
	public Integer getRe_delflag() {
		return re_delflag;
	}
	public void setRe_delflag(Integer re_delflag) {
		this.re_delflag = re_delflag;
	}
	public String getRe_createTime() {
		return re_createTime;
	}
	public void setRe_createTime(String re_createTime) {
		this.re_createTime = re_createTime;
	}
	public Integer getRe_opt_id() {
		return re_opt_id;
	}
	public void setRe_opt_id(Integer re_opt_id) {
		this.re_opt_id = re_opt_id;
	}
	public String getRe_remark() {
		return re_remark;
	}
	public void setRe_remark(String re_remark) {
		this.re_remark = re_remark;
	}
	public List<Recyclematerials> getMaterialsList() {
		return materialsList;
	}
	public void setMaterialsList(List<Recyclematerials> materialsList) {
		this.materialsList = materialsList;
	}
	public List<Recycleemployeeinfo> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Recycleemployeeinfo> empList) {
		this.empList = empList;
	}
	
	
	
	
}
