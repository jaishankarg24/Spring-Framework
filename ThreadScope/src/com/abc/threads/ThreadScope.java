package com.abc.threads;

public class ThreadScope extends ThreadLocal<Object> {
	
	//static ThreadScope scope = new ThreadScope();
	
	@Override
	protected Object initialValue() {
		//return "ABC2.0";
		
		return "IND";
	}

}

/* 
 set()--> to set value to the scope variable.
 get()-->to get the value from the scope variable.
 remove()--> to remove value from the scope variable.
 initialValue()-->to give initial value for the scope variable
 					before it is set we use this method.
 					
 for xxx, yyy threads output
 
 Inside m1(): XXXThread Local value is :ABC
Inside m2(): YYYThread Local value is :ABC2.0
Inside m2() : XXX ThreadLocalvalue is:IND
Inside m1() : YYY ThreadLocalvalue is:IND

 */