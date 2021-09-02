package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Oracle implements IDao {

	@Override
	public void dataBaseName() {
		
		System.out.println("Connecting to oracle database");

	}

}
