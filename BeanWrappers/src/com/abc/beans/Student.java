package com.abc.beans;

public class Student {

	private String sname;
	private String sid;
	private String saddress;
	private int sage;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", saddress=" + saddress + ", sage=" + sage + "]";
	}

}
