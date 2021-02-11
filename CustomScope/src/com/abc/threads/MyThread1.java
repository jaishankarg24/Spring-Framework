package com.abc.threads;

import org.springframework.context.ApplicationContext;

public class MyThread1 extends Thread {
	
	@SuppressWarnings("unused")
	private ApplicationContext applicationContext;
	
	public MyThread1(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
		
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ "Bean reference is:" + applicationContext.getBean("helloBean"));
	}
}
