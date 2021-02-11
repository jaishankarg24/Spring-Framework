package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.HelloBean;

@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		HelloBean bean = (HelloBean) applicationContext.getBean("helloBean");
		bean.sayHello();
		
		applicationContext.close();
	}

}

/*-----output-------
FactoryBean is Loading....
BeanLifeCycle : BeanInstantiation Through Instance Factory Method
HelloBean is Loading..
Hey its a method from HelloBean
*/