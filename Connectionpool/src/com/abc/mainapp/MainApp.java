package com.abc.mainapp;

import java.sql.Connection;





import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.mysql.cj.jdbc.MysqlDataSource;

public class MainApp {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;

	public static void main(String[] args) {

		MysqlDataSource dataSource;

		try {

			// Step1. Create the DATASOURCE object
			dataSource = new MysqlDataSource();

			// Step2.Through setter inject URL,user,password information

			dataSource.setURL("jdbc:mysql://localhost:3306/springjdbc");
			dataSource.setUser("root");
			dataSource.setPassword("root123");

			connection = dataSource.getConnection();

			if (connection != null) {
				System.out.println("Connection got established to :" + dataSource.getUrl() + "\nWith userName as :"
						+ dataSource.getUser() + " \nWith password as :" + dataSource.getPassword());

				System.out.println();
				statement = connection.createStatement();
				resultSet = statement.executeQuery("select * from `student`");
				System.out.println("SID \t SNAME \t SADDRESS ");
				while (resultSet.next()) {

					System.out.println(resultSet.getString("sid") + "\t" + resultSet.getString("sname") + "\t"
							+ resultSet.getString("saddress"));

				}
			} else {
				System.out.println("Connection failed");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					resultSet.close(); 
					statement.close();
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
