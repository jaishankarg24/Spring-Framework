package com.abc.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.service.StudentService;

public class MainApp {

	public static void main(String[] args) {

		// Activate the IOC container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Get the bean from the container

		StudentService studentService = (StudentService) applicationContext.getBean("studentService");

		// use the bean
		String status = studentService.save("IND07", "DHONI", "RANCHI");
		if (status == "success") {
			System.out.println("Record Inserted Succesfully");
		}
		if (status == "failure") {
			System.out.println("Failed to insert the record");
		}
		if (status.equals("Already Existed")) {
			System.out.println("Record alreay existed");
		}

		// close the container
		applicationContext.close();

	}

}
