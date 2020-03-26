package com.imti.model;
/**@文件名: CommunityInfoDetail.java
 * @类功能说明: 小区详情实体类
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月1日下午4:53:41
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月1日下午4:53:41</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class CommunityInfoDetail {
	private	Integer		cd_id			;//	编号(主键)
	private	Integer		co_id			;//	小区id(外键)
	private	String	co_name			;
	private	Integer		cd_unit			;//	单元号
	private	Integer		cd_unitNumber	;//	单元户数
	private	Integer		cd_unitLayer	;//	单元层数
	private	Integer		cd_delflag		;//	删除标记（0为未删除，1为删除，默认0）
	private	Integer		cd_state		;//	状态
	private	String	cd_createTime	;//	创建时间
	private	Integer	cd_opt_id		;//	操作人
	private	String	cd_remark		;//	备注
	public Integer getCd_id() {
		return cd_id;
	}
	public void setCd_id(Integer cd_id) {
		this.cd_id = cd_id;
	}
	public Integer getCo_id() {
		return co_id;
	}
	public void setCo_id(Integer co_id) {
		this.co_id = co_id;
	}
	public String getCo_name() {
		return co_name;
	}
	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}
	public Integer getCd_unit() {
		return cd_unit;
	}
	public void setCd_unit(Integer cd_unit) {
		this.cd_unit = cd_unit;
	}
	public Integer getCd_unitNumber() {
		return cd_unitNumber;
	}
	public void setCd_unitNumber(Integer cd_unitNumber) {
		this.cd_unitNumber = cd_unitNumber;
	}
	public Integer getCd_unitLayer() {
		return cd_unitLayer;
	}
	public void setCd_unitLayer(Integer cd_unitLayer) {
		this.cd_unitLayer = cd_unitLayer;
	}
	public Integer getCd_delflag() {
		return cd_delflag;
	}
	public void setCd_delflag(Integer cd_delflag) {
		this.cd_delflag = cd_delflag;
	}
	public Integer getCd_state() {
		return cd_state;
	}
	public void setCd_state(Integer cd_state) {
		this.cd_state = cd_state;
	}
	public String getCd_createTime() {
		return cd_createTime;
	}
	public void setCd_createTime(String cd_createTime) {
		this.cd_createTime = cd_createTime;
	}
	public Integer getCd_opt_id() {
		return cd_opt_id;
	}
	public void setCd_opt_id(Integer cd_opt_id) {
		this.cd_opt_id = cd_opt_id;
	}
	public String getCd_remark() {
		return cd_remark;
	}
	public void setCd_remark(String cd_remark) {
		this.cd_remark = cd_remark;
	}
	

}
