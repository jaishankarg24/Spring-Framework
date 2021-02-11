package com.abc.springinversioncontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step.1 Loading the configuration files to the Spring Application ContextContainer(IOC)
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//Step.2 Use the ApplicationContext to get the Bean
		HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
		
		//Step.3 Use the Bean to invoke a method
		System.out.println(bean.helloUser());
		
		//Step.4 Close the resource
		applicationContext.close();

	}

}
