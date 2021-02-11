package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.Employee;

public class Test {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Employee employee= (Employee)applicationContext.getBean("employee");
		employee.display();
		
		applicationContext.close();

	}

}
