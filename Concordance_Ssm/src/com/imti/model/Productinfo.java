package com.imti.model;
/**
 * @文件名: Productinfo.java
 * @类功能说明: 回收站入库表实体类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月13日下午1:45:01
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月13日下午1:45:01</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Productinfo {

	private Integer pr_id;	//主键
	private Integer rco_id;	//订单ID外键
	private Integer rco_ids;	//订单编号
	private Integer re_id;	//回收站ID外键
	private String re_name;	//回收站名称
	private String pr_entryTime;	//入库时间
	private Double pr_weight;	//垃圾重量
	private Integer pr_state;	//状态
	private Integer pr_delflag;	//删除标记
	private String pr_createTime;	//创建时间
	private Integer pr_opt_id;	//操作人
	private String pr_remark;	//备注
	
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
