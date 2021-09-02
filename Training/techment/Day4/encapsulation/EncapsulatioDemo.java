package com.techment.Day4.encapsulation;


class Employee
{
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
}
public class EncapsulatioDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(1);
		System.out.println(emp.getId());
		
	}

}
