package com.abc.beans;

public class Account {

	private String accNo;
	private String accType;
	private String accName;
	private int balance;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// Overriding toString() to print account details
	@Override
	public String toString() {
		return " [accNo=" + accNo + ", accType=" + accType + ", accName=" + accName + ", balance=" + balance + "]";
	}

}
