package com.imti.model;
/**
 * @�ļ���: MenuInfo.java
 * @�๦��˵��: �˵���Ϣʵ��
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��3������7:54:47
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��3������7:54:47</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class MenuInfo {
	
	private	Integer	mn_id	;				//	�˵�id(����)
	private	String	mn_menuName	;		//	�˵�����
	private	String	mn_iconCls	;		//	ͼ��
	private	Integer	mn_parent	;			//	���ڵ�
	private	String	mn_path	;			//	·��
	private	String	mn_son	;			//	�Ƿ�����ӽڵ�(open/close)
	private	Integer	mn_state	;			//	��̥
	private	Integer	mn_delflag	;			//	ɾ�����
	private	String	mn_createTime	;	//	����ʱ��
	private	Integer	mn_opt_id	;			//	������ 
	private	String	mn_remark	;		//	��ע
	public Integer getMn_id() {
		return mn_id;
	}
	public void setMn_id(Integer mn_id) {
		this.mn_id = mn_id;
	}
	public String getMn_menuName() {
		return mn_menuName;
	}
	public void setMn_menuName(String mn_menuName) {
		this.mn_menuName = mn_menuName;
	}
	public String getMn_iconCls() {
		return mn_iconCls;
	}
	public void setMn_iconCls(String mn_iconCls) {
		this.mn_iconCls = mn_iconCls;
	}
	public Integer getMn_parent() {
		return mn_parent;
	}
	public void setMn_parent(Integer mn_parent) {
		this.mn_parent = mn_parent;
	}
	public String getMn_path() {
		return mn_path;
	}
	public void setMn_path(String mn_path) {
		this.mn_path = mn_path;
	}
	public String getMn_son() {
		return mn_son;
	}
	public void setMn_son(String mn_son) {
		this.mn_son = mn_son;
	}
	public Integer getMn_state() {
		return mn_state;
	}
	public void setMn_state(Integer mn_state) {
		this.mn_state = mn_state;
	}
	public Integer getMn_delflag() {
		return mn_delflag;
	}
	public void setMn_delflag(Integer mn_delflag) {
		this.mn_delflag = mn_delflag;
	}
	public String getMn_createTime() {
		return mn_createTime;
	}
	public void setMn_createTime(String mn_createTime) {
		this.mn_createTime = mn_createTime;
	}
	public Integer getMn_opt_id() {
		return mn_opt_id;
	}
	public void setMn_opt_id(Integer mn_opt_id) {
		this.mn_opt_id = mn_opt_id;
	}
	public String getMn_remark() {
		return mn_remark;
	}
	public void setMn_remark(String mn_remark) {
		this.mn_remark = mn_remark;
	}
	
}
