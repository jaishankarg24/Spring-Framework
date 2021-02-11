package com.abc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.abc.beans.HelloBean;
import com.abc.beans.WelcomeBean;
import com.abc.config.BeanConfig;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		HelloBean hellobean = (HelloBean) applicationContext.getBean("helloBean");
		hellobean.setName("SACHIN");
		System.out.println(hellobean.sayHello());
		System.out.println();
		
		WelcomeBean welcomebean = (WelcomeBean) applicationContext.getBean("welcomeBean");
		welcomebean.setName("DHONI");
		System.out.println(welcomebean.wishUser());
		System.out.println();

		applicationContext.close();
	}

}


/*-----------output-----------
beanLifeCycle: Bean Loading...
BeanLifeCycle: BeanInstantiation through Constructor
@PostConstruct---init()
Setting up the environment for JDBC 
beanLifeCycle: Bean Loading...
BeanLifeCycle: BeanInstantiation through Constructor
@PostConstruct---init()
Setting up the environment for JDBC 
Hellosachin

Hellodhoni

@PreDestroy-----destroy()
Closing JDBC Environment
@PreDestroy-----destroy()
Closing JDBC Environment
*/