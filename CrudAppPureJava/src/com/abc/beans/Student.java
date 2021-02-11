package com.abc.beans;

public class Student {

	private String sname;
	private String sage;
	private String saddress;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSage() {
		return sage;
	}

	public void setSage(String sage) {
		this.sage = sage;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public void displayDetails() {
		System.out.println("Name is          :" + sname);
		System.out.println("Age is           :" + sage);
		System.out.println("Address is       :" + saddress);
	}

}
