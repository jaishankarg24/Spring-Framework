package com.abc.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.beans.Employee;

public class MainApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee = (Employee) context.getBean("employee");
		
		employee.displayDetails();
		
		context.close();
	}
}