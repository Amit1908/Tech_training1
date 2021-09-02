package com.techment.day5.abstraction;

public class MySql implements JdbcConnection {

	@Override
	public void connect() {
		System.out.println("I am Connecting to MySql Database");

	}

}
