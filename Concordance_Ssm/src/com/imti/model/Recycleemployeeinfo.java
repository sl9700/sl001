package com.imti.model;
/**
 * @文件名: Recycleemployeeinfo.java
 * @类功能说明: 回收站员工信息表实体类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月13日下午1:58:57
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月13日下午1:58:57</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Recycleemployeeinfo {

	private Integer rem_id;	//编号(主键)
	private Integer re_id;	//回收站id(外键)
	private String re_name;	//回收站名称（关联查询）
	private Integer em_id;	//内部人员id(外键)
	private String em_name;	//内部人员名称（关联查询）
	private Integer em_delflag;	//删除标记（0为未删除，1为删除，默认0）
	private String rem_obligation;	//职责
	private Integer rem_delflag;	//删除标记（0为未删除，1为删除，默认0）
	private Integer rem_state;	//状态
	private String rem_createTime;	//创建时间
	private Integer rem_opt_id;	//操作人
	private String rem_remark;	//备注
	
	
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
