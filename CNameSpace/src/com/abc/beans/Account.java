package com.abc.beans;

public class Account {

	private String accNo;
	private String accType;
	private String accName;
	private int balance;

	
	
	public Account(String accNo, String accType, String accName, int balance) {
		this.accNo = accNo;
		this.accType = accType;
		this.accName = accName;
		this.balance = balance;
	}

	//Overriding toString() to print account details
	@Override
	public String toString() {
		return " [accNo=" + accNo + ", accType=" + accType + ", accName=" + accName + ", balance=" + balance + "]";
	}

}
