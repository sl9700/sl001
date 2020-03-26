package com.imti.model;
/**
 * @文件名: RecycleStatistics.java
 * @类功能说明: 封装回收站统计需要的字段
 * @作者: wangyuntian
 * @Email: 841589654@qq.com
 * @日期: 2020年3月20日上午11:12:28
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: wangyuntian</li> 
 * 	 <li>日期: 2020年3月20日上午11:12:28</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class RecycleStatistics {

	private Integer re_id;/*回收站Id*/
	private String re_name;/*回收站名称*/
	private String re_createTime;/*回收站创建时间*/
	private String co_name;/*小区名称*/
	private Integer rs_empsum;/*人员总量*/
	private Integer rs_ordersum;/*订单总量*/
	private Integer rs_storagesum;/*入库总量*/
	private Integer rs_recyclesum;/*回收总量*/
	
	public Integer getRe_id() {
		return re_id;
	}
	public String getRe_name() {
		return re_name;
	}
	public String getRe_createTime() {
		return re_createTime;
	}
	public String getCo_name() {
		return co_name;
	}
	public Integer getRs_empsum() {
		return rs_empsum;
	}
	public Integer getRs_ordersum() {
		return rs_ordersum;
	}
	public Integer getRs_storagesum() {
		return rs_storagesum;
	}
	public Integer getRs_recyclesum() {
		return rs_recyclesum;
	}
	public void setRe_id(Integer re_id) {
		this.re_id = re_id;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	public void setRe_createTime(String re_createTime) {
		this.re_createTime = re_createTime;
	}
	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}
	public void setRs_empsum(Integer rs_empsum) {
		this.rs_empsum = rs_empsum;
	}
	public void setRs_ordersum(Integer rs_ordersum) {
		this.rs_ordersum = rs_ordersum;
	}
	public void setRs_storagesum(Integer rs_storagesum) {
		this.rs_storagesum = rs_storagesum;
	}
	public void setRs_recyclesum(Integer rs_recyclesum) {
		this.rs_recyclesum = rs_recyclesum;
	}
	
	
}
