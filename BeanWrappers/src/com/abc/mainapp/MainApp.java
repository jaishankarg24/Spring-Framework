package com.abc.mainapp;

import java.util.HashMap;


import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.abc.beans.Student;

public class MainApp {

	public static void main(String[] args) {

		BeanWrapper beanWrapper = new BeanWrapperImpl(Student.class);

		Map<String, String> map = new HashMap<>();
		map.put("sid", "IND24");
		map.put("sname", "Ganguly");
		map.put("saddress", "kolkatta");
		map.put("sage", "49");

		beanWrapper.setPropertyValues(map);

		Student student1 = (Student) beanWrapper.getWrappedInstance();
		System.out.println("Student1 values: "+student1);

		System.out.println();

		Student student2 = new Student();
		BeanUtils.copyProperties(student1, student2);

		System.out.println("Student2 values: "+student2);

	}
}
