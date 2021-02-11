package com.abc.test;

import com.abc.threads.Check;

import com.abc.threads.MyThread1;
import com.abc.threads.MyThread2;

public class Test {

	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1(new Check());
		mt1.setName("XXX");
		mt1.start();
		
		MyThread2 mt2 =new MyThread2(new Check());
		mt2.setName("YYY");
		mt2.start();

	}

}
