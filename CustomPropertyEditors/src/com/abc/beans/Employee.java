package com.abc.beans;

public class Employee {
	private String eid;
	private String ename;
	private int eage;
	
	//Address object is injected to Employee
	private Address address;

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

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayDetails() {
		System.out.println("Employee details are ");
		System.out.println("------------------");
		System.out.println("EID is :" + eid);
		System.out.println("ENAME is :" + ename);
		System.out.println("EAGE is :" + eage);
		System.out.println("------------------");
		System.out.println("Th eaddress is:" + address);
	}
}