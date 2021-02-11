package com.abc.beans;

import org.springframework.beans.BeansException;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessor1 implements BeanPostProcessor, Ordered {

	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor1: AfterInitialization"+"--->"+beanName);
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor1: BeforeInitialization"+"--->"+beanName);

		return bean;
	}
	
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
