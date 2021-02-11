package com.abc.threads;

public class MyThread2 extends Thread {

	static ThreadScope scope = new ThreadScope();
    Check check;

	public MyThread2(Check check) {
		this.check = check;
	}
	
	@Override
	public void run() {
		
		scope.set("ABC2.0");
		check.m2();
	}

}
