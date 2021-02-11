package com.abc.beans;

public class Branch {
	@SuppressWarnings("unused")
	private Student student;

	public Branch(Student student) {
		this.student = student;
	}

	public String getBranchName() {
		return "CSE";
	}

}
