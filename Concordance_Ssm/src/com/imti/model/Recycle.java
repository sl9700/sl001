package com.imti.model;

import java.util.List;

/**
 * @文件名: Recycle.java
 * @类功能说明: 回收站信息表实体类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月13日下午1:52:08
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月13日下午1:52:08</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Recycle {

	private Integer re_id;	//回收站信息表主键
	private Integer co_id;	//小区id(外键)
	private String re_name;	//回收站名称
	private String re_coordinate;	//坐标
	private String re_recycletime;	//开放时间
	private Double re_capacity;	//容量(kg)
	private String re_iconCls;	//图标
	private Integer re_state;	//状态
	private Integer re_delflag;	//删除标记（0为未删除，1为删除，默认0）
	private String re_createTime;	//创建时间
	private Integer re_opt_id;	//操作人
	private String re_remark;	//备注
	
	private List<Recyclematerials> materialsList;	//将回收站物资表注入回收站信息实体类中
	private List<Recycleemployeeinfo> empList;	//将回收站人员注入回收站信息实体类中
	
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
