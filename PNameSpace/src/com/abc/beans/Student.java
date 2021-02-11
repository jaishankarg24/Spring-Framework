package com.abc.beans;

public class Student {

	private String sname;
	private String sid;
	private String saddress;

	//Injecting the course object into Student Object
	private Course course;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	//User Defined method to display the details of student,course
	public void displayDetails() {
		System.out.println("Student details are :");
		System.out.println("Student Name is                  :" + sname);
		System.out.println("Student id is                    :" + sid);
		System.out.println("Student address is               :" + saddress);
		System.out.println("---------------------------------------------------------");
		System.out.println("Course Details are ");
		System.out.println("Course id is                     :" + course.getCid());
		System.out.println("Course Name is                   :" + course.getCname());
		System.out.println("Course Cost is                   :" + course.getCost());

	}

}
