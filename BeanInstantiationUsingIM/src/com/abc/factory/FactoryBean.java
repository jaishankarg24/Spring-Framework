package com.abc.factory;

import com.abc.beans.HelloBean;

public class FactoryBean {
	
	static {
		System.out.println("FactoryBean is Loading....");
	}
	
	public HelloBean getInstanceOf() {
		
		System.out.println("BeanLifeCycle : BeanInstantiation Through Instance Factory Method");
		return new HelloBean();
		
	}

}
