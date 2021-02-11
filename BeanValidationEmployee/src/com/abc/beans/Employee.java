package com.abc.beans;

public class Employee {

	private String eid;
	private String ename;
	private int eage;
	private String email;

	public String getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public int getEage() {
		return eage;
	}

	public String getEmail() {
		return email;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void displayDetails() {

		System.out.println("The employee details are:");
		System.out.println("---------------------------------------------------------");
		System.out.println("EID is                      :" + eid);
		System.out.println("ENAME is                    :" + ename);
		System.out.println("EAGE is                     :" + eage);
		System.out.println("EMAIL is                    :" + email);

	}

}
