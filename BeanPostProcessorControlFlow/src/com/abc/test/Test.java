package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.HelloBean;
import com.abc.beans.WelcomeBean;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		HelloBean helloBean =(HelloBean) applicationContext.getBean("helloBean");
		System.out.println();

		System.out.println(helloBean.sayHello());
		
		WelcomeBean welcomeBean =(WelcomeBean) applicationContext.getBean("welcomeBean");
		System.out.println();

		System.out.println(welcomeBean.greetUser());
		
		System.out.println();
		applicationContext.close();
		
	}

}

/*------------------output--------------
BeanLifeCycle: HelloBean Loading.....
BeanLifeCycle: HelloBean Instantiation..
Setter getting called


BeanPostProcessor: BeforeInitialization
HelloBean PostConstruct: init()
HelloBean InitializingBean: afterPropertiesSet()
HelloBean init()----user Defind method
BeanPostProcessor: AfterInitialization


BeanLifeCycle:Welcome Bean Loading.....
BeanLifeCycle:Welcome Bean Instantiation..
Setter getting called


BeanPostProcessor: BeforeInitialization
Welcome Bean PostConstruct: init()
Welcome Bean InitializingBean: afterPropertiesSet()
Welcome Bean init()----user Defind method
BeanPostProcessor: AfterInitialization

hello sachin

Welcome dhoni

Welcome Bean PreDestroy: destroy()
Welcome Bean DestroyBeanInterface: destroy()
Welcome Bean destroy()----userDefind

HelloBean PreDestroy: destroy()
HelloBean DestroyBeanInterface: destroy()
HelloBean destroy()----userDefind
*/