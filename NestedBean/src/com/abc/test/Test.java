package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.Student;

public class Test {

	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student student = (Student) applicationContext.getBean("student");
		student.displayInfo();
		
		applicationContext.close();
		
	}

}

/*-----------------output----------
The Student details are:
Name is :sachin
Id is :abc10
Age is :25
The course details are :
----------------------------
cid is :c001
cname is :Spring
cost is :10000
*/