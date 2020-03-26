package com.imti.model;

public class VehicleDispach {
	private Integer vd_id;/*编号(主键)*/
	private Integer ve_id;/*车辆信息id(外键)*/
	private Integer em_id;/*内部人员id(外键)*/
	private	String vd_company;/*所属单位*/
	private String vd_borrowTime;/*借用时间*/
	private String vd_returnTime;/*归还时间*/
	private String vd_useCompany;/*使用单位*/
	private String vd_state;/*状态*/
	private Integer vd_delflag;/*删除标记*/
	private String vd_createTime;/*创建时间*/
	private String vd_opt_id;/*操作人*/
	private String vd_remark;/*备注*/
	private String em_name;
	private String ve_license;
	private String ve_firm;
	private String ve_capacity;
	private String ve_type;
	
	
	public VehicleDispach() {}



	public VehicleDispach(Integer vd_id, Integer ve_id, Integer em_id, String vd_company, String vd_borrowTime,
			String vd_returnTime, String vd_useCompany, String vd_state, Integer vd_delflag, String vd_createTime,
			String vd_opt_id, String vd_remark, String em_name, String ve_license, String ve_firm, String ve_capacity,
			String ve_type) {
		super();
		this.vd_id = vd_id;
		this.ve_id = ve_id;
		this.em_id = em_id;
		this.vd_company = vd_company;
		this.vd_borrowTime = vd_borrowTime;
		this.vd_returnTime = vd_returnTime;
		this.vd_useCompany = vd_useCompany;
		this.vd_state = vd_state;
		this.vd_delflag = vd_delflag;
		this.vd_createTime = vd_createTime;
		this.vd_opt_id = vd_opt_id;
		this.vd_remark = vd_remark;
		this.em_name = em_name;
		this.ve_license = ve_license;
		this.ve_firm = ve_firm;
		this.ve_capacity = ve_capacity;
		this.ve_type = ve_type;
	}










	public String getVd_opt_id() {
		return vd_opt_id;
	}










	public void setVd_opt_id(String vd_opt_id) {
		this.vd_opt_id = vd_opt_id;
	}










	public String getVe_capacity() {
		return ve_capacity;
	}










	public void setVe_capacity(String ve_capacity) {
		this.ve_capacity = ve_capacity;
	}










	public String getVe_type() {
		return ve_type;
	}










	public void setVe_type(String ve_type) {
		this.ve_type = ve_type;
	}










	public String getVe_firm() {
		return ve_firm;
	}





	public void setVe_firm(String ve_firm) {
		this.ve_firm = ve_firm;
	}





	public Integer getVd_id() {
		return vd_id;
	}


	public void setVd_id(Integer vd_id) {
		this.vd_id = vd_id;
	}


	public Integer getVe_id() {
		return ve_id;
	}


	public void setVe_id(Integer ve_id) {
		this.ve_id = ve_id;
	}


	public Integer getEm_id() {
		return em_id;
	}


	public void setEm_id(Integer em_id) {
		this.em_id = em_id;
	}


	public String getVd_company() {
		return vd_company;
	}


	public void setVd_company(String vd_company) {
		this.vd_company = vd_company;
	}


	public String getVd_borrowTime() {
		return vd_borrowTime;
	}


	public void setVd_borrowTime(String vd_borrowTime) {
		this.vd_borrowTime = vd_borrowTime;
	}


	public String getVd_returnTime() {
		return vd_returnTime;
	}


	public void setVd_returnTime(String vd_returnTime) {
		this.vd_returnTime = vd_returnTime;
	}


	public String getVd_useCompany() {
		return vd_useCompany;
	}


	public void setVd_useCompany(String vd_useCompany) {
		this.vd_useCompany = vd_useCompany;
	}


	public String getVd_state() {
		return vd_state;
	}


	public void setVd_state(String vd_state) {
		this.vd_state = vd_state;
	}


	public Integer getVd_delflag() {
		return vd_delflag;
	}


	public void setVd_delflag(Integer vd_delflag) {
		this.vd_delflag = vd_delflag;
	}


	public String getVd_createTime() {
		return vd_createTime;
	}


	public void setVd_createTime(String vd_createTime) {
		this.vd_createTime = vd_createTime;
	}




	public String getVd_remark() {
		return vd_remark;
	}


	public void setVd_remark(String vd_remark) {
		this.vd_remark = vd_remark;
	}


	public String getEm_name() {
		return em_name;
	}


	public void setEm_name(String em_name) {
		this.em_name = em_name;
	}


	public String getVe_license() {
		return ve_license;
	}


	public void setVe_license(String ve_license) {
		this.ve_license = ve_license;
	}


	@Override
	public String toString() {
		return "VehicleDispach [vd_id=" + vd_id + ", ve_id=" + ve_id + ", em_id=" + em_id + ", vd_company=" + vd_company
				+ ", vd_borrowTime=" + vd_borrowTime + ", vd_returnTime=" + vd_returnTime + ", vd_useCompany="
				+ vd_useCompany + ", vd_state=" + vd_state + ", vd_delflag=" + vd_delflag + ", vd_createTime="
				+ vd_createTime + ", vd_opt_id=" + vd_opt_id + ", vd_remark=" + vd_remark + ", em_name=" + em_name
				+ ", ve_license=" + ve_license + "]";
	}
	


	
}
