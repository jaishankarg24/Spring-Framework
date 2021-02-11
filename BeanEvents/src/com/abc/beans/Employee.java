package com.abc.beans;

public class Employee {

	private String ename;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String greetUser() {
		return "Hello : " + ename;
	}

}
