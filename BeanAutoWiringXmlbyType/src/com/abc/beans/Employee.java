package com.abc.beans;

public class Employee {

	private String eid;
	private String ename;
	private String companyName;

	// Injecting account object into Employee Object
	private Account account;

	// Injecting address object into Employee Object
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void displayDetails() {
		System.out.println("Employee Details are ");
		System.out.println("EID is                         :" + eid);
		System.out.println("ENAME is                       :" + ename);
		System.out.println("COMPANYNAME is                 :" + companyName);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Account details are :" + account);
		System.out.println("----------------------------------------------------------------");
		System.out.println("Address details are :" + address);
	}

}
