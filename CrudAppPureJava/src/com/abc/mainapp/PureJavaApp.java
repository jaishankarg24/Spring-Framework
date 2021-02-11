package com.abc.mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import com.abc.beans.Student;
import com.abc.config.StudentConfig;

public class PureJavaApp {

	public static void main(String[] args) {

		// Activate IOC container through Annotations of Spring
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				StudentConfig.class);

		// Create the bean
		Student student = (Student) applicationContext.getBean("student");

		// use the bean
		student.displayDetails();

		// close the container
		applicationContext.close();

	}

}
