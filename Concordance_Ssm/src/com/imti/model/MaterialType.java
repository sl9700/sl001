package com.imti.model;
/**@文件名: MaterialType.java
 * @类功能说明: 物资类型实体类
 * @作者: ShiLei
 * @Email: 2997426050@qq.com
 * @日期: 2020年3月1日下午5:06:46
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ShiLei</li> 
 * 	 <li>日期: 2020年3月1日下午5:06:46</li> 
 *	 <li>内容: </li>
 * </pre>
 */

import java.util.List;

public class MaterialType {
	private	Integer				  mt_id					;//	编号(主键)
	private	String				  mt_name				;//	类型名称
	private	Integer				  mt_delflag			;//	删除标记（0为未删除，1为删除，默认0）
	private	Integer				  mt_state				;//	状态
	private	String				  mt_createTime			;//	创建时间
	private	Integer				  mt_opt_id				;//	操作人
	private	String				  mt_remark				;//	备注
	private List<MaterialsManage> MaManageList			;//物资详情
	public Integer getMt_id() {
		return mt_id;
	}
	public void setMt_id(Integer mt_id) {
		this.mt_id = mt_id;
	}
	public String getMt_name() {
		return mt_name;
	}
	public void setMt_name(String mt_name) {
		this.mt_name = mt_name;
	}
	public Integer getMt_delflag() {
		return mt_delflag;
	}
	public void setMt_delflag(Integer mt_delflag) {
		this.mt_delflag = mt_delflag;
	}
	public Integer getMt_state() {
		return mt_state;
	}
	public void setMt_state(Integer mt_state) {
		this.mt_state = mt_state;
	}
	public String getMt_createTime() {
		return mt_createTime;
	}
	public void setMt_createTime(String mt_createTime) {
		this.mt_createTime = mt_createTime;
	}
	public Integer getMt_opt_id() {
		return mt_opt_id;
	}
	public void setMt_opt_id(Integer mt_opt_id) {
		this.mt_opt_id = mt_opt_id;
	}
	public String getMt_remark() {
		return mt_remark;
	}
	public void setMt_remark(String mt_remark) {
		this.mt_remark = mt_remark;
	}
	public List<MaterialsManage> getMaManageList() {
		return MaManageList;
	}
	public void setMaManageList(List<MaterialsManage> maManageList) {
		MaManageList = maManageList;
	}
	
	
}
