package com.abc.mainapp;

import java.util.List;


import org.springframework.context.support.GenericXmlApplicationContext;

import com.abc.beans.StudentDb;
import com.abc.dto.Student;

public class TestingApp {
	
	public static void main(String[] args) {
		
		// Setting the value to pull the respective XML file information
		System.setProperty("spring.profiles.active", "testing");
		
		// Activating the IOC container
		GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext(
				"applicationContext-development.xml", "applicationContext-testing.xml");
		
		// create the bean
		StudentDb studentDb = (StudentDb) applicationContext.getBean("studentDb");
		
		// use the bean and invoke the methods
		List<Student> students = studentDb.findAll();
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		// close the Container
		applicationContext.close();
	}
}