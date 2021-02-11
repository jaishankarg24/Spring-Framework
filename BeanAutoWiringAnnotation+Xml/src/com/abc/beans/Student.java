package com.abc.beans;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private String sid;
	private String sname;
	private String sadress;

	// Injecting a course object into student object

	@Autowired(required = true)
	@Qualifier("advanced_java")
	private Course course;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadress() {
		return sadress;
	}

	public void setSadress(String sadress) {
		this.sadress = sadress;
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
