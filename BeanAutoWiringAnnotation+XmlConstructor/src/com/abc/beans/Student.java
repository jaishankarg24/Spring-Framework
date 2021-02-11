package com.abc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private String sid;
	private String sname;
	private String sadress;

	// Injecting a course object into student object
	private Course course;
	
	@Autowired()
	public Student(String sid, String sname, String sadress, @Qualifier("advance_java")Course course) {
		this.sid = sid;
		this.sname = sname;
		this.sadress = sadress;
		this.course = course;
	}

	public void dispalyDetails() {
		System.out.println("Student details are shown below");
		System.out.println("Student ID is                    :" + sid);
		System.out.println("Student Name is                  :" + sname);
		System.out.println("Student Address is               :" + sadress);
		System.out.println("-------------------------------------------------------");
		System.out.println("Course details are :" + course);
	}

}
