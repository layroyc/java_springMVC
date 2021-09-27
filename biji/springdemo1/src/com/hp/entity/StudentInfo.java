package com.hp.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class StudentInfo {
	private Integer sid;
	private String sname;
	private Integer sage;
	private String sidcard;
	private String sphoneno;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date addtime;
	private String ssex;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSidcard() {
		return sidcard;
	}
	public void setSidcard(String sidcard) {
		this.sidcard = sidcard;
	}
	public String getSphoneno() {
		return sphoneno;
	}
	public void setSphoneno(String sphoneno) {
		this.sphoneno = sphoneno;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public StudentInfo(Integer sid, String sname, Integer sage, String sidcard,
			String sphoneno, Date addtime, String ssex) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sidcard = sidcard;
		this.sphoneno = sphoneno;
		this.addtime = addtime;
		this.ssex = ssex;
	}
	public StudentInfo(String sname, Integer sage, String sidcard,
			String sphoneno, Date addtime, String ssex) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.sidcard = sidcard;
		this.sphoneno = sphoneno;
		this.addtime = addtime;
		this.ssex = ssex;
	}
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentInfo [sid=" + sid + ", sname=" + sname + ", sage="
				+ sage + ", sidcard=" + sidcard + ", sphoneno=" + sphoneno
				+ ", addtime=" + addtime + ", ssex=" + ssex + "]";
	}
	
	

}
