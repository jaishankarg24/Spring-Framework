package com.abc.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.Student;

public class MainApp {

	public static void main(String[] args) {

		// Activating IOC container through XML
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Creating the Bean
		Student student = (Student) applicationContext.getBean("student");

		// use the bean and invoke methods of the bean
		student.displayDetails();

		// Close the container
		applicationContext.close();

	}

}
