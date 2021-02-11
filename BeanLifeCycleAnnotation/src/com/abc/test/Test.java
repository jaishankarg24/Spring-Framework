package com.abc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.beans.HelloBean;
import com.abc.beans.WelcomeBean;
import com.abc.config.BeanConfig;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		HelloBean helloBean = (HelloBean) applicationContext.getBean("helloBean");
		System.out.println(helloBean.sayHello());
		System.out.println();
		
		WelcomeBean welcomeBean = (WelcomeBean) applicationContext.getBean("welcomeBean");
		System.out.println(welcomeBean.wishUser());
		System.out.println();

		applicationContext.close();
	}

}
