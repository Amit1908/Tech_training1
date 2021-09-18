package com.techment.debugging;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	String display()
	{
		String message = "hello";
		name = name.concat(message);
		return "id "+ id +" name "+ name;
	}
	
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Amit");
		String res = emp1.display();
		System.out.println(res);
		
		Employee emp2 = null;
		String res1 = emp2.display();

	}

}
