package com.abc.beans;

public class Employee {

	private String eid;
	private String ename;
	private String companyName;

	// Injecting account object into Employee Object
	private Account account;

	// Injecting address object into Employee Object
	private Address address;

	// Injection of address object,account object through constructor
	public Employee(String eid, String ename, String companyName, Account account, Address address) {
		this.eid = eid;
		this.ename = ename;
		this.companyName = companyName;
		this.account = account;
		this.address = address;
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
