package com.abc.bean;

public class HelloBean {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static {
		System.out.println("HelloBean is Loading");
	}
	
	public HelloBean() {
		System.out.println("HelloBean Object is created");
	}
}
