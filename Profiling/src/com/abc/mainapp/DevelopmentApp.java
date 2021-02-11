package com.abc.mainapp;

import java.util.List;


import org.springframework.context.support.GenericXmlApplicationContext;

import com.abc.beans.StudentDb;
import com.abc.dto.Student;

public class DevelopmentApp {
	public static void main(String[] args) {
		
		// Setting the Key(inbuilt) and value to pull the respective XML file information(profile name)
		System.setProperty("spring.profiles.active", "development");
		
		// Activating the IOC container
		GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
		// Events
		applicationContext.load("applicationContext-development.xml", "applicationContext-testing.xml");
		applicationContext.refresh();
		
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