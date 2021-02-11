package com.abc.beans;

public class Employee {
	
	private String name;
	private int age;
	private String address;
	
	
	public Employee(String name, int age, String address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Employee details are :");
		System.out.println("Name is :"+name);
		System.out.println("age is :"+age);
		System.out.println("address is :"+address);

	}
	

}
