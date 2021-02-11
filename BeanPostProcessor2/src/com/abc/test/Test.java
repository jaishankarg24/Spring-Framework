package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.HelloBean;


public class Test {

	public static void main(String[] args) {
ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		HelloBean helloBean =(HelloBean) applicationContext.getBean("helloBean");
		System.out.println();

		System.out.println(helloBean.sayHello());
		
		System.out.println();
		applicationContext.close();

	}

}


/*------------------output-------
BeanLifeCycle: HelloBean Loading.....
BeanLifeCycle: HelloBean Instantiation..
Setter getting called


BeanPostProcessor1: BeforeInitialization--->helloBean
BeanPostProcessor2: BeforeInitialization--->helloBean

HelloBean InitializingBean: afterPropertiesSet()

BeanPostProcessor1: AfterInitialization--->helloBean
BeanPostProcessor2: AfterInitialization--->helloBean

hello sachin

HelloBean DestroyBeanInterface: destroy()

*/

/*----for bp1->1 bpp2->0---
BeanLifeCycle: HelloBean Loading.....
BeanLifeCycle: HelloBean Instantiation..
Setter getting called


BeanPostProcessor2: BeforeInitialization--->helloBean
BeanPostProcessor1: BeforeInitialization--->helloBean
HelloBean InitializingBean: afterPropertiesSet()
BeanPostProcessor2: AfterInitialization--->helloBean
BeanPostProcessor1: AfterInitialization--->helloBean

hello sachin

HelloBean DestroyBeanInterface: destroy()
*/

/*----for bp1->0 bpp2->1---
BeanLifeCycle: HelloBean Loading.....
BeanLifeCycle: HelloBean Instantiation..
Setter getting called


BeanPostProcessor1: BeforeInitialization--->helloBean
BeanPostProcessor2: BeforeInitialization--->helloBean
HelloBean InitializingBean: afterPropertiesSet()
BeanPostProcessor1: AfterInitialization--->helloBean
BeanPostProcessor2: AfterInitialization--->helloBean

hello sachin

HelloBean DestroyBeanInterface: destroy()
*/