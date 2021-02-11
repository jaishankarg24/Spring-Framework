package com.abc.beans;

public class HelloBean {
 
	static {
		System.out.println("HelloBean is getting loaded by SpringIOC Container "+"\n");
	}
	
	public HelloBean() {
		System.out.println("HelloBean Object is created by SpringIoc container");
	}
}
