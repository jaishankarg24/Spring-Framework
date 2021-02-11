package com.abc.config;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;

import com.abc.beans.HelloBean;
import com.abc.beans.WelcomeBean;

//@Configuration
public class BeanConfig {
	
	@Bean(initMethod = "customInit", destroyMethod= "customDestroy")
	public HelloBean helloBean() {
		return new HelloBean();
	}
	
	@Bean(initMethod = "customInit", destroyMethod= "customDestroy")
	public WelcomeBean welcomeBean() {
		return new WelcomeBean();
	}

}
