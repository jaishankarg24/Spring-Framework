package com.abc.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.abc.beans.Student;

public class MainApp {

	public static void main(String[] args) {

		// Activate the IOC Container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Create the bean object
		Student student = (Student) applicationContext.getBean("student");

		// use the object
		student.dispalyDetails();

		// close the container
		applicationContext.close();

	}

}
