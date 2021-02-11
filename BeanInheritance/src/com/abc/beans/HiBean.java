package com.abc.beans;

public class HiBean {
	
	private String name;
	private String wishMessage;
	
	public HiBean(){
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
	
	public String sayHi() {
		return wishMessage+" "+name;
	}
	
	public void init() {
		System.out.println("init() method of HiBean");
	}
	
	public void destroy() {
		System.out.println("destroy() method of HiBean");
	}

}
