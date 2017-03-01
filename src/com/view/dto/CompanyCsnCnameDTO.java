package com.view.dto;

import org.springframework.stereotype.Repository;

@Repository("companyCsnCnameDTO")
public class CompanyCsnCnameDTO {
	private String cid;
	private String csn;
	private String cname;
	public CompanyCsnCnameDTO() {
		// TODO Auto-generated constructor stub
	}
	public CompanyCsnCnameDTO(String cid, String csn, String cname) {
		super();
		this.cid = cid;
		this.csn = csn;
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCsn() {
		return csn;
	}
	public void setCsn(String csn) {
		this.csn = csn;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "CompanyCsnCname [cid=" + cid + ", csn=" + csn + ", cname=" + cname + "]";
	}
	
}
