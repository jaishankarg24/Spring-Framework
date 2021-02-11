package com.abc.mainapp;

import java.text.DateFormat;


import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainApp {

	public static void main(String[] args) {

		// Categorizing the ENGLISH and US users
		Locale locale = new Locale("it", "IT");

		// Representing the number format for US users only
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		System.out.println(numberFormat.format(1234568.4567));

		System.out.println();

		// Representing the date format for US users only
		DateFormat dateFormat = DateFormat.getDateInstance(0, locale);
		System.out.println(dateFormat.format(new Date()));
		
		System.out.println();

		// Representing the message depending on Locale
		String baseName = "com/abc/resources/abc";
		ResourceBundle resourceBundle = ResourceBundle.getBundle(baseName, locale);
		System.out.println(resourceBundle.getString("welcome"));

	}

}
