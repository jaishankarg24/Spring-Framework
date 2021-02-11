package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		  ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			
			HelloBean bean = (HelloBean) applicationContext.getBean("helloBean");
			System.out.println(bean.sayHello());
			
			applicationContext.close();
			
			System.out.println(bean.sayHello());
	}

}

/*----------output-------------
Bean is Loading..
Bean Object is created
Setter is getting called
Inside the afterPropertiesSet of callback method
Hello sachin
Inside the destory method of callback method
*/