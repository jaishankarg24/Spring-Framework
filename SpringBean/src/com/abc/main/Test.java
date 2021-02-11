package com.abc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.bean.HelloBean;

public class Test {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		HelloBean bean = (HelloBean) applicationContext.getBean("hellobean2");
		
		System.out.println("the user name is :"+ bean.getName());
		System.out.println("the user age is :"+ bean.getAge());

		applicationContext.close();
	}

}
