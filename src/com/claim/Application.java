/*
 *Thursday January 31st 2019
 **/
package com.claim;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		
		
		ArrayList<Person> people = new ArrayList<>();
	
		int option = 0;
		
		do {
				System.out.println("1. Enter person details");
				System.out.println("2. Search by First Name");
				System.out.println("3. Search by Last Name");
				System.out.println("4. Search by Full Name");
				System.out.println("5. Search by Telephone Number");
				System.out.println("6. Search by City or State");
				System.out.println("7. Update Record");
				System.out.println("8. Delete Record");
				System.out.println("9. Show all records");
				System.out.println("0. Exit");

		option = sc.nextInt();
					
		switch (option) {
		case 1:
			//Write the code to enter new person details
			Person p = new Person();
			//Prompt user to enter name
			System.out.println("Enter First Name");
			String fname = sc1.nextLine();
			p.setFirstName(fname);
			
			System.out.println("Enter Last Name");
			String lname = sc1.nextLine();
			p.setLastName(lname);
			
			//Prompt user to enter phone number
			System.out.println("Enter a Phone Number");
			long pnumber = sc.nextLong();
			p.setPhoneNumber(pnumber);
			
			//Prompt user to enter address
			System.out.println("Please enter you addres");
			System.out.println("Street name: ");
			String streetName = sc1.nextLine();
			
			
			System.out.println("City: ");
			String cityName = sc1.nextLine();
			
			System.out.println("State: ");
			String stateName = sc1.nextLine();
			
			System.out.println("Zipcode");
			int zipcode = sc.nextInt();
		
			//Set details for address
			Address address=new  Address( streetName, cityName, stateName, zipcode);
			p.setAddress(address);
			//set details for this objects
			people.add(p);
			System.out.println("Person added!");
			
			
			break;
			
			
		case 2:
			//Search for a person by first name
			System.out.println("Enter a first name you want to search for: ");
			String name = sc1.nextLine();
			
			
			for (Person person : people) {
				if (person.getFirstName().equals(name))
				{
					System.out.println(person);
				}
			}
			break;
		
		case 3:
			//Search for a person by last name
			System.out.println("Enter a last name you want to search for");
			name = sc1.nextLine();
			
			for (Person person : people) {
				if (person.getLastName().equals(name))
				{
					System.out.println(person);
				}
			}
		case 4:
			//Search by full name
			System.out.println("Enter a first name and last name you want to search for");
			String fullname = sc.nextLine();
			
			for (Person person : people){
				String personName = person.getFirstName()+" "+person.getLastName();
				if (personName.equals(fullname)) 
					{
						System.out.println(person);
					}
			}
			break;
		case 5:
			//Search by phone number
			System.out.println("Enter a telephone number you want to search for");
			long number = sc.nextLong();
			
			for (Person person : people) {
				if (person.getPhoneNumber()==(number))
				{
					System.out.println(person);
				}
			}
			break;
		case 6:
			//Search by city or state
			System.out.println("Enter a city or state you want to search for");
			String cityOrState = sc.nextLine();
			for (Person person : people) {
				if (person.getAddress().getCity().equals(cityOrState) || (person.getAddress().getState().equals(cityOrState))) 
				{
					System.out.println(person);
				}
			}
			
			break;
		case 7:
			//Update record
			System.out.println("Enter a phone number of person you want to update");
			number = sc.nextLong();
			
			for (Person person : people) {
				if (person.getPhoneNumber()==(number))
				{
					System.out.println(person);
					System.out.println("Enter First Name");
					fname = sc1.nextLine();
					person.setFirstName(fname);
					System.out.println("Name Updated!");
					
				}
			}
			break;
		case 8:
			//Delete record
			System.out.println("Enter a phone number you want to delete");
			number = sc.nextLong();
			
			for (Person person : people) {
				if (person.getPhoneNumber()==(number))
				{
					System.out.println(people);
				}
				people.remove(person);
				System.out.println("Record Deleted!");
				break;
			}
			break;
		case 9:
			//Show all records
			
			System.out.println("Phonebook List");
			
			for (Person person : people){
				System.out.println(person + "\n");
				
			}
			break;
		
		case 0:
			System.out.println("Program ends");
			break;
		default :
			
			break;	
		
		}
		
		} while (option != 0);
		
	}	

}
