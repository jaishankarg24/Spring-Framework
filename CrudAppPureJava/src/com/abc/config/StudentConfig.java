package com.abc.config;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;

import com.abc.beans.Student;

@Configuration
public class StudentConfig {

	@Bean
	public Student student() {

		Student student = new Student();

		student.setSname("sachin");
		student.setSage("47");
		student.setSaddress("mumbai");

		return student;
	}

}
