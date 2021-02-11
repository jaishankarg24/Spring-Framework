package com.abc.beans;

public class Student {

	private String sid;
	private String sname;
	private String sage;
	private String saddress;
	
	private Course course;

	public Student(String sid, String sname, String sage, String saddress, Course course) {
		
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.saddress = saddress;
		this.course = course;
	}

	public String getSaddress() {
		return saddress;
	}

	public String getSage() {
		return sage;
	}

	public String getSname() {
		return sname;
	}

	public String getSid() {
		return sid;
	}

	public Course getCourse() {
		return course;
	}
	
	public void display() {
		System.out.println("Student Information are :");
		System.out.println("Sid :"+sid);
		System.out.println("sname :"+sname);
		System.out.println("sage :"+sage);
		System.out.println("saddress :"+saddress);
		System.out.println(course);
	}
	
}
