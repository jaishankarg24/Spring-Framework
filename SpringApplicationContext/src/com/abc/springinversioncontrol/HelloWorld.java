package com.abc.springinversioncontrol;

public class HelloWorld {

	static {
		System.out.println("Bean is Loading");
	}
	
	public HelloWorld() {
		System.out.println("Bean object is created by ApplicationContext IOC Container");
	}
	
	public String helloUser() {
		return "hey thanks for invoking......";
	}
}