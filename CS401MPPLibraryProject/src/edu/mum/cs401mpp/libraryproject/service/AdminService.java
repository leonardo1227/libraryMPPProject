package edu.mum.cs401mpp.libraryproject.service;

import java.util.Date;
import java.util.Scanner;

import edu.mum.cs401mpp.libraryproject.entity.Adress;
import edu.mum.cs401mpp.libraryproject.entity.City;
import edu.mum.cs401mpp.libraryproject.entity.Contact;
import edu.mum.cs401mpp.libraryproject.entity.LibraryMember;
import edu.mum.cs401mpp.libraryproject.entity.Person;
import edu.mum.cs401mpp.libraryproject.entity.State;
import edu.mum.cs401mpp.libraryproject.entity.Stuff;

public class AdminService {
	
	public static void addNewMember(Stuff s) {
		
		if(s.getAuthorizationLevel().getDescription().equalsIgnoreCase("ADMIN")) {
			
			System.out.println("::::: Adding new Library Member ::::");
			
			LibraryMember libraryMemeber = new LibraryMember();
			
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the member ID: ");
			String memberID = scan.next();
			
			System.out.println("Enter member fisrt name: ");
			String memberFirstName = scan.next();
			
			System.out.println("Enter member last name: ");
			String memberLastName = scan.next();
			
			System.out.println("Enter the State: ");
			String memberState = scan.next();
			
			System.out.println("Enter the City: ");
			String memberCity = scan.next();
			
			System.out.println("Enter the zip: ");
			String memberZip = scan.next();
			
			System.out.println("Enter the phone number: ");
			String memberPhoneNumber = scan.next();
			
			State state = new State();
			state.setName(memberState);
			
			City city = new City();
			city.setName(memberCity);
			
			Adress address = new Adress();
			address.setCity(city);
			address.setZipCode(memberZip);
			
			Contact contact = new Contact();
			contact.setPhoneNumber(memberPhoneNumber);
			
			Person person = new Person();
			person.setId(Long.parseLong(memberID));
			person.setFirstName(memberFirstName);
			person.setLastName(memberLastName);
			person.setAdress(address);
			
			libraryMemeber.setPerson(person);
			libraryMemeber.setId(GenerateLibraryMemberID());
			
			DataAccessService.persistNewMember(libraryMemeber);
			
		}
		
		
	}
	
	public static void addNewCopy() {
		AddBookCopy.addBookCopy();
	}
	
	public static long GenerateLibraryMemberID() {
		return (long) (new Date().getTime()/1000);
	}
}
