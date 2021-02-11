package com.abc.beans;

public class HelloBean {
	
	private String name;
	private String wishMessage;
	
	public HelloBean(){
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
	
	public String sayHello() {
		return wishMessage+" "+name;
	}
	
	public void init() {
		System.out.println("init() method of HelloBean");
	}
	
	public void destroy() {
		System.out.println("destroy() method of HelloBean");
	}

}
