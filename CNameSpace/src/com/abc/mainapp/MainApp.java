package com.abc.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.Employee;

public class MainApp {

	public static void main(String[] args) {

		// Invoke the IOC container

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// create the bean
		Employee employee = (Employee) applicationContext.getBean("employee");

		// use the bean
		employee.displayDetails();

		// close the container
		applicationContext.close();

	}

}
/*--------------------------------------
Employee Details are 
EID is                         :abc1234
ENAME is                       :sachin
COMPANYNAME is                 :ABC
--------------------------------------------------------------
Account details are : [accNo=abc0001, accType=savings, accName=sachin, balance=123456]
*/