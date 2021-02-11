package com.abc.threads;

public class MyThread1 extends Thread {
	
	static ThreadScope scope = new ThreadScope();
	
	Check check;
	
	public MyThread1(Check check) {
		this.check = check;
	}
	
	@Override
	public void run() {
		
		//ThreadScope.scope.set("ABC");
		scope.set("ABC");
		check.m1();
	}
}