package com.abc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.abc.beans.User;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		User user = (User)applicationContext.getBean("user");
		user.display();
		
		applicationContext.close();
	}

}

/*----------output---------
BeanLifeCycle: Bean Loading..
BeanLifeCycle: Bean Instantiation
User Details are:
Username is :sachin
UserAge is :25
UserEmail is :sachin@gmail.com
UserPhone is :9874563214
*/