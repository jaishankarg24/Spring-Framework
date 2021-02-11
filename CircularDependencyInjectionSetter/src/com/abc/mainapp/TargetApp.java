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

		
		System.out.println(student.getBranch());
		System.out.println(branch.getStudent());

		// close the container
		applicationContext.close();

	}

}

/*----------------------------------------
The student Name is :SACHIN
The Branch Name is  :CSE

com.abc.beans.Branch@1622f1b
com.abc.beans.Student@72a7c7e0
*/