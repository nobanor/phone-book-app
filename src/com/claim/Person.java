package com.claim;

public class Person {
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private Address address = new Address();
	
	
	public Person()
	{
		
	}
	
	public Person(String firstName, String lastName, long phoneNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return  "Name: " +firstName + " " + lastName
				+ "\n" + "Phone: "+  phoneNumber + " "+address;
	}
	
	
}

