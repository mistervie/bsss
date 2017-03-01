package com.user.entity;

public class User {
	private String uid;
	private String upassword;
	private String uname;
	private int utype;
	
	public User() {
		super();
	}

	public User(String uid, String upassword, String uname, int utype) {
		super();
		this.uid = uid;
		this.upassword = upassword;
		this.uname = uname;
		this.utype = utype;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUtype() {
		return utype;
	}

	public void setUtype(int utype) {
		this.utype = utype;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", upassword=" + upassword + ", uname=" + uname + ", utype=" + utype + "]";
	}

	
	
}
