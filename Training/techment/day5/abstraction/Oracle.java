package com.techment.day5.abstraction;

public class Oracle implements JdbcConnection {

	@Override
	public void connect() {
		System.out.println("I am Connecting to Oracle Database");

	}

}
