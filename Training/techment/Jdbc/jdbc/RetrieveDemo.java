package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetrieveDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to fetch");
		int id = sc.nextInt();
		try
		{
			Connection con = ConnectionsDetail.getConnected();
			
			PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ " "+rs.getInt(2)+ " "+rs.getInt(3));
				
			}
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
