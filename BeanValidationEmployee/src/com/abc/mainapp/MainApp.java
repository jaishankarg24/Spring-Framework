package com.abc.mainapp;

import java.util.HashMap;


import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.Errors;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.abc.beans.Employee;
import com.abc.validations.EmployeeValidation;

public class MainApp {

	public static void main(String[] args) {

		// Activate the IOC container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Get the bean
		Employee employee = (Employee) applicationContext.getBean("employee");

		// Use the bean
		employee.displayDetails();

		// Get the validation Object to validate the employee bean
		EmployeeValidation employeeValidation = (EmployeeValidation) applicationContext.getBean("employeeValidation");

		// Create a map object to store the error information
		Map<String, String> map = new HashMap<>();

		// Create a MapBindingResult to pass as an Argument to validate method
		Errors result = new MapBindingResult(map, "com.abc.beans.Employee");
/*--------
		// Call validate method which would store the error information
		employeeValidation.validate(employee, result);

		// Access the error information and print it on to the console

		List<ObjectError> errors = result.getAllErrors();

		for (ObjectError objectError : errors) {
			System.out.println(objectError.getObjectName() + ":" + objectError.getDefaultMessage());
		}

		// close the container
		applicationContext.close();
		
*/
		// Access the error information and print it on to the console

		if (employeeValidation.supports(Employee.class)) {
					
			// Call validate method which would store the error information
			employeeValidation.validate(employee, result);
					
			List<ObjectError> errors = result.getAllErrors();
			
			for (ObjectError objectError : errors) {
					System.out.println(objectError.getObjectName() + ":" + objectError.getDefaultMessage());
			}
		}
		// close the container
		applicationContext.close();
	}

}
