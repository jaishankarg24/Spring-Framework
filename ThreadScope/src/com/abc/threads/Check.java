package com.abc.threads;

public class Check {
	
	public void m1() {
		//System.out.println("Name of the Thread is: " + Thread.currentThread().getName() +" has executed m1 method");
		//System.out.println("ThreadScope Value is:" + ThreadScope.scope.get());
		
		System.out.println("Inside m1(): " +Thread.currentThread().getName()+ "Thread Local value is :"+ MyThread1.scope.get());
		System.out.println("Inside m1() : YYY ThreadLocalvalue is:" + MyThread2.scope.get());
	}

	public void m2() {
		System.out.println("Inside m2(): " +Thread.currentThread().getName()+ "Thread Local value is :"+ MyThread2.scope.get());
		System.out.println("Inside m2() : XXX ThreadLocalvalue is:" + MyThread1.scope.get());
		
	}
	

}
