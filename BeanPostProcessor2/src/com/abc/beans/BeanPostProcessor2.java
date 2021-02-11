package com.abc.beans;

import org.springframework.beans.BeansException;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessor2 implements BeanPostProcessor, Ordered {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor2: AfterInitialization"+"--->"+beanName);
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor2: BeforeInitialization"+"--->"+beanName);

		return bean;
	}
	@Override
	public int getOrder() {
		
		return 2;
	}

}
