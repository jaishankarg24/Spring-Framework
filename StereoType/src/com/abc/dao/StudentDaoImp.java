package com.abc.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abc.dto.Student;
import com.mysql.cj.jdbc.MysqlDataSource;

@Repository("studentDao")
public class StudentDaoImp implements StudentDao {

	@Autowired(required = true)
	private MysqlDataSource dataSource;

	String status = "";

	@Override
	public String save(String sid, String sname, String saddress) {
		PreparedStatement prepareStatement = null;

		try {
			Connection connection = dataSource.getConnection();

			String sqlSelectQuery = "select * from `student` where `sid`=?";
			prepareStatement = connection.prepareStatement(sqlSelectQuery);

			prepareStatement.setString(1, sid);

			ResultSet resultSet = prepareStatement.executeQuery();

			if (resultSet.next()) {
				status = "Already Existed";

			} else {
				String sqlInsertQuery = "insert into `student`(`sid`,`sname`,`saddress`) values(?,?,?)";
				prepareStatement = connection.prepareStatement(sqlInsertQuery);
				prepareStatement.setString(1, sid);
				prepareStatement.setString(2, sname);
				prepareStatement.setString(3, saddress);

				prepareStatement.executeUpdate();
				status = "success";

			}

		} catch (SQLException e) {
			status = "failure";
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public String update(String sid, String age, String address) {
		return null;
	}

	@Override
	public Student findById(String sid) {
		return null;
	}

	@Override
	public String delete(String sid) {
		return null;
	}

}
