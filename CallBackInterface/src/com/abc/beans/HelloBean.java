package com.abc.beans;

import org.springframework.beans.factory.DisposableBean;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestory;
public class HelloBean 
	//implements InitializingBean, DisposableBean 
{
	
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
	public void customInit() {
		System.out.println("Bean initializing method");
	}
	
	//@PreDestory
	public void customDestory() {
		System.out.println("Bean Destruction method");
	}
	
	/*
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside the destory method of callback method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside the afterPropertiesSet of callback method");
		
	}
	*/
}
