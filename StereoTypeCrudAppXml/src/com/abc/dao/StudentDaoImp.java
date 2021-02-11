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
	public String update(String sid, String sname, String saddress) {
		PreparedStatement preparedStatement = null;
		try {
			Connection connection = dataSource.getConnection();
			String sqlUpdateQuery = "update `student` set `sname`=?,`saddress`=? where `sid`=?";
			preparedStatement = connection.prepareStatement(sqlUpdateQuery);

			preparedStatement.setString(1, sname);
			preparedStatement.setString(2, saddress);
			preparedStatement.setString(3, sid);

			preparedStatement.executeUpdate();
			status = "success";

		} catch (Exception e) {
			System.out.println("The cause of the exception is :" + e.getMessage());
			status = "failure";

		}
		return status;
	}

	@Override
	public Student findById(String sid) {
		PreparedStatement prepareStatement = null;
		Student student = null;
		try {
			Connection connection = dataSource.getConnection();
			String sqlSelectQuery = "select * from `student` where `sid`=?";
			prepareStatement = connection.prepareStatement(sqlSelectQuery);
			prepareStatement.setString(1, sid);

			ResultSet resultSet = prepareStatement.executeQuery();
			if (resultSet.next() == true) {
				// Record available for student corresponding to SID

				// Create the student object
				student = new Student();

				// set studentObject information through setter from resultSet object

				student.setSid(resultSet.getString("sid"));
				student.setSname(resultSet.getString("sname"));
				student.setSaddress(resultSet.getString("saddress"));

			} else {
				// Record does not exists for Correspond SID
				student = null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
	}

	@Override
	public String delete(String sid) {
		PreparedStatement preparedStatement;

		try {
			Connection connection = dataSource.getConnection();
			String sqlSelectQuery = "select * from `student` where `sid`=?";
			preparedStatement = connection.prepareStatement(sqlSelectQuery);
			preparedStatement.setString(1, sid);

			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next() == true) {
				// Records exists so delete the record corresponding to SID

				String sqlDeleteQuery = "delete from `student` where `sid`=?";
				preparedStatement = connection.prepareStatement(sqlDeleteQuery);
				preparedStatement.setString(1, sid);
				preparedStatement.executeUpdate();
				status = "success";

			} else {
				// Record does not exists
				status = "not found";
			}

		} catch (Exception e) {
			status = "failure";
		}
		return status;
	}

}
