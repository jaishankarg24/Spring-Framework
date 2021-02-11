package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.beans.Student;



public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student student = (Student)applicationContext.getBean("student");
		student.display();
		
		applicationContext.close();

	}

}

/*-----------------

Student Information are :
Sid :s10
sname :sachin
sage :24
saddress :Mumbai
Course[cid=c10, cname=spring, cost=3000]

*/