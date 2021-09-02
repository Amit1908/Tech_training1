package com.techment.day6.customException;

public class InSufficientFundException extends RuntimeException {

	String msg;


	public InSufficientFundException(String message) {
		super(message);
		
	}
	
}
