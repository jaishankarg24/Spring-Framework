package com.abc.custompropertyeditor;

import java.beans.PropertyEditorSupport;

import com.abc.beans.Address;

public class EmployeeAddressPropertyEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		System.out.println(text);
		
		String[] data = text.split("-");
		
		for (String info : data) {
			System.out.println(info);
		}
		Address address = new Address();
		address.setPno(data[0]);
		address.setStreet(data[1]);
		address.setCity(data[2]);
		address.setState(data[3]);
		
		// To set the injecting values call superclass setMethod
		super.setValue(address);
	}
}