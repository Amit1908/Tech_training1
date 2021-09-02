package com.techment.day6.customException;

class LateException extends Exception
{
	public LateException(String msg)
	{
		super(msg);
	}
}
class Student
{
	void login(int time) throws LateException
	{
		if(time>9)
			throw new LateException("You are absent");
		else
			System.out.println("present");
	}
}
public class CustomCheckedException {

	public static void main(String[] args) {
		
		Student student = new Student();
		try
		{
			student.login(10);
		}
		catch(LateException e)
		{
			System.out.println("u are present");
		}
		

	}

}
