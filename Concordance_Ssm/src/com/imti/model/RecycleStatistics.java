package com.imti.model;
/**
 * @�ļ���: RecycleStatistics.java
 * @�๦��˵��: ��װ����վͳ����Ҫ���ֶ�
 * @����: wangyuntian
 * @Email: 841589654@qq.com
 * @����: 2020��3��20������11:12:28
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: wangyuntian</li> 
 * 	 <li>����: 2020��3��20������11:12:28</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class RecycleStatistics {

	private Integer re_id;/*����վId*/
	private String re_name;/*����վ����*/
	private String re_createTime;/*����վ����ʱ��*/
	private String co_name;/*С������*/
	private Integer rs_empsum;/*��Ա����*/
	private Integer rs_ordersum;/*��������*/
	private Integer rs_storagesum;/*�������*/
	private Integer rs_recyclesum;/*��������*/
	
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
