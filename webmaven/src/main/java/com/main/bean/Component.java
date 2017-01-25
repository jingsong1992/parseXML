package com.main.bean;

public class Component {
	private String transaction;
	private String name;
	private String imm_edit_flag;
	private String module;
	private String event;
	private String table_name;
	private String table_desc;
	private String mainref;
	private String trxref;
	private String mappingrule;
	private String post;
	private String bctype;
	private String o2mrule;
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImm_edit_flag() {
		return imm_edit_flag;
	}
	public void setImm_edit_flag(String imm_edit_flag) {
		this.imm_edit_flag = imm_edit_flag;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getTable_desc() {
		return table_desc;
	}
	public void setTable_desc(String table_desc) {
		this.table_desc = table_desc;
	}
	public String getMainref() {
		return mainref;
	}
	public void setMainref(String mainref) {
		this.mainref = mainref;
	}
	public String getTrxref() {
		return trxref;
	}
	public void setTrxref(String trxref) {
		this.trxref = trxref;
	}
	public String getMappingrule() {
		return mappingrule;
	}
	public void setMappingrule(String mappingrule) {
		this.mappingrule = mappingrule;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getBctype() {
		return bctype;
	}
	public void setBctype(String bctype) {
		this.bctype = bctype;
	}
	public String getO2mrule() {
		return o2mrule;
	}
	public void setO2mrule(String o2mrule) {
		this.o2mrule = o2mrule;
	}
	
	public String toString(){
		String str="["+transaction+","+name+","+
				imm_edit_flag+","+
				module+","+
				event+","+
				table_name+","+
				table_desc+","+
				 mainref+","+
				trxref+","+
				 mappingrule+","+
				 post+","+
				 bctype+","+
				 o2mrule+"]";
		return str;	
	}
}
