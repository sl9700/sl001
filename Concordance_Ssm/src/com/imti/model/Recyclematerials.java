package com.imti.model;

/**
 * @文件名: Recyclematerials.java
 * @类功能说明: 回收站详细信息表实体类
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月13日下午2:03:10
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月13日下午2:03:10</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Recyclematerials {
	
	private Integer rm_id;	//编号(主键)
	private Integer re_id;	//回收站id(外键)
	private String re_name;	//回收站名称
	private Integer re_delflag;	//删除标记（0为未删除，1为删除，默认0）
	private Integer mm_id;	//物资id(外键)
	private String mm_name;	//物资名称
	private Integer mm_delflag;	//删除标记（0为未删除，1为删除，默认0）
	private Integer rm_total;	//数量
	private Integer rm_loss;	//损耗量
	private Integer rm_delflag;	//删除标记（0为未删除，1为删除，默认0）
	private Integer rm_state;	//状态
	private String rm_createTime;	//创建时间
	private Integer rm_opt_id;	//操作人
	private String rm_remark;	//备注	
	
	/*private List<Materialsmanage> mmList;	//物资管理表*/	
	
	
	public Integer getRm_id() {
		return rm_id;
	}
	public Integer getRe_delflag() {
		return re_delflag;
	}
	public void setRe_delflag(Integer re_delflag) {
		this.re_delflag = re_delflag;
	}
	public void setRm_id(Integer rm_id) {
		this.rm_id = rm_id;
	}
	public Integer getRe_id() {
		return re_id;
	}
	public void setRe_id(Integer re_id) {
		this.re_id = re_id;
	}
	public Integer getMm_id() {
		return mm_id;
	}
	public void setMm_id(Integer mm_id) {
		this.mm_id = mm_id;
	}
	public Integer getRm_total() {
		return rm_total;
	}
	public void setRm_total(Integer rm_total) {
		this.rm_total = rm_total;
	}
	public Integer getRm_loss() {
		return rm_loss;
	}
	public void setRm_loss(Integer rm_loss) {
		this.rm_loss = rm_loss;
	}
	public Integer getRm_delflag() {
		return rm_delflag;
	}
	public void setRm_delflag(Integer rm_delflag) {
		this.rm_delflag = rm_delflag;
	}
	public Integer getRm_state() {
		return rm_state;
	}
	public void setRm_state(Integer rm_state) {
		this.rm_state = rm_state;
	}
	public String getRm_createTime() {
		return rm_createTime;
	}
	public void setRm_createTime(String rm_createTime) {
		this.rm_createTime = rm_createTime;
	}
	public Integer getRm_opt_id() {
		return rm_opt_id;
	}
	public void setRm_opt_id(Integer rm_opt_id) {
		this.rm_opt_id = rm_opt_id;
	}
	public String getRm_remark() {
		return rm_remark;
	}
	public void setRm_remark(String rm_remark) {
		this.rm_remark = rm_remark;
	}
	
	/*public List<Materialsmanage> getMmList() {
		return mmList;
	}
	public void setMmList(List<Materialsmanage> mmList) {
		this.mmList = mmList;
	}*/
	
	public String getMm_name() {
		return mm_name;
	}
	public void setMm_name(String mm_name) {
		this.mm_name = mm_name;
	}
	
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	
	public Integer getMm_delflag() {
		return mm_delflag;
	}
	public void setMm_delflag(Integer mm_delflag) {
		this.mm_delflag = mm_delflag;
	}
	@Override
	public String toString() {
		return "Recyclematerials [rm_id=" + rm_id + ", re_id=" + re_id + ", re_name=" + re_name + ", mm_id=" + mm_id
				+ ", mm_name=" + mm_name + ", rm_total=" + rm_total + ", rm_loss=" + rm_loss + ", rm_delflag="
				+ rm_delflag + ", rm_state=" + rm_state + ", rm_createTime=" + rm_createTime + ", rm_opt_id="
				+ rm_opt_id + ", rm_remark=" + rm_remark + "]";
	}
	
	
	
}
