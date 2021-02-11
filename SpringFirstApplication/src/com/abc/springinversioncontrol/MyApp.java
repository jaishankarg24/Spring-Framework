package com.abc.springinversioncontrol;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyApp {

	public static void main(String[] args) {
		
		
		//HelloWorld helloworld = new HelloWorld();
		//System.out.println(helloworld.helloUser());
		
		//Step.1 creating a resource which contains the information of the class
		Resource resource = new ClassPathResource("bean.xml");
		
		//Step.2 create a bean factory for a given resource.
		@SuppressWarnings("deprecation")
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		HelloWorld bean = (HelloWorld) beanFactory.getBean("helloworld");
		
		//Step.3 use bean to invoke a method.
		System.out.println(bean.helloUser());
		

	}

}
