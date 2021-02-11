package com.abc.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.Student;

public class MainApp {

	public static void main(String[] args) {

		// Invoke the IOC container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// get the bean
		Student student = (Student) applicationContext.getBean("student");
		

		// use the bean
		student.displayDetails();

		// close the bean
		applicationContext.close();

	}

}

/*-----------------------
Student details are 
Student id is                                  :abc19
Student name is                                :dravid
The address details are                        :[pno=10/12thStreet, city=Bengaluru, state=Karnataka, country=IND]
The student Qualification is                   :[B.E, MTECH, PHD]
The Courses offered are                        :[JAVA, J2EE, FRAMEWORKS]
The course and trainer names are               :{JAVA=ShivPrasad, J2EE=Imraz, FRAMEWORKS=Yuvraj}
The course and cost is                         :{JAVA=1000, J2EE=1500, FRAMEWORKS=2000}
*/