package com.company.entity;

import java.sql.Date;

import org.springframework.stereotype.Repository;

@Repository("company")
public class Company {
	private String cid;
	private String csn;
	private String cname;
	private int cindustry;
	private Date cbtime;
	private String clrname;
	private String clrino;
	private String blno;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(String cid, String csn, String cname, int cindustry, Date cbtime, String clrname, String clrino,
			String blno) {
		super();
		this.cid = cid;
		this.csn = csn;
		this.cname = cname;
		this.cindustry = cindustry;
		this.cbtime = cbtime;
		this.clrname = clrname;
		this.clrino = clrino;
		this.blno = blno;
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
	public int getCindustry() {
		return cindustry;
	}
	public void setCindustry(int cindustry) {
		this.cindustry = cindustry;
	}
	public Date getCbtime() {
		return cbtime;
	}
	public void setCbtime(Date cbtime) {
		this.cbtime = cbtime;
	}
	public String getClrname() {
		return clrname;
	}
	public void setClrname(String clrname) {
		this.clrname = clrname;
	}
	public String getClrino() {
		return clrino;
	}
	public void setClrino(String clrino) {
		this.clrino = clrino;
	}
	public String getBlno() {
		return blno;
	}
	public void setBlno(String blno) {
		this.blno = blno;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", csn=" + csn + ", cname=" + cname + ", cindustry=" + cindustry + ", cbtime="
				+ cbtime + ", clrname=" + clrname + ", clrino=" + clrino + ", blno=" + blno + "]";
	}
	
	
}
