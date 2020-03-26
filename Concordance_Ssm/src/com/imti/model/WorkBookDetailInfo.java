package com.imti.model;
/**
 * @文件名: WorkBookDetailInfo.java
 * @类功能说明: 数据字典从表的实体类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月9日下午5:14:10
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月9日下午5:14:10</li> 
 *	 <li>内容: 数据字典从表的Javabean实体类</li>
 * </pre>
 */
public class WorkBookDetailInfo {

	private Integer wbd_id;	// 数据字典从表主键
	private Integer wb_id;	// 主表-外键
	private String wbd_name;	// 从表内容
	private Integer wbd_delflag;	// 删除标记
	private Integer wbd_state;	// 状态
	private Integer wbd_optId;	// 操作人
	private String wbd_createTime;	//创建时间
	private String wbd_remark;	//备注
	public Integer getWbd_id() {
		return wbd_id;
	}
	public void setWbd_id(Integer wbd_id) {
		this.wbd_id = wbd_id;
	}
	public Integer getWb_id() {
		return wb_id;
	}
	public void setWb_id(Integer wb_id) {
		this.wb_id = wb_id;
	}
	public String getWbd_name() {
		return wbd_name;
	}
	public void setWbd_name(String wbd_name) {
		this.wbd_name = wbd_name;
	}
	public Integer getWbd_delflag() {
		return wbd_delflag;
	}
	public void setWbd_delflag(Integer wbd_delflag) {
		this.wbd_delflag = wbd_delflag;
	}
	public Integer getWbd_state() {
		return wbd_state;
	}
	public void setWbd_state(Integer wbd_state) {
		this.wbd_state = wbd_state;
	}
	public Integer getWbd_optId() {
		return wbd_optId;
	}
	public void setWbd_optId(Integer wbd_optId) {
		this.wbd_optId = wbd_optId;
	}
	public String getWbd_createTime() {
		return wbd_createTime;
	}
	public void setWbd_createTime(String wbd_createTime) {
		this.wbd_createTime = wbd_createTime;
	}
	public String getWbd_remark() {
		return wbd_remark;
	}
	public void setWbd_remark(String wbd_remark) {
		this.wbd_remark = wbd_remark;
	}
	
	
	
}
