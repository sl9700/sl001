package com.imti.model;

import java.util.List;

/**
 * @文件名: WorkBookInfo.java
 * @类功能说明: 数据字典主表的实体类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月9日下午5:13:04
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月9日下午5:13:04</li> 
 *	 <li>内容: 数据字典主表的Javabean实体类</li>
 * </pre>
 */
public class WorkBookInfo {

	private Integer wb_id;	//数据字典主表的主键
	private String wb_name;	//数据字典的name
	private Integer wb_delflag;	//删除标记
	private Integer wb_state;	//状态
	private String wb_createTime;	//创建时间
	private Integer wb_optId;	//操作人
	private String wb_remark;	//备注
	
	private List<WorkBookDetailInfo> wbdList;	//将从表引入主表实体类

	public Integer getWb_id() {
		return wb_id;
	}

	public void setWb_id(Integer wb_id) {
		this.wb_id = wb_id;
	}

	public String getWb_name() {
		return wb_name;
	}

	public void setWb_name(String wb_name) {
		this.wb_name = wb_name;
	}

	public Integer getWb_delflag() {
		return wb_delflag;
	}

	public void setWb_delflag(Integer wb_delflag) {
		this.wb_delflag = wb_delflag;
	}

	public Integer getWb_state() {
		return wb_state;
	}

	public void setWb_state(Integer wb_state) {
		this.wb_state = wb_state;
	}

	public String getWb_createTime() {
		return wb_createTime;
	}

	public void setWb_createTime(String wb_createTime) {
		this.wb_createTime = wb_createTime;
	}

	public Integer getWb_optId() {
		return wb_optId;
	}

	public void setWb_optId(Integer wb_optId) {
		this.wb_optId = wb_optId;
	}

	public String getWb_remark() {
		return wb_remark;
	}

	public void setWb_remark(String wb_remark) {
		this.wb_remark = wb_remark;
	}

	public List<WorkBookDetailInfo> getWbdList() {
		return wbdList;
	}

	public void setWbdList(List<WorkBookDetailInfo> wbdList) {
		this.wbdList = wbdList;
	}

	@Override
	public String toString() {
		return "WorkBookInfo [wb_id=" + wb_id + ", wb_name=" + wb_name + ", wb_delflag=" + wb_delflag + ", wb_state="
				+ wb_state + ", wb_createTime=" + wb_createTime + ", wb_optId=" + wb_optId + ", wb_remark=" + wb_remark
				+ ", wbdList=" + wbdList + "]";
	}
	
	
}
