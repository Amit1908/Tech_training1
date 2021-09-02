package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		try{
			//Class.forName("com.techment.day10.jdbc");
			
			//step 1  load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded");
			
			//step 2  create the connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","root");
			
			System.out.println("Connected");
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, 90);
			ps.setString(2, "Rahul");
			ps.setInt(3, 24000);
			
			ps.execute();
			System.out.println("inserted");
			
		}
		catch (Exception e)
		{
			System.out.println(e);
			
		}

	}

}
