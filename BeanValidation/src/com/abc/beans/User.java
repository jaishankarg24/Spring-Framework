package com.abc.beans;

public class User {
	
	private String uname;
	private int uage;
	private String uemail;
	private String uphone;
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public User() {
		System.out.println("BeanLifeCycle: Bean Instantiation");
	}
	
	static {
		System.out.println("BeanLifeCycle: Bean Loading..");
	}
	
	public void display() {
		System.out.println("User Details are:");
		System.out.println("Username is :"+ uname);
		System.out.println("UserAge is :"+ uage);
		System.out.println("UserEmail is :"+ uemail);
		System.out.println("UserPhone is :"+ uphone);

		
	}

}
