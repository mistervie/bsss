package com.staff.entity;

import java.sql.Date;

import org.springframework.stereotype.Repository;
import com.company.entity.Company;

@Repository("staff")
public class Staff {
	private String sid;
	private String sino;
	private String sname;
	private int ssex;
	private int snation;
	private Date sbirth;
	private Date sdaj;
	private int spi;
	private int seb;
	private int sstate;
	private int spbase;
	private Company company;
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	public Staff(String sid, String sino, String sname, int ssex, int snation, Date sbirth, Date sdaj, int spi, int seb,
			int sstate, int spbase, Company company) {
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
		this.spbase = spbase;
		this.company = company;
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
	public int getSsex() {
		return ssex;
	}
	public void setSsex(int ssex) {
		this.ssex = ssex;
	}
	public int getSnation() {
		return snation;
	}
	public void setSnation(int snation) {
		this.snation = snation;
	}
	public Date getSbirth() {
		return sbirth;
	}
	public void setSbirth(Date sbirth) {
		this.sbirth = sbirth;
	}
	public Date getSdaj() {
		return sdaj;
	}
	public void setSdaj(Date sdaj) {
		this.sdaj = sdaj;
	}
	public int getSpi() {
		return spi;
	}
	public void setSpi(int spi) {
		this.spi = spi;
	}
	public int getSeb() {
		return seb;
	}
	public void setSeb(int seb) {
		this.seb = seb;
	}
	public int getSstate() {
		return sstate;
	}
	public void setSstate(int sstate) {
		this.sstate = sstate;
	}
	public int getSpbase() {
		return spbase;
	}
	public void setSpbase(int spbase) {
		this.spbase = spbase;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", sino=" + sino + ", sname=" + sname + ", ssex=" + ssex + ", snation=" + snation
				+ ", sbirth=" + sbirth + ", sdaj=" + sdaj + ", spi=" + spi + ", seb=" + seb + ", sstate=" + sstate
				+ ", spbase=" + spbase + ", company=" + company + "]";
	}
	
	
	
}
