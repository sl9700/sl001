package com.imti.model;
/**@�ļ���: TenderContractInfo.java
 * @�๦��˵��: Ͷ���ͬ��Ϣʵ����
 * @����: ShiLei
 * @Email: 2997426050@qq.com
 * @����: 2020��3��1������4:40:55
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ShiLei</li> 
 * 	 <li>����: 2020��3��1������4:40:55</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class TenderContractInfo {
	private	Integer	td_id			;//	���(����)
	private String  co_name			;// ��ͬ���� С����
	private	Integer	co_id			;//	��ͬ���� С��id(���)
	private	String	td_num			;//	��ͬ���
	private	String	td_name			;//	��ͬ����
	private	String	td_state		;//	�б�״̬
	private	String	td_biddingTime	;//	�б�ʱ��
	private	String	td_winTenderTime;//	�б�ʱ��
	private	String	td_BiddingUnit	;//	�б굥λ
	private	String	td_signingTime	;//	ǩԼʱ��
	private	String	td_contractTime	;//	��ͬ����
	private	String	td_leader		;//	��ͬ������
	private	Integer	td_delflag		;//	ɾ����ǣ�0Ϊδɾ����1Ϊɾ����Ĭ��0��
	private	Integer	td_states		;//	״̬
	private	String	td_createTime	;//	����ʱ��
	private	Integer	td_opt_id		;//	������
	private	String	td_remark		;//	��ע
	public Integer getTd_id() {
		return td_id;
	}
	public void setTd_id(Integer td_id) {
		this.td_id = td_id;
	}
	public String getCo_name() {
		return co_name;
	}
	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}
	public Integer getCo_id() {
		return co_id;
	}
	public void setCo_id(Integer co_id) {
		this.co_id = co_id;
	}
	public String getTd_num() {
		return td_num;
	}
	public void setTd_num(String td_num) {
		this.td_num = td_num;
	}
	public String getTd_name() {
		return td_name;
	}
	public void setTd_name(String td_name) {
		this.td_name = td_name;
	}
	public String getTd_state() {
		return td_state;
	}
	public void setTd_state(String td_state) {
		this.td_state = td_state;
	}
	public String getTd_biddingTime() {
		return td_biddingTime;
	}
	public void setTd_biddingTime(String td_biddingTime) {
		this.td_biddingTime = td_biddingTime;
	}
	public String getTd_winTenderTime() {
		return td_winTenderTime;
	}
	public void setTd_winTenderTime(String td_winTenderTime) {
		this.td_winTenderTime = td_winTenderTime;
	}
	public String getTd_BiddingUnit() {
		return td_BiddingUnit;
	}
	public void setTd_BiddingUnit(String td_BiddingUnit) {
		this.td_BiddingUnit = td_BiddingUnit;
	}
	public String getTd_signingTime() {
		return td_signingTime;
	}
	public void setTd_signingTime(String td_signingTime) {
		this.td_signingTime = td_signingTime;
	}
	public String getTd_contractTime() {
		return td_contractTime;
	}
	public void setTd_contractTime(String td_contractTime) {
		this.td_contractTime = td_contractTime;
	}
	public String getTd_leader() {
		return td_leader;
	}
	public void setTd_leader(String td_leader) {
		this.td_leader = td_leader;
	}
	public Integer getTd_delflag() {
		return td_delflag;
	}
	public void setTd_delflag(Integer td_delflag) {
		this.td_delflag = td_delflag;
	}
	public Integer getTd_states() {
		return td_states;
	}
	public void setTd_states(Integer td_states) {
		this.td_states = td_states;
	}
	public String getTd_createTime() {
		return td_createTime;
	}
	public void setTd_createTime(String td_createTime) {
		this.td_createTime = td_createTime;
	}
	public Integer getTd_opt_id() {
		return td_opt_id;
	}
	public void setTd_opt_id(Integer td_opt_id) {
		this.td_opt_id = td_opt_id;
	}
	public String getTd_remark() {
		return td_remark;
	}
	public void setTd_remark(String td_remark) {
		this.td_remark = td_remark;
	}
			
}
