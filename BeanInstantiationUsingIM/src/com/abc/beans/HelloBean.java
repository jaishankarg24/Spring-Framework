package com.abc.beans;

public class HelloBean {
	static {
		System.out.println("HelloBean is Loading..");
	}
	
	public void sayHello() {
		System.out.println("Hey its a method from HelloBean");
	}

}
