package com.abc.beans;

public class Student {
	
	private String sid;
	private String sname;
	private int sage;
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
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void displayInfo() {
		System.out.println("The Student details are:");
		System.out.println("Name is :"+sname);
		System.out.println("Id is :"+sid);

		System.out.println("Age is :"+sage);
		System.out.println("The course details are :");
		System.out.println("----------------------------");
		System.out.println("cid is :"+course.getCid());
		System.out.println("cname is :"+course.getCname());

		System.out.println("cost is :"+course.getCost());


	}
	
}
