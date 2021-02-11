package com.abc.mainapp;

import java.beans.BeanInfo;


import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

import org.springframework.beans.BeanInfoFactory;
import org.springframework.beans.ExtendedBeanInfoFactory;

import com.abc.beans.Employee;

public class MainApp {

	public static void main(String[] args) {

		try {

			BeanInfoFactory factory = new ExtendedBeanInfoFactory();

			BeanInfo beanInfo = factory.getBeanInfo(Employee.class);

			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {

				System.out.println(propertyDescriptor);
			}
			System.out.println();

			for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
				System.out.println("Property Name is      : " + propertyDescriptor.getName());
				System.out.println("Property Type is      : " + propertyDescriptor.getPropertyType());
				System.out.println("Read Method  is       : " + propertyDescriptor.getReadMethod());
				System.out.println("Write Method is       : " + propertyDescriptor.getWriteMethod());
				System.out.println("------------------------------------------------------------------");
			}

			System.out.println();
			MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
			for (MethodDescriptor methodDescriptor : methodDescriptors) {
				System.out.println(methodDescriptor);

			}
			System.out.println();
			for (MethodDescriptor methodDescriptor : methodDescriptors) {
				System.out.println("Method name is :" + methodDescriptor.getName());
				System.out.println("Return Type is :" + methodDescriptor.getMethod().getReturnType());
				System.out.println("-------------------------------------------------------------");
			}

		} catch (IntrospectionException e) {
			e.printStackTrace();
		}

	}

}
