package com.imti.model;
/**@文件名: Community.java
 * @类功能说明: 试点小区信息表实体类
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月1日下午4:47:29
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月1日下午4:47:29</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Community {
	private	Integer		co_id				;//	编号(主键)
	private	String	co_name				;//	小区名称
	private	String	co_address			;//	小区详情地址
	private	String	co_coordinate		;//	小区具体坐标点
	private	String	co_residential		;//	小区地址(区域坐标)
	private	String	co_beginTime		;//	试点开始时间
	private	String	co_principal		;//	小区负责人
	private	String	co_tel				;//	小区负责人联系方式
	private	String	co_population		;//	小区覆盖人口
	private	String	co_type				;//	小区类型
	private	String	co_projectLeader	;//	项目负责人
	private	String	em_name				;
	private	Integer	co_delflag			;//	删除标记（0为未删除，1为删除，默认0）
	private	Integer	co_state			;//	状态
	private	String	co_createTime		;//	创建时间
	private	Integer	co_opt_id			;//	操作人
	private	String	co_remark			;//	备注
	public String getEm_name() {
		return em_name;
	}
	public void setEm_name(String em_name) {
		this.em_name = em_name;
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
	public String getCo_address() {
		return co_address;
	}
	public void setCo_address(String co_address) {
		this.co_address = co_address;
	}
	public String getCo_coordinate() {
		return co_coordinate;
	}
	public void setCo_coordinate(String co_coordinate) {
		this.co_coordinate = co_coordinate;
	}
	public String getCo_residential() {
		return co_residential;
	}
	public void setCo_residential(String co_residential) {
		this.co_residential = co_residential;
	}
	public String getCo_beginTime() {
		return co_beginTime;
	}
	public void setCo_beginTime(String co_beginTime) {
		this.co_beginTime = co_beginTime;
	}
	public String getCo_principal() {
		return co_principal;
	}
	public void setCo_principal(String co_principal) {
		this.co_principal = co_principal;
	}
	public String getCo_tel() {
		return co_tel;
	}
	public void setCo_tel(String co_tel) {
		this.co_tel = co_tel;
	}
	public String getCo_population() {
		return co_population;
	}
	public void setCo_population(String co_population) {
		this.co_population = co_population;
	}
	public String getCo_type() {
		return co_type;
	}
	public void setCo_type(String co_type) {
		this.co_type = co_type;
	}
	public String getCo_projectLeader() {
		return co_projectLeader;
	}
	public void setCo_projectLeader(String co_projectLeader) {
		this.co_projectLeader = co_projectLeader;
	}
	public Integer getCo_delflag() {
		return co_delflag;
	}
	public void setCo_delflag(Integer co_delflag) {
		this.co_delflag = co_delflag;
	}
	public Integer getCo_state() {
		return co_state;
	}
	public void setCo_state(Integer co_state) {
		this.co_state = co_state;
	}
	public String getCo_createTime() {
		return co_createTime;
	}
	public void setCo_createTime(String co_createTime) {
		this.co_createTime = co_createTime;
	}
	public Integer getCo_opt_id() {
		return co_opt_id;
	}
	public void setCo_opt_id(Integer co_opt_id) {
		this.co_opt_id = co_opt_id;
	}
	public String getCo_remark() {
		return co_remark;
	}
	public void setCo_remark(String co_remark) {
		this.co_remark = co_remark;
	}
	
	
}
