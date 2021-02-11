package com.abc.threads;

import java.util.Map;


import org.springframework.beans.factory.ObjectFactory;

import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope {
	
	CustomThreadLocal threadLocal=new CustomThreadLocal();
	 Map<String, Object> map = null;
	

	@SuppressWarnings("unchecked")
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		map = (Map<String, Object>) threadLocal.get();
		
		Object object = map.get(name);
		if (object==null) {
			object= objectFactory.getObject();
			
			map.put(name, object);
		}
		return object;
	}

	@Override
	public Object remove(String name) {
		//Object object = map.remove(name);
		//return object;
		
		return map.remove(name);
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerDestructionCallback(String arg0, Runnable arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object resolveContextualObject(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}


}
