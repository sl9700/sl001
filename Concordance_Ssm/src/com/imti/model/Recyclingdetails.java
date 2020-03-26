package com.imti.model;
/**
 * @文件名: Recyclingdetails.java
 * @类功能说明: 回收站详细信息表实体类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月13日下午2:15:50
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月13日下午2:15:50</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Recyclingdetails {
	
	private	Integer	rd_id	;	//	编号(主键)
	private	Integer	sri_id	;	//	回收信息id(外键)
	private	Integer	re_id	;	//	回收站id(外键)
	private	Double	rd_weight	;	//	出库重量
	private	String	rd_stockTime	;	//	出库时间
	private	Integer	rd_principal	;	//	回收站负责人
	private	Integer	rd_delflag	;	//	删除标记(0为未删除,1为已删除,默认0)
	private	Integer	rd_state	;	//	状态
	private	String	rd_createTime	;	//	创建时间
	private	Integer	rd_opt_id	;	//	操作人
	private	String	rd_remark	;	//	备注
	public Integer getRd_id() {
		return rd_id;
	}
	public void setRd_id(Integer rd_id) {
		this.rd_id = rd_id;
	}
	public Integer getSri_id() {
		return sri_id;
	}
	public void setSri_id(Integer sri_id) {
		this.sri_id = sri_id;
	}
	public Integer getRe_id() {
		return re_id;
	}
	public void setRe_id(Integer re_id) {
		this.re_id = re_id;
	}
	public Double getRd_weight() {
		return rd_weight;
	}
	public void setRd_weight(Double rd_weight) {
		this.rd_weight = rd_weight;
	}
	public String getRd_stockTime() {
		return rd_stockTime;
	}
	public void setRd_stockTime(String rd_stockTime) {
		this.rd_stockTime = rd_stockTime;
	}
	public Integer getRd_principal() {
		return rd_principal;
	}
	public void setRd_principal(Integer rd_principal) {
		this.rd_principal = rd_principal;
	}
	public Integer getRd_delflag() {
		return rd_delflag;
	}
	public void setRd_delflag(Integer rd_delflag) {
		this.rd_delflag = rd_delflag;
	}
	public Integer getRd_state() {
		return rd_state;
	}
	public void setRd_state(Integer rd_state) {
		this.rd_state = rd_state;
	}
	public String getRd_createTime() {
		return rd_createTime;
	}
	public void setRd_createTime(String rd_createTime) {
		this.rd_createTime = rd_createTime;
	}
	public Integer getRd_opt_id() {
		return rd_opt_id;
	}
	public void setRd_opt_id(Integer rd_opt_id) {
		this.rd_opt_id = rd_opt_id;
	}
	public String getRd_remark() {
		return rd_remark;
	}
	public void setRd_remark(String rd_remark) {
		this.rd_remark = rd_remark;
	}
	
	
	
	
	
}
