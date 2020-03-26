package com.imti.model;
/**
 * @文件名: Recycleorder.java
 * @类功能说明: 回收站订单表实体类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月13日下午2:09:10
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月13日下午2:09:10</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class RecycleOrder {
	
	private	Integer	rco_id	;	//	编号(主键)
	private	Integer	us_id	;	//	居民id(居民外键)
	private	Integer	em_id	;	//	内部人员id(外键)
	private	Integer	ve_id	;	//	车辆id(外键)
	private	String	rco_ids	;	//	订单编号
	private	String	rco_type	;	//	订单类型
	private	String	rco_birthTime	;	//	订单生成时间
	private	String	rco_accomplishTime	;	//	订单完成时间
	private	String	rco_name	;	//	姓名
	private	String	rco_phone	;	//	联系方式
	private	String	rco_address	;	//	详细地址
	private	String	rco_rubbishSrc	;	//	垃圾图片
	private	String	rco_trading	;	//	交易方式
	private	String	rco_orderTime	;	//	接单时间
	private	Double	rco_garbageWeight	;	//	回收重量
	private	Integer	rco_Integeregral	;	//	交易积分
	private	Integer	rco_state	;	//	订单状态(是否完成,完成为1，没完成为0)
	private	Integer	rco_delflag	;	//	删除标记(0是没有删除，1是已删除)
	private	String	rco_createTime	;	//	创建时间
	private	Integer	rco_opt_id	;	//	操作人
	private	String	rco_remark	;	//	备注
	public Integer getRco_id() {
		return rco_id;
	}
	public void setRco_id(Integer rco_id) {
		this.rco_id = rco_id;
	}
	public Integer getUs_id() {
		return us_id;
	}
	public void setUs_id(Integer us_id) {
		this.us_id = us_id;
	}
	public Integer getEm_id() {
		return em_id;
	}
	public void setEm_id(Integer em_id) {
		this.em_id = em_id;
	}
	public Integer getVe_id() {
		return ve_id;
	}
	public void setVe_id(Integer ve_id) {
		this.ve_id = ve_id;
	}
	public String getRco_ids() {
		return rco_ids;
	}
	public void setRco_ids(String rco_ids) {
		this.rco_ids = rco_ids;
	}
	public String getRco_type() {
		return rco_type;
	}
	public void setRco_type(String rco_type) {
		this.rco_type = rco_type;
	}
	public String getRco_birthTime() {
		return rco_birthTime;
	}
	public void setRco_birthTime(String rco_birthTime) {
		this.rco_birthTime = rco_birthTime;
	}
	public String getRco_accomplishTime() {
		return rco_accomplishTime;
	}
	public void setRco_accomplishTime(String rco_accomplishTime) {
		this.rco_accomplishTime = rco_accomplishTime;
	}
	public String getRco_name() {
		return rco_name;
	}
	public void setRco_name(String rco_name) {
		this.rco_name = rco_name;
	}
	public String getRco_phone() {
		return rco_phone;
	}
	public void setRco_phone(String rco_phone) {
		this.rco_phone = rco_phone;
	}
	public String getRco_address() {
		return rco_address;
	}
	public void setRco_address(String rco_address) {
		this.rco_address = rco_address;
	}
	public String getRco_rubbishSrc() {
		return rco_rubbishSrc;
	}
	public void setRco_rubbishSrc(String rco_rubbishSrc) {
		this.rco_rubbishSrc = rco_rubbishSrc;
	}
	public String getRco_trading() {
		return rco_trading;
	}
	public void setRco_trading(String rco_trading) {
		this.rco_trading = rco_trading;
	}
	public String getRco_orderTime() {
		return rco_orderTime;
	}
	public void setRco_orderTime(String rco_orderTime) {
		this.rco_orderTime = rco_orderTime;
	}
	public Double getRco_garbageWeight() {
		return rco_garbageWeight;
	}
	public void setRco_garbageWeight(Double rco_garbageWeight) {
		this.rco_garbageWeight = rco_garbageWeight;
	}
	public Integer getRco_Integeregral() {
		return rco_Integeregral;
	}
	public void setRco_Integeregral(Integer rco_Integeregral) {
		this.rco_Integeregral = rco_Integeregral;
	}
	public Integer getRco_state() {
		return rco_state;
	}
	public void setRco_state(Integer rco_state) {
		this.rco_state = rco_state;
	}
	public Integer getRco_delflag() {
		return rco_delflag;
	}
	public void setRco_delflag(Integer rco_delflag) {
		this.rco_delflag = rco_delflag;
	}
	public String getRco_createTime() {
		return rco_createTime;
	}
	public void setRco_createTime(String rco_createTime) {
		this.rco_createTime = rco_createTime;
	}
	public Integer getRco_opt_id() {
		return rco_opt_id;
	}
	public void setRco_opt_id(Integer rco_opt_id) {
		this.rco_opt_id = rco_opt_id;
	}
	public String getRco_remark() {
		return rco_remark;
	}
	public void setRco_remark(String rco_remark) {
		this.rco_remark = rco_remark;
	}
	
	

	
}
