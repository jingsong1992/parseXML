package com.main.bean;

import java.util.ArrayList;
import java.util.List;

public class Funcattr {
	private String database;
	private String cemeta;
	private String tablename;
	private List<Component> list;
	
	public Funcattr(){
		list = new ArrayList<Component>();
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getCemeta() {
		return cemeta;
	}
	public void setCemeta(String cemeta) {
		this.cemeta = cemeta;
	}
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	public List<Component> getList() {
		return list;
	}
	public void setList(List<Component> list) {
		this.list = list;
	}
	
	
	public void addComponent(Component component){
		list.add(component);
	}
	
//	public String toString(){
//		String str="";
//		for(Component comp : list){
//			str=str+comp.toString()+"\n";
//		}
//		return str;
//	}
}
