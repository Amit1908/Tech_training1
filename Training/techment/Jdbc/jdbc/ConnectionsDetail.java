package com.techment.day10.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionsDetail {
	
	public static Connection getConnected() throws IOException  {
	
		try
		{
			Class.forName(ConnectionProperty.DRIVER_NAME);
			Connection con = DriverManager.getConnection(ConnectionProperty.URL, ConnectionProperty.USERNAME,ConnectionProperty.Password);
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

}
