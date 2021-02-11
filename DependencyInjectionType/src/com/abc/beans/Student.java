package com.abc.beans;

public class Student {

	@SuppressWarnings("unused")
	private Branch branch;

	public Student(Branch branch) {
		this.branch = branch;
	}

	public String getStudentName() {
		return "SACHIN";
	}

}
