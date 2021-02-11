package com.abc.events;

import org.springframework.context.ApplicationListener;

import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedImpl implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {

		System.out.println("ApplicationContext Started");
	}

}
