package com.techment.day5.abstraction;

public class InterfaceDemoo {

	public static void main(String[] args) {
		JdbcConnection connection = new MySql();
		connection.connect();

	}

}
