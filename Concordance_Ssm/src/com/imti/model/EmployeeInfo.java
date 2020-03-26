package com.imti.model;

/**
 * @文件名: EmployeeInfo.java
 * @类功能说明: 员工实体类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月2日下午8:03:08
 * @修改说明:<br>
 * 
 *            <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月2日下午8:03:08</li> 
 *	 <li>内容: </li>
 *            </pre>
 */
public class EmployeeInfo {

	private Integer em_id; 			// 编号
	private Integer ro_id; 			// 角色外键
	private String ro_name;			// 角色名称
	private String em_name;			// 姓名
	private Integer em_age; 		// 年龄
	private String em_idCard; 		// 身份证号
	private String em_native; 		// 籍贯
	private String em_location; 	// 现居住地
	private String em_entryTime; 	// 入职时间
	private String em_account; 		// 用户名
	private String em_password; 	// 密码
	private String em_phone; 		// 手机号
	private String em_email; 		// 邮箱
	private Integer em_state; 		// 状态
	private Integer em_delflag; 	// 删除标记(0为未删除,1为已删除,默认0)
	private String em_createTime; 	// 创建时间
	private Integer em_opt_id; 		// 操作人
	private String em_remark; 		// 备注
	public Integer getEm_id() {
		return em_id;
	}
	public void setEm_id(Integer em_id) {
		this.em_id = em_id;
	}
	public Integer getRo_id() {
		return ro_id;
	}
	public void setRo_id(Integer ro_id) {
		this.ro_id = ro_id;
	}
	public String getEm_name() {
		return em_name;
	}
	public void setEm_name(String em_name) {
		this.em_name = em_name;
	}
	public Integer getEm_age() {
		return em_age;
	}
	public void setEm_age(Integer em_age) {
		this.em_age = em_age;
	}
	public String getEm_idCard() {
		return em_idCard;
	}
	public void setEm_idCard(String em_idCard) {
		this.em_idCard = em_idCard;
	}
	public String getEm_native() {
		return em_native;
	}
	public void setEm_native(String em_native) {
		this.em_native = em_native;
	}
	public String getEm_location() {
		return em_location;
	}
	public void setEm_location(String em_location) {
		this.em_location = em_location;
	}
	public String getEm_entryTime() {
		return em_entryTime;
	}
	public void setEm_entryTime(String em_entryTime) {
		this.em_entryTime = em_entryTime;
	}
	public String getEm_account() {
		return em_account;
	}
	public void setEm_account(String em_account) {
		this.em_account = em_account;
	}
	public String getEm_password() {
		return em_password;
	}
	public void setEm_password(String em_password) {
		this.em_password = em_password;
	}
	public String getEm_phone() {
		return em_phone;
	}
	public void setEm_phone(String em_phone) {
		this.em_phone = em_phone;
	}
	public String getEm_email() {
		return em_email;
	}
	public void setEm_email(String em_email) {
		this.em_email = em_email;
	}
	public Integer getEm_state() {
		return em_state;
	}
	public void setEm_state(Integer em_state) {
		this.em_state = em_state;
	}
	public Integer getEm_delflag() {
		return em_delflag;
	}
	public void setEm_delflag(Integer em_delflag) {
		this.em_delflag = em_delflag;
	}
	public String getEm_createTime() {
		return em_createTime;
	}
	public void setEm_createTime(String em_createTime) {
		this.em_createTime = em_createTime;
	}
	public Integer getEm_opt_id() {
		return em_opt_id;
	}
	public void setEm_opt_id(Integer em_opt_id) {
		this.em_opt_id = em_opt_id;
	}
	public String getEm_remark() {
		return em_remark;
	}
	public void setEm_remark(String em_remark) {
		this.em_remark = em_remark;
	}
	public String getRo_name() {
		return ro_name;
	}
	public void setRo_name(String ro_name) {
		this.ro_name = ro_name;
	}
	
}
