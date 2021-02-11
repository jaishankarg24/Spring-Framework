package com.abc.beans;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean, DisposableBean{
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter getting called"+"\n\n");
		this.name = name;
	}

	static {
		System.out.println("BeanLifeCycle: HelloBean Loading.....");
	}
	
	public HelloBean() {
		System.out.println("BeanLifeCycle: HelloBean Instantiation..");
	}
	
	public String sayHello() {
		return "hello"+" "+ name;
	}
	
	public void customInit() {
		System.out.println("HelloBean init()----user Defind method");
	}
	
	public void customDestroy() {
		System.out.println("HelloBean destroy()----userDefind");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("HelloBean InitializingBean: afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("HelloBean DestroyBeanInterface: destroy()");
	}
	
	@PostConstruct
	public void annotationInit() {
		System.out.println("HelloBean PostConstruct: init()");
	}
	@PreDestroy
	public void annotationDestroy() {
		System.out.println("HelloBean PreDestroy: destroy()");
	}
}
