package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.HelloBean;

public class Test {

	public static void main(String[] args) {

       ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		HelloBean bean = (HelloBean) applicationContext.getBean("helloBean");
		System.out.println(bean.sayHello());
		
		applicationContext.close();
	}

}
