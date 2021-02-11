package com.abc.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.abc.beans.Student;

public class TargetApp {

	public static void main(String[] args) {

		// Invoke the IOC Container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// create the bean
		Student student = (Student) applicationContext.getBean("student");

		// use the bean
		student.displayDetails();

		// close the bean
		applicationContext.close();
	}

}

/*--------------------------------
Student Details are:
Student Id is                   :IND10
Student Name is                 :SACHIN
Student address is              :Mumbai
Student Country is              :INDIA
*/