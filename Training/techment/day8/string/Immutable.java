package com.techment.day8.string;

public class Immutable {

	public static void main(String[] args) {
		
		String courseName = "java";
		System.out.println("course name "+ courseName);
		
		courseName.concat("programming");
		
		System.out.println("after concat"+courseName);
		
		courseName = courseName.concat("pro");  //we can assign
		
		System.out.println(courseName);

	}

}
