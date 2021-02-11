package com.abc.beans;

public class Employee {

	private String eid;
	private String ename;
	private String companyName;

	// Injecting account object into Employee Object
	private Account account;

	// Performing Constructor Injection
	public Employee(String eid, String ename, String companyName, Account account) {
		this.eid = eid;
		this.ename = ename;
		this.companyName = companyName;
		this.account = account;
	}

	public void displayDetails() {
		System.out.println("Employee Details are ");
		System.out.println("EID is                         :" + eid);
		System.out.println("ENAME is                       :" + ename);
		System.out.println("COMPANYNAME is                 :" + companyName);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Account details are :" + account);
	}

}
