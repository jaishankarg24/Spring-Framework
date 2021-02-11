package com.abc.beans;

public class WelcomeBean {
	private String name;
	private String wishMessage;
	
	public WelcomeBean(){
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWishMessage() {
		return wishMessage;
	}

	public void setWishMessage(String wishMessage) {
		this.wishMessage = wishMessage;
	}
	
	public String greetUser() {
		return wishMessage+" "+name;
	}
	
	public void init() {
		System.out.println("init() method of WelcomeBean");
	}
	
	public void destroy() {
		System.out.println("destroy() method of WelcomeBean");
	}

}
