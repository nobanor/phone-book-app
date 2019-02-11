package com.claim;



public class Address {
	private String streetName;
	private String city;
	private String state;
	private int zipCode;
	

	public Address()
	{
		
	}
	
	public Address ( String streetName, String city, String state, int zipCode)
	{
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}


	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "\n"  + "Street: "+ streetName
				+ "\n" + "City: "+ city + " " 
				+" | State: "+ state + " " 
				+ " | Zipcode: "+zipCode;
	}
	
	
	
	
	
	
	
	
	
}
