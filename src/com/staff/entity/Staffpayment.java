package com.staff.entity;

import java.sql.Date;

import org.springframework.stereotype.Repository;

@Repository("staffPayment")
public class Staffpayment {
	private int id;
	private Staff staff;
	private String pym;
	private int pbase;
	private int pstate;
	private Date pbtime;
	private Date pstime;
	public Staffpayment() {
		// TODO Auto-generated constructor stub
	}
	public Staffpayment(int id, Staff staff, String pym, int pbase, int pstate, Date pbtime, Date pstime) {
		super();
		this.id = id;
		this.staff = staff;
		this.pym = pym;
		this.pbase = pbase;
		this.pstate = pstate;
		this.pbtime = pbtime;
		this.pstime = pstime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public String getPym() {
		return pym;
	}
	public void setPym(String pym) {
		this.pym = pym;
	}
	public int getPbase() {
		return pbase;
	}
	public void setPbase(int pbase) {
		this.pbase = pbase;
	}
	public int getPstate() {
		return pstate;
	}
	public void setPstate(int pstate) {
		this.pstate = pstate;
	}
	public Date getPbtime() {
		return pbtime;
	}
	public void setPbtime(Date pbtime) {
		this.pbtime = pbtime;
	}
	public Date getPstime() {
		return pstime;
	}
	public void setPstime(Date pstime) {
		this.pstime = pstime;
	}
	@Override
	public String toString() {
		return "StaffPayment [id=" + id + ", staff=" + staff + ", pym=" + pym + ", pbase=" + pbase + ", pstate="
				+ pstate + ", pbtime=" + pbtime + ", pstime=" + pstime + "]";
	}
	
}
