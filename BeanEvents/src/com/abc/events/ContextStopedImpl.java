package com.abc.events;

import org.springframework.context.ApplicationListener;

import org.springframework.context.event.ContextStoppedEvent;

public class ContextStopedImpl implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {

		System.out.println("ApplicationContext Stopped");
	}

}
