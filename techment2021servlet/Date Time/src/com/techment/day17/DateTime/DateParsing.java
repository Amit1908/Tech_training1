package com.techment.day17.DateTime;

import java.time.LocalDate;

public class DateParsing {

	public static void main(String[] args) {
		
		//String dob = "16/08/1996";
		String joiningDate = "2020-2-22";
		
		//System.out.println("date of birth :" +dob);
		System.out.println("joining date"+ joiningDate);
		
		LocalDate joiningDateAfterParse = LocalDate.parse(joiningDate);
		System.out.println(joiningDateAfterParse);
		
		System.out.println(joiningDateAfterParse.getYear());
		System.out.println(joiningDateAfterParse.getMonth());
		
		System.out.println("==========Sample=============");
		
		LocalDate today = LocalDate.now();
		LocalDate joiningdate = LocalDate.parse(joiningDate);
		LocalDate birthdate = LocalDate.of(1996, 8, 16);
	}

}
