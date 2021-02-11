package com.abc.threads;

import org.springframework.context.ApplicationContext;

public class MyThread2 extends Thread {
	
	@SuppressWarnings("unused")
	private ApplicationContext applicationContext;
	
	public MyThread2(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
		
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ "Bean reference is:" + applicationContext.getBean("helloBean"));
	}

}
