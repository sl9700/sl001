package com.imti.model;

public class VehicleInfo {
	private Integer ve_id;/*编号(主键)*/
	private String ve_license;/*车牌号*/
	private String ve_type;/*类型*/
	private	Integer ve_capacity;/*容量*/
	private String ve_firm;/*所属单位*/
	private String ve_upkeepTime;/*上次保养时间*/
	private String ve_examineTime;/*审车时间*/
	private String ve_insuranceCompany;/*保险公司*/
	private String ve_insuranceTime;/*保险时间*/
	private Integer ve_state;/*状态*/
	private Integer ve_delflag;/*删除标记*/
	private String ve_createTime;/*创建时间*/
	private Integer ve_opt_id;/*操作人*/
	private String ve_remark;/*备注*/
	
	public VehicleInfo() {}

	public VehicleInfo(Integer ve_id, String ve_license, String ve_type, Integer ve_capacity, String ve_firm,
			String ve_upkeepTime, String ve_examineTime, String ve_insuranceCompany, String ve_insuranceTime,
			Integer ve_state, Integer ve_delflag, String ve_createTime, Integer ve_opt_id, String ve_remark) {
		this.ve_id = ve_id;
		this.ve_license = ve_license;
		this.ve_type = ve_type;
		this.ve_capacity = ve_capacity;
		this.ve_firm = ve_firm;
		this.ve_upkeepTime = ve_upkeepTime;
		this.ve_examineTime = ve_examineTime;
		this.ve_insuranceCompany = ve_insuranceCompany;
		this.ve_insuranceTime = ve_insuranceTime;
		this.ve_state = ve_state;
		this.ve_delflag = ve_delflag;
		this.ve_createTime = ve_createTime;
		this.ve_opt_id = ve_opt_id;
		this.ve_remark = ve_remark;
	}

	public Integer getVe_id() {
		return ve_id;
	}

	public String getVe_license() {
		return ve_license;
	}

	public String getVe_type() {
		return ve_type;
	}

	public Integer getVe_capacity() {
		return ve_capacity;
	}

	public String getVe_firm() {
		return ve_firm;
	}

	public String getVe_upkeepTime() {
		return ve_upkeepTime;
	}

	public String getVe_examineTime() {
		return ve_examineTime;
	}

	public String getVe_insuranceCompany() {
		return ve_insuranceCompany;
	}

	public String getVe_insuranceTime() {
		return ve_insuranceTime;
	}

	public Integer getVe_state() {
		return ve_state;
	}

	public Integer getVe_delflag() {
		return ve_delflag;
	}

	public String getVe_createTime() {
		return ve_createTime;
	}

	public Integer getVe_opt_id() {
		return ve_opt_id;
	}

	public String getVe_remark() {
		return ve_remark;
	}

	public void setVe_id(Integer ve_id) {
		this.ve_id = ve_id;
	}

	public void setVe_license(String ve_license) {
		this.ve_license = ve_license;
	}

	public void setVe_type(String ve_type) {
		this.ve_type = ve_type;
	}

	public void setVe_capacity(Integer ve_capacity) {
		this.ve_capacity = ve_capacity;
	}

	public void setVe_firm(String ve_firm) {
		this.ve_firm = ve_firm;
	}

	public void setVe_upkeepTime(String ve_upkeepTime) {
		this.ve_upkeepTime = ve_upkeepTime;
	}

	public void setVe_examineTime(String ve_examineTime) {
		this.ve_examineTime = ve_examineTime;
	}

	public void setVe_insuranceCompany(String ve_insuranceCompany) {
		this.ve_insuranceCompany = ve_insuranceCompany;
	}

	public void setVe_insuranceTime(String ve_insuranceTime) {
		this.ve_insuranceTime = ve_insuranceTime;
	}

	public void setVe_state(Integer ve_state) {
		this.ve_state = ve_state;
	}

	public void setVe_delflag(Integer ve_delflag) {
		this.ve_delflag = ve_delflag;
	}

	public void setVe_createTime(String ve_createTime) {
		this.ve_createTime = ve_createTime;
	}

	public void setVe_opt_id(Integer ve_opt_id) {
		this.ve_opt_id = ve_opt_id;
	}

	public void setVe_remark(String ve_remark) {
		this.ve_remark = ve_remark;
	}
	
	
}
