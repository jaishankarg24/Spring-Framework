package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


//import com.abc.beans.HelloBean;
import com.abc.beans.HiBean;
import com.abc.beans.WelcomeBean;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//HelloBean helloBean =(HelloBean)applicationContext.getBean("helloBean");
		//System.out.println(helloBean.sayHello());
		System.out.println();
		
		WelcomeBean welcomeBean =(WelcomeBean)applicationContext.getBean("welcomeBean");
		System.out.println(welcomeBean.greetUser());
		System.out.println();

		HiBean hiBean =(HiBean)applicationContext.getBean("hiBean");
		System.out.println(hiBean.sayHi());
		System.out.println();
		
		applicationContext.close();

	}

}
