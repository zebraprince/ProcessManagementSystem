package com.chinasofti.web.struts.form;

import org.apache.struts.action.ActionForm;

public class LookupForm extends ActionForm{
  private String pid;
  private String rank;
  private String pname;
  private String item;
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getRank() {
	return rank;
}
public void setRank(String rank) {
	this.rank = rank;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
  
  
}
