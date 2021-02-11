package com.abc.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.abc.beans.Employee;

public class MainApp {

	public static void main(String[] args) {

		// Activating the IOC container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml"); //ContextRefreshedEvent gets Generated

		// Creating the bean
		Employee employee = (Employee) applicationContext.getBean("employee");

		// using the bean
		System.out.println(employee.greetUser());
		
		System.out.println();
		
		applicationContext.start();// ContextStartedEvent gets generated 
		applicationContext.refresh();// ContextRefreshedEvent gets generated
		applicationContext.stop();// ContextStopEvent gets generated
		
		

		// closing the IOC container
		applicationContext.close();

	}

}
