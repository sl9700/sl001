package com.imti.model;
/**@文件名: MaterialsManage.java
 * @类功能说明: 物资管理实体类
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月1日下午4:59:54
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月1日下午4:59:54</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class MaterialsManage {
	private	Integer		mm_id				;//	编号(主键)
	private	Integer		mt_id				;//	物资类型id(外键)
	private String		mt_name				;
	private	Integer		em_id				;//	采购人(内部人员外键)
	private String		em_name				;
	private	String		mm_name				;//	物资名称
	private	String		mm_brand			;//	品牌
	private	String		mm_standard			;//	物资规格
	private	String		mm_unit				;//	单位
	private	Integer		mm_quantity			;//	数量
	private	double		mm_purchaseUnitPrice;//	采购单价
	private	String		mm_purchaseTime		;//	采购时间
	private	Integer		mm_inventory		;//	库存
	private	String		mm_dateOfManufacture;//	生产日期
	private	String		mm_expirationDate	;//	保质期
	private	Integer		mm_delflag			;//	删除标记（0为未删除，1为删除，默认0）
	private	Integer		mm_state			;//	状态
	private	String		mm_createTime		;//	创建时间
	private	Integer		mm_opt_id			;//	操作人
	private	String		mm_remark			;//	备注
	public Integer getMm_id() {
		return mm_id;
	}
	public void setMm_id(Integer mm_id) {
		this.mm_id = mm_id;
	}
	public Integer getMt_id() {
		return mt_id;
	}
	public void setMt_id(Integer mt_id) {
		this.mt_id = mt_id;
	}
	public Integer getEm_id() {
		return em_id;
	}
	public void setEm_id(Integer em_id) {
		this.em_id = em_id;
	}
	public String getMm_name() {
		return mm_name;
	}
	public void setMm_name(String mm_name) {
		this.mm_name = mm_name;
	}
	public String getMm_brand() {
		return mm_brand;
	}
	public void setMm_brand(String mm_brand) {
		this.mm_brand = mm_brand;
	}
	public String getMm_standard() {
		return mm_standard;
	}
	public void setMm_standard(String mm_standard) {
		this.mm_standard = mm_standard;
	}
	public String getMm_unit() {
		return mm_unit;
	}
	public void setMm_unit(String mm_unit) {
		this.mm_unit = mm_unit;
	}
	public Integer getMm_quantity() {
		return mm_quantity;
	}
	public void setMm_quantity(Integer mm_quantity) {
		this.mm_quantity = mm_quantity;
	}
	public double getMm_purchaseUnitPrice() {
		return mm_purchaseUnitPrice;
	}
	public void setMm_purchaseUnitPrice(double mm_purchaseUnitPrice) {
		this.mm_purchaseUnitPrice = mm_purchaseUnitPrice;
	}
	public String getMm_purchaseTime() {
		return mm_purchaseTime;
	}
	public void setMm_purchaseTime(String mm_purchaseTime) {
		this.mm_purchaseTime = mm_purchaseTime;
	}
	public Integer getMm_inventory() {
		return mm_inventory;
	}
	public void setMm_inventory(Integer mm_inventory) {
		this.mm_inventory = mm_inventory;
	}
	public String getMm_dateOfManufacture() {
		return mm_dateOfManufacture;
	}
	public void setMm_dateOfManufacture(String mm_dateOfManufacture) {
		this.mm_dateOfManufacture = mm_dateOfManufacture;
	}
	public String getMm_expirationDate() {
		return mm_expirationDate;
	}
	public void setMm_expirationDate(String mm_expirationDate) {
		this.mm_expirationDate = mm_expirationDate;
	}
	public Integer getMm_delflag() {
		return mm_delflag;
	}
	public void setMm_delflag(Integer mm_delflag) {
		this.mm_delflag = mm_delflag;
	}
	public Integer getMm_state() {
		return mm_state;
	}
	public void setMm_state(Integer mm_state) {
		this.mm_state = mm_state;
	}
	public String getMm_createTime() {
		return mm_createTime;
	}
	public void setMm_createTime(String mm_createTime) {
		this.mm_createTime = mm_createTime;
	}
	public Integer getMm_opt_id() {
		return mm_opt_id;
	}
	public void setMm_opt_id(Integer mm_opt_id) {
		this.mm_opt_id = mm_opt_id;
	}
	public String getMm_remark() {
		return mm_remark;
	}
	public void setMm_remark(String mm_remark) {
		this.mm_remark = mm_remark;
	}
	public String getMt_name() {
		return mt_name;
	}
	public void setMt_name(String mt_name) {
		this.mt_name = mt_name;
	}
	public String getEm_name() {
		return em_name;
	}
	public void setEm_name(String em_name) {
		this.em_name = em_name;
	}
	@Override
	public String toString() {
		return "MaterialsManage [mm_id=" + mm_id + ", mt_id=" + mt_id + ", mt_name=" + mt_name + ", em_id=" + em_id
				+ ", em_name=" + em_name + ", mm_name=" + mm_name + ", mm_brand=" + mm_brand + ", mm_standard="
				+ mm_standard + ", mm_unit=" + mm_unit + ", mm_quantity=" + mm_quantity + ", mm_purchaseUnitPrice="
				+ mm_purchaseUnitPrice + ", mm_purchaseTime=" + mm_purchaseTime + ", mm_inventory=" + mm_inventory
				+ ", mm_dateOfManufacture=" + mm_dateOfManufacture + ", mm_expirationDate=" + mm_expirationDate
				+ ", mm_delflag=" + mm_delflag + ", mm_state=" + mm_state + ", mm_createTime=" + mm_createTime
				+ ", mm_opt_id=" + mm_opt_id + ", mm_remark=" + mm_remark + "]";
	}
	
	
}
