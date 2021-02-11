package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.HelloBean;

//import com.abc.threads.MyThread1;

//import com.abc.threads.MyThread2;
import com.abc.threads.ThreadScope;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		HelloBean bean1 = (HelloBean) applicationContext.getBean("helloBean");
		System.out.println(bean1);
		
		HelloBean bean2 = (HelloBean) applicationContext.getBean("helloBean");
		System.out.println(bean2);
		
		System.out.println("Is bean1 and bean2 references are equal :"+ (bean1==bean2));
		
		ThreadScope threadScope = (ThreadScope) applicationContext.getBean("threadScope");
		System.out.println(threadScope);
		
		System.out.println("Object Removed from the beans is:"+ threadScope.remove("helloBean"));
		
		HelloBean bean3 = (HelloBean) applicationContext.getBean("helloBean");
		System.out.println(bean3);
		
		HelloBean bean4 = (HelloBean) applicationContext.getBean("helloBean");
		System.out.println(bean4);
		
		System.out.println("Is bean3 and bean4 references equal :"+ (bean3==bean4));
		
		/*2

		System.out.println(Thread.currentThread().getName()+ "Bean reference is:" + applicationContext.getBean("helloBean"));

		System.out.println(Thread.currentThread().getName()+ "Bean reference is:" + applicationContext.getBean("helloBean"));

		MyThread1 mt1 = new MyThread1(applicationContext);
		mt1.setName("XXX");
		mt1.start();
		
		MyThread2 mt2 =new MyThread2(applicationContext);
		mt2.setName("YYY");
		mt2.start();
		*/

		applicationContext.close();

	}

}

/* ------customScope---------output-----------
HelloBean is getting loaded by SpringIOC Container 

HelloBean Object is created by SpringIoc container
com.abc.beans.HelloBean@39529185
com.abc.beans.HelloBean@39529185
Is bean1 and bean2 references are equal :true
com.abc.threads.ThreadScope@72f926e6
Object Removed from the beans is:com.abc.beans.HelloBean@39529185
HelloBean Object is created by SpringIoc container
com.abc.beans.HelloBean@3daa422a
com.abc.beans.HelloBean@3daa422a
Is bean3 and bean4 references equal :true  
*/

/*--------------Singleton-------output------
HelloBean is getting loaded by SpringIOC Container 

HelloBean Object is created by SpringIoc container
mainBean reference is:com.abc.beans.HelloBean@2145b572
mainBean reference is:com.abc.beans.HelloBean@2145b572
XXXBean reference is:com.abc.beans.HelloBean@2145b572
YYYBean reference is:com.abc.beans.HelloBean@2145b572
*/ 

/*---------------Prototype-------------output-----
HelloBean is getting loaded by SpringIOC Container 

HelloBean Object is created by SpringIoc container
mainBean reference is:com.abc.beans.HelloBean@2145b572
HelloBean Object is created by SpringIoc container
mainBean reference is:com.abc.beans.HelloBean@39529185
HelloBean Object is created by SpringIoc container
XXXBean reference is:com.abc.beans.HelloBean@1b903874
HelloBean Object is created by SpringIoc container
YYYBean reference is:com.abc.beans.HelloBean@28d46c6e
*/