package com.view.dto;

import org.springframework.stereotype.Repository;

@Repository("staffBasicInfoDTO")
public class StaffBasicInfoDTO {
	private String sid;
	private String sino;
	private String sname;
	private String ssex;
	private String snation;
	private String sbirth;
	private String sdaj;
	private String spi;
	private String seb;
	private String sstate;
	private String cid;
	private String csn;
	private String cname;
	public StaffBasicInfoDTO() {
		// TODO Auto-generated constructor stub
	}
	public StaffBasicInfoDTO(String sid, String sino, String sname, String ssex, String snation, String sbirth,
			String sdaj, String spi, String seb, String sstate, String cid, String csn, String cname) {
		super();
		this.sid = sid;
		this.sino = sino;
		this.sname = sname;
		this.ssex = ssex;
		this.snation = snation;
		this.sbirth = sbirth;
		this.sdaj = sdaj;
		this.spi = spi;
		this.seb = seb;
		this.sstate = sstate;
		this.cid = cid;
		this.csn = csn;
		this.cname = cname;
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
	public String getSpi() {
		return spi;
	}
	public void setSpi(String spi) {
		this.spi = spi;
	}
	public String getSeb() {
		return seb;
	}
	public void setSeb(String seb) {
		this.seb = seb;
	}
	public String getSstate() {
		return sstate;
	}
	public void setSstate(String sstate) {
		this.sstate = sstate;
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
		return "StaffBasicInfoDTO [sid=" + sid + ", sino=" + sino + ", sname=" + sname + ", ssex=" + ssex + ", snation="
				+ snation + ", sbirth=" + sbirth + ", sdaj=" + sdaj + ", spi=" + spi + ", seb=" + seb + ", sstate="
				+ sstate + ", cid=" + cid + ", csn=" + csn + ", cname=" + cname + "]";
	}
	
}
