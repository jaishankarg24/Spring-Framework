package com.abc.beans;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class WelcomeBean implements InitializingBean, DisposableBean{

String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter getting called"+"\n\n");
		this.name = name;
	}

	static {
		System.out.println("BeanLifeCycle:Welcome Bean Loading.....");
	}
	
	public WelcomeBean() {
		System.out.println("BeanLifeCycle:Welcome Bean Instantiation..");
	}
	
	public String greetUser() {
		return "Welcome"+" "+ name;
	}
	
	public void customInit() {
		System.out.println("Welcome Bean init()----user Defind method");
	}
	
	public void customDestroy() {
		System.out.println("Welcome Bean destroy()----userDefind");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Welcome Bean InitializingBean: afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Welcome Bean DestroyBeanInterface: destroy()");
	}
	
	@PostConstruct
	public void annotationInit() {
		System.out.println("Welcome Bean PostConstruct: init()");
	}
	@PreDestroy
	public void annotationDestroy() {
		System.out.println("Welcome Bean PreDestroy: destroy()");
	}
}
