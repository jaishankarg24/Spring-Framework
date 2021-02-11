package com.abc.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.abc.beans.I18N;

public class MainApp {

	public static void main(String[] args) {

		// Activating IOC container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// create the bean
		I18N i18n = (I18N) applicationContext.getBean("i18n");

		// Use the bean
		i18n.displayMessage();

		// close the container
		applicationContext.close();

	}

}
