package com.abc.events;

import org.springframework.context.ApplicationListener;


import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedImpl implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent arg0) {

		System.out.println("ApplicationContext closed");
	}

}
