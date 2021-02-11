package com.abc.beans;

public class Employee {

	private String eid;
	private String ename;
	private String eaddress;
	
	private Account account;

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

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void displayDetails() {
		System.out.println("Employee Details are");
		System.out.println("Eid is :"+eid);
		System.out.println("Ename is :"+ename);
		System.out.println("Eaddress is :"+eaddress);
		System.out.println("--------------------------");
		System.out.println("Account Details are ");
		System.out.println("Account no is :"+account.getAccNo());
		System.out.println("Account name is :"+account.getAccName());
		System.out.println("Account type is :"+account.getAccType());
		System.out.println("Balance is :"+account.getBalance());


		
	}
}
