package com.abc.beans;

import org.springframework.beans.factory.annotation.Value;

public class HelloBean {
	@Value("sachin")
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter is called");
		this.name = name;
	}
	
	static {
		System.out.println("beanLifeCycle: Bean Loading...");
	}

	public HelloBean() {
		System.out.println("BeanLifeCycle: BeanInstantiation through Constructor");
	}
	
	public String sayHello() {
		return "Hello" + name;
	}
	
	public void customInit() {
		System.out.println("Setting up the environment for JDBC ");
	}
	
	public void customDestroy() {
		System.out.println("Closing JDBC Environment");
	}
}
