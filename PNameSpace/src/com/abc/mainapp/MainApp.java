package com.abc.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.Student;

public class MainApp {

	public static void main(String[] args) {

		// Invoke the IOC container

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// create the bean

		Student student = (Student) applicationContext.getBean("student");

		// use the bean
		student.displayDetails();

		// close the container
		applicationContext.close();

	}

}

/*-------------------------------------------------
Student details are :
Student Name is                  :saurav
Student id is                    :abc0001
Student address is               :kolkatta
---------------------------------------------------------
Course Details are 
Course id is                     :c-111
Course Name is                   :COREJAVA SQL JAVASCRIPT
Course Cost is                   :1000
*/