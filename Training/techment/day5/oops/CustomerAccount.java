package com.techment.day5.oops;


class Customer
{
	int custId;
	String custName;
	Account account;
	public Customer(int custId, String custName, Account account) 
	{
		super();
		this.custId = custId;
		this.custName = custName;
		this.account = account;
	}
	
	void displayCustomerInfo()
	{
		System.out.println("Customer Id: " + custId);
		System.out.println("Customer Name: " + custName);
		System.out.println("Bank Name: " + account.bankName);
		System.out.println("Account No.: " + account.accNo );
		System.out.println("Account Type: " + account.accType );
		System.out.println("Account Balance: " + account.balance );
		System.out.println("Ifsc Code: " + account.ifsc );
		System.out.println("Branch: " + account.branch );
		
	}
}



class Account
{
	String bankName;
	int accNo;
	String accType;
	int balance;
	String ifsc;
	String branch;
	public Account(String bankName, int accNo, String accType, int balance, String ifsc, String branch) {
		super();
		this.bankName = bankName;
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
	
}
public class CustomerAccount {

	public static void main(String[] args) {
		
		Account acc = new Account("BOI",123456789,"Saving",20000,"BOT320","Bhilai");
		Customer cust = new Customer(101,"Ravi",acc);
		cust.displayCustomerInfo();
	}

}
