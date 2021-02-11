package com.abc.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mysql.cj.jdbc.MysqlDataSource;

@Configuration
@ComponentScan("com.abc")
public class StudentConfig {
	
	@Bean
	public MysqlDataSource dataSource() {
		
		MysqlDataSource dataSource = new MysqlDataSource();
		
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUser("root");
		dataSource.setPassword("root123");
		return dataSource;
		
	}

}
