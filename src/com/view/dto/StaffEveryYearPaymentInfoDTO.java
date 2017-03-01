package com.view.dto;

public class StaffEveryYearPaymentInfoDTO {
	private String sid;
	private String year;
	private String jan;
	private String feb;
	private String mar;
	private String apr;
	private String may;
	private String ju;
	private String jul;
	private String aug;
	private String sep;
	private String oct;
	private String nov;
	private String dec;
	public StaffEveryYearPaymentInfoDTO() {
		// TODO Auto-generated constructor stub
	}
	public StaffEveryYearPaymentInfoDTO(String sid, String year, String jan, String feb, String mar, String apr, String may,
			String ju, String jul, String aug, String sep, String oct, String nov, String dec) {
		super();
		this.sid = sid;
		this.year = year;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		this.apr = apr;
		this.may = may;
		this.ju = ju;
		this.jul = jul;
		this.aug = aug;
		this.sep = sep;
		this.oct = oct;
		this.nov = nov;
		this.dec = dec;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getYear() {
		return year;
	}
	
	public String getJan() {
		return jan;
	}
	public void setJan(String jan) {
		this.jan = jan;
	}
	public String getFeb() {
		return feb;
	}
	public void setFeb(String feb) {
		this.feb = feb;
	}
	public String getMar() {
		return mar;
	}
	public void setMar(String mar) {
		this.mar = mar;
	}
	public String getApr() {
		return apr;
	}
	public void setApr(String apr) {
		this.apr = apr;
	}
	public String getMay() {
		return may;
	}
	public void setMay(String may) {
		this.may = may;
	}
	public String getJu() {
		return ju;
	}
	public void setJu(String ju) {
		this.ju = ju;
	}
	public String getJul() {
		return jul;
	}
	public void setJul(String jul) {
		this.jul = jul;
	}
	public String getAug() {
		return aug;
	}
	public void setAug(String aug) {
		this.aug = aug;
	}
	public String getSep() {
		return sep;
	}
	public void setSep(String sep) {
		this.sep = sep;
	}
	public String getOct() {
		return oct;
	}
	public void setOct(String oct) {
		this.oct = oct;
	}
	public String getNov() {
		return nov;
	}
	public void setNov(String nov) {
		this.nov = nov;
	}
	public String getDec() {
		return dec;
	}
	public void setDec(String dec) {
		this.dec = dec;
	}
	@Override
	public String toString() {
		return "StaffEveryYearPaymentInfoDTO [sid=" + sid + ", year ="+ year +", jan=" + jan + ", feb=" + feb + ", mar=" + mar + ", apr="
				+ apr + ", may=" + may + ", ju=" + ju + ", jul=" + jul + ", aug=" + aug + ", sep=" + sep + ", oct="
				+ oct + ", nov=" + nov + ", dec=" + dec + "]";
	}
	
}
