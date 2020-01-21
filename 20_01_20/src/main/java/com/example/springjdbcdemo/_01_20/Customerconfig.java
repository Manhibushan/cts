package com.example.springjdbcdemo._01_20;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.example.springjdbcdemo._01_20")

public class Customerconfig {
	@Bean
	public DataSource datasource()
	{
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/hr","root","welcome");
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource datasource)
	
	{
		return new JdbcTemplate(datasource());
	}
}
