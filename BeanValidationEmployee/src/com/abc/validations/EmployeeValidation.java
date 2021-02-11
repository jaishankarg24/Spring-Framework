package com.abc.validations;

import java.io.IOException;


import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.abc.beans.Employee;

public class EmployeeValidation implements Validator {

	// Only the file name information will be injected through setter
	private Resource resource;

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public boolean supports(Class className) {

		return Employee.class.equals(className);
	}

	@Override
	public void validate(Object object, Errors error) {

		try {
			// load the properties file available inside resource variable
			Properties properties = PropertiesLoaderUtils.loadProperties(resource);

			// Downcast to perform validation on Employee Object
			Employee employee = (Employee) object;

			// Use getter to get the attribute and perform validation on fields

			if (employee.getEid() == "" || employee.getEid() == null) {

				// Set the error value as per the BUISNESS rules
				error.rejectValue("eid", "error.eid.required", properties.getProperty("error.eid.required"));
			}
			if (!employee.getEid().startsWith("abc")) {
				error.rejectValue("eid", "error.eid.invalid", properties.getProperty("error.eid.invalid"));
			}
			
			

			if (employee.getEname() == "" || employee.getEname() == null) {

				error.rejectValue("ename", "error.ename.required", properties.getProperty("error.ename.required"));

			}

			else if (employee.getEname().length() < 6) {

				error.rejectValue("ename", "error.ename.minlength", properties.getProperty("error.ename.minlength"));
			} else if (employee.getEname().length() > 15) {

				error.rejectValue("ename", "error.ename.maxlength", properties.getProperty("error.ename.maxlength"));
			}

			if (employee.getEage() < 18) {
				error.rejectValue("eage", "error.eage.minage", properties.getProperty("error.eage.minage"));
			} else if (employee.getEage() > 30) {
				error.rejectValue("eage", "error.eage.maxage", properties.getProperty("error.eage.maxage"));

			}
			if (employee.getEmail() == "" || employee.getEmail() == null) {
				error.rejectValue("email", "error.email.required", properties.getProperty("error.email.required"));
			}

			else if (!employee.getEmail().endsWith("@gmail.com")) {
				error.rejectValue("email", "error.email.invalid", properties.getProperty("error.email.invalid"));
			}
			
			

		} catch (IOException e) {
			System.out.println("The cause of the exception is :" + e.getMessage());
		}

	}

}
