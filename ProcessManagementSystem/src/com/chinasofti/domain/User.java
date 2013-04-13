package com.chinasofti.domain;

/**
 * User entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private String password;
	private String realname;
	private String duty;
	private String position;
	private String subcom;
	private String dep;
	private String adr;
	private String tel;
	private String a;
	private String b;
	private String c;
	private String d;
	private String e;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String uname, String password, String realname, String duty,
			String position, String subcom, String dep, String adr, String tel,
			String a, String b, String c, String d, String e) {
		this.uname = uname;
		this.password = password;
		this.realname = realname;
		this.duty = duty;
		this.position = position;
		this.subcom = subcom;
		this.dep = dep;
		this.adr = adr;
		this.tel = tel;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getDuty() {
		return this.duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSubcom() {
		return this.subcom;
	}

	public void setSubcom(String subcom) {
		this.subcom = subcom;
	}

	public String getDep() {
		return this.dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getAdr() {
		return this.adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getA() {
		return this.a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return this.c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return this.d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getE() {
		return this.e;
	}

	public void setE(String e) {
		this.e = e;
	}

}