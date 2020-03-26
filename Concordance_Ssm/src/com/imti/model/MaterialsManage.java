package com.imti.model;
/**@�ļ���: MaterialsManage.java
 * @�๦��˵��: ���ʹ���ʵ����
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��1������4:59:54
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��1������4:59:54</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class MaterialsManage {
	private	Integer		mm_id				;//	���(����)
	private	Integer		mt_id				;//	��������id(���)
	private String		mt_name				;
	private	Integer		em_id				;//	�ɹ���(�ڲ���Ա���)
	private String		em_name				;
	private	String		mm_name				;//	��������
	private	String		mm_brand			;//	Ʒ��
	private	String		mm_standard			;//	���ʹ��
	private	String		mm_unit				;//	��λ
	private	Integer		mm_quantity			;//	����
	private	double		mm_purchaseUnitPrice;//	�ɹ�����
	private	String		mm_purchaseTime		;//	�ɹ�ʱ��
	private	Integer		mm_inventory		;//	���
	private	String		mm_dateOfManufacture;//	��������
	private	String		mm_expirationDate	;//	������
	private	Integer		mm_delflag			;//	ɾ����ǣ�0Ϊδɾ����1Ϊɾ����Ĭ��0��
	private	Integer		mm_state			;//	״̬
	private	String		mm_createTime		;//	����ʱ��
	private	Integer		mm_opt_id			;//	������
	private	String		mm_remark			;//	��ע
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
