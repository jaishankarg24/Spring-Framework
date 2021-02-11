package com.abc.events;

import org.springframework.context.ApplicationListener;

import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshImpl implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {

		System.out.println("Applicationcontext Refreshed");
	}

}
