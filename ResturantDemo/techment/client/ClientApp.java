package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.techment.resturant.DataBaseService;

public class ClientApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		
		DataBaseService resturant = (DataBaseService) context.getBean("resturant");
		resturant.details();

	}

}
