package com.abc.beans;

public class Student {

	private String sid;
	private String sname;
	private String saddress;
	private String country;

	public Student(String sid, String sname, String saddress, String country) {
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
		this.country = country;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void displayDetails() {
		System.out.println("Student Details are:");
		System.out.println("Student Id is                   :" + sid);
		System.out.println("Student Name is                 :" + sname);
		System.out.println("Student address is              :" + saddress);
		System.out.println("Student Country is              :" + country);
	}

}
