package com.techment.day10.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		LocalDate birthDate = LocalDate.of(2000,11, 30);
		System.out.println(birthDate);
		
		System.out.println(date.isAfter(birthDate));
	}

}
