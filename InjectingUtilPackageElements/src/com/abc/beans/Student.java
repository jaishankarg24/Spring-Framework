package com.abc.beans;

import java.util.List;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private String sid;
	private String sname;

	private Address address;

	private List<String> squal;

	private Set<String> courses;

	private Map<String, String> course_and_trainer;

	private Properties course_and_cost;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSqual() {
		return squal;
	}

	public void setSqual(List<String> squal) {
		this.squal = squal;
	}

	public Set<String> getCourses() {
		return courses;
	}

	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}

	public Map<String, String> getCourse_and_trainer() {
		return course_and_trainer;
	}

	public void setCourse_and_trainer(Map<String, String> course_and_trainer) {
		this.course_and_trainer = course_and_trainer;
	}

	public Properties getCourse_and_cost() {
		return course_and_cost;
	}

	public void setCourse_and_cost(Properties course_and_cost) {
		this.course_and_cost = course_and_cost;
	}

	public void displayDetails() {

		System.out.println("Student details are ");

		System.out.println("Student id is                                  :" + sid);
		System.out.println("Student name is                                :" + sname);

		System.out.println("The address details are                        :" + address);
		System.out.println("The student Qualification is                   :" + squal);
		System.out.println("The Courses offered are                        :" + courses);
		System.out.println("The course and trainer names are               :" + course_and_trainer);
		System.out.println("The course and cost is                         :" + course_and_cost);

	}

}
