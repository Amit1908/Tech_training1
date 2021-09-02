package com.techment.oops.assignment;


class Address
{
	private String Addressline;
	private String City;
	
	public Address(String addressline, String city) {
		super();
		setAddressline(addressline);
		setCity(city);
		//Addressline = addressline;
		//City = city;
	}
	public String getAddressline() {
		return Addressline;
	}
	public void setAddressline(String addressline) {
		Addressline = addressline;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public void getAddressDetails()
	{
		System.out.print(getAddressline() + " , "+getCity());
	}
	
}

class Customer
{
	private String customerName ;
	private Address residentialAddress ;
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	 
	public void getCustomerDetails () {
		System.out.println("Customer : "+customerName);
		System.out.println("Residential Address : " + residentialAddress.getAddressline() + ", "+ residentialAddress.getCity() );
	}
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	
	
}
public class AggregationandEncapsulation_Ex1 {

	public static void main(String[] args) {
		

		Address address = new Address("1st Main City Line ", "Banglore");
		Customer customer = new Customer("John", address);
		customer.getCustomerDetails();
	}

}
