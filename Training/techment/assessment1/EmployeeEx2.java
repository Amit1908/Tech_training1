package com.techment.assessment1;

public class EmployeeEx2 {
	
	String firstName;
	String lastName;
	
	

	public EmployeeEx2(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName =  lastName;
	}

	


	@Override
	public String toString() {
		return "EmployeeEx2 [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public void display()
	{
		System.out.println("Enter the first name :" + firstName);
		System.out.println("Enter the last name :" + lastName);
		
	}



	public static void main(String[] args) {
		
			EmployeeEx2 employee1 = new EmployeeEx2("Amit","Sinha");
			EmployeeEx2 employee2 = new EmployeeEx2("Prerana","Sahu");
			EmployeeEx2 employee3 = new EmployeeEx2("Utkarsh","Shrivastav");
			EmployeeEx2 employee4 = new EmployeeEx2("Arohi","Sharma");
			EmployeeEx2 employee5 = new EmployeeEx2("Aniket","Dubey");
			employee1.display();
			employee2.display();
			employee3.display();
			employee4.display();
			employee5.display();
			
	}

}
