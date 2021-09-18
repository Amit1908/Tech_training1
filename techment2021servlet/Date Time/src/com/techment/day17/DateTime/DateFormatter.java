package com.techment.day17.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter dtfl = DateTimeFormatter.ofPattern("yyyy MM dd");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy MMM dd");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MMM dd");
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MMM dd E");
		DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MMM dd EEEE");

		
		System.out.println(today.format(dtfl));
		System.out.println(today.format(dtf2));
		System.out.println(today.format(dtf3));
		System.out.println(today.format(dtf4));
		System.out.println(today.format(dtf5));
		System.out.println(today.format(dtf6));
		
	}

}
