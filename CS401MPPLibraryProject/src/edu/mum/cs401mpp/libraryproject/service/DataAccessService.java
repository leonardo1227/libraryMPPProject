package edu.mum.cs401mpp.libraryproject.service;

import java.util.ArrayList;
import java.util.List;

import edu.mum.cs401mpp.libraryproject.entity.AuthorizationLevel;
import edu.mum.cs401mpp.libraryproject.entity.Person;
import edu.mum.cs401mpp.libraryproject.entity.Stuff;

public class DataAccessService {
	
	static List<Stuff> listOfStuff = new ArrayList<>();
	
	public static void simulateData() {
		
		System.out.println("Init authorization levels ...");
		AuthorizationLevel adminAuthLevel = new AuthorizationLevel();
		adminAuthLevel.setId(1);
		adminAuthLevel.setDescription("ADMIN");
		AuthorizationLevel librarianAuthLevel = new AuthorizationLevel();
		librarianAuthLevel.setId(2);
		librarianAuthLevel.setDescription("LIBRARIAN");
		
		System.out.println("Init stuff ...");
		Person personOne  = new Person();
		personOne.setId(1);
		personOne.setFirstName("Jeff");
		personOne.setLastName("Clinton");
		Person personTwo  = new Person();
		personTwo.setId(2);
		personTwo.setFirstName("Bell");
		personTwo.setLastName("Ragi");
		Stuff admin = new Stuff();
		admin.setId(1);
		admin.setAuthorizationLevel(adminAuthLevel);
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setPerson(personOne);
		Stuff librarian = new Stuff();
		librarian.setId(2);
		librarian.setAuthorizationLevel(librarianAuthLevel);
		librarian.setUsername("librarian");
		librarian.setPassword("librarian");
		librarian.setPerson(personTwo);
		
		listOfStuff.add(admin);
		listOfStuff.add(librarian);
		
	}
	
	AuthorizationLevel adminAuthLevel = new AuthorizationLevel();
	
	public static List<Stuff> getStaff() {
		return listOfStuff;
	}
	
}
