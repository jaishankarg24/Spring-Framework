package com.abc.beans;

public class HelloBean {
	/*
	private HelloBean() {
		System.out.println("BeanLife Cycle: Bean Instantiation Through Constructor");
	}
	*/
	static {
		System.out.println("BeanLife Cycle Bean Loading...");
	}
	
	public static HelloBean getInstanceOf() {
		System.out.println("BeanLife Cycle: Bean Instantiation Through StaticFactoryMethod");

		return new HelloBean();
	}
	
	public void sayHello() {
		System.out.println("Invoking the Method of a Bean");
	}
}
