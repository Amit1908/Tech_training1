package com.techment.day17.DateTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthdate = LocalDate.of(1996, 8, 16);
		
		Period period = Period.between(today, birthdate);
		System.out.println(period.getYears()+"years "+period.getMonths()+"months "+period.getDays());

		System.out.println(birthdate.isBefore(today));
		
	}

}
