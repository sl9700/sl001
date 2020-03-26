package com.imti.model;

/**
 * @文件名: RoleInfo.java
 * @类功能说明: 角色信息实体
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月4日上午10:44:05
 * @修改说明:<br>
 * 
 *            <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月4日上午10:44:05</li> 
 *	 <li>内容: </li>
 *            </pre>
 */
public class RoleInfo {

	private Integer ro_id; // 编号(主键)
	private String ro_menuids; // 菜单id
	private String ro_name; // 角色名
	private Integer ro_state; // 状态
	private Integer ro_delflag; // 删除标记(0为未删除,1为已删除,默认0)
	private String ro_createTime; // 创建时间
	private Integer ro_opt_id; // 操作人
	private String ro_remark; // 备注
	public Integer getRo_id() {
		return ro_id;
	}
	public void setRo_id(Integer ro_id) {
		this.ro_id = ro_id;
	}
	public String getRo_menuids() {
		return ro_menuids;
	}
	public void setRo_menuids(String ro_menuids) {
		this.ro_menuids = ro_menuids;
	}
	public String getRo_name() {
		return ro_name;
	}
	public void setRo_name(String ro_name) {
		this.ro_name = ro_name;
	}
	public Integer getRo_state() {
		return ro_state;
	}
	public void setRo_state(Integer ro_state) {
		this.ro_state = ro_state;
	}
	public Integer getRo_delflag() {
		return ro_delflag;
	}
	public void setRo_delflag(Integer ro_delflag) {
		this.ro_delflag = ro_delflag;
	}
	public String getRo_createTime() {
		return ro_createTime;
	}
	public void setRo_createTime(String ro_createTime) {
		this.ro_createTime = ro_createTime;
	}
	public Integer getRo_opt_id() {
		return ro_opt_id;
	}
	public void setRo_opt_id(Integer ro_opt_id) {
		this.ro_opt_id = ro_opt_id;
	}
	public String getRo_remark() {
		return ro_remark;
	}
	public void setRo_remark(String ro_remark) {
		this.ro_remark = ro_remark;
	}
	
	
}
