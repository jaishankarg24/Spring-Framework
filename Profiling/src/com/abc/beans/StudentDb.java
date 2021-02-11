package com.abc.beans;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.abc.dto.Student;

public class StudentDb {
	private String driverClass;
	private String url;
	private String username;
	private String password;

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Student> findAll() {
		List<Student> students = new ArrayList<>();
		try {
			Class.forName(driverClass);
			
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from `student`");
			
			while (resultSet.next() == true) {
				
				Student student = new Student();
				student.setSno(resultSet.getInt("sno"));
				student.setSname(resultSet.getString("sname"));
				student.setSage(resultSet.getInt("sage"));
				student.setSaddress(resultSet.getString("saddress"));
				
				students.add(student);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return students;
	}
}