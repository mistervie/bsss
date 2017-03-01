package com.view.dto;

import org.springframework.stereotype.Repository;

@Repository("staffAllSelectDTO")
public class StaffAllSelectDTO {
	private String id;
	private String sid;
	private String sino;
	private String sname;
	private String ssex;
	private String snation;
	private String sbirth;
	private String sdaj;
	private String pbase;
	private String cid;
	private String csn;
	private String sstate;
	public StaffAllSelectDTO() {
		// TODO Auto-generated constructor stub
	}
	public StaffAllSelectDTO(String id, String sid, String sino, String sname, String ssex, String snation,
			String sbirth, String sdaj, String pbase, String cid, String csn, String sstate) {
		super();
		this.id = id;
		this.sid = sid;
		this.sino = sino;
		this.sname = sname;
		this.ssex = ssex;
		this.snation = snation;
		this.sbirth = sbirth;
		this.sdaj = sdaj;
		this.pbase = pbase;
		this.cid = cid;
		this.csn = csn;
		this.sstate = sstate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSino() {
		return sino;
	}
	public void setSino(String sino) {
		this.sino = sino;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getSnation() {
		return snation;
	}
	public void setSnation(String snation) {
		this.snation = snation;
	}
	public String getSbirth() {
		return sbirth;
	}
	public void setSbirth(String sbirth) {
		this.sbirth = sbirth;
	}
	public String getSdaj() {
		return sdaj;
	}
	public void setSdaj(String sdaj) {
		this.sdaj = sdaj;
	}
	public String getPbase() {
		return pbase;
	}
	public void setPbase(String pbase) {
		this.pbase = pbase;
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
	public String getSstate() {
		return sstate;
	}
	public void setSstate(String sstate) {
		this.sstate = sstate;
	}
	@Override
	public String toString() {
		return "StaffAllSelectDTO [id=" + id + ", sid=" + sid + ", sino=" + sino + ", sname=" + sname + ", ssex=" + ssex
				+ ", snation=" + snation + ", sbirth=" + sbirth + ", sdaj=" + sdaj + ", pbase=" + pbase + ", cid=" + cid
				+ ", csn=" + csn + ", sstate=" + sstate + "]";
	}
	
}
