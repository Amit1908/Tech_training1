package com.techment.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MySqlDemo {

	
		
		JdbcTemplate jdbcTemplate;
		
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
		{
			this.jdbcTemplate=jdbcTemplate;
			
		}
		public void insertData()
		{
			jdbcTemplate.execute("insert into employee values(200,'amit',56000)");
			System.out.println("Data is inserted");
			
		}
		DriverManagerDataSource ds;

	
}
