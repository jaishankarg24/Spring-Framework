package com.abc.beans;

public class HelloBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		System.out.println("Setter is getting called");
		this.name = name;
	}
	
	public HelloBean() {
		System.out.println("Bean Object is created");
	}
	
	static {
		System.out.println("Bean is Loading..");
	}
	
	public String sayHello() {
		return "Hello"+" "+name;
	}
	
	//@PostConstruct
	public void init() {
		System.out.println("Bean initializing method");
	}
	
	//@PreDestory
	public void destory() {
		System.out.println("Bean Destruction method");
	}
}
