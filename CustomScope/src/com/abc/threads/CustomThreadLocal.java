package com.abc.threads;

import java.util.HashMap;

public class CustomThreadLocal extends ThreadLocal<Object>{
	
	//CustomThreadLocal customThreadLocal=new CustomThreadLocal();
	
	@Override
	protected Object initialValue() {
		return new HashMap<String, Object>();
	}
	

}
