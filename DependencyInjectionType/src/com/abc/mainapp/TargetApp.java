package com.abc.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.Branch;
import com.abc.beans.Student;

public class TargetApp {

	public static void main(String[] args) {

		// Activate IOC container

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// create the bean
		Student student = (Student) applicationContext.getBean("student");
		Branch branch = (Branch) applicationContext.getBean("branch");

		// use the bean
		System.out.println("The student Name is :" + student.getStudentName());
		System.out.println("The Branch Name is  :" + branch.getBranchName());

		// close the container
		applicationContext.close();

	}

}
