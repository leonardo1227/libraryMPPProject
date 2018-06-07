package edu.mum.cs401mpp.libraryproject.service;

import java.util.List;

import edu.mum.cs401mpp.libraryproject.entity.Stuff;

public class AuthenticationService {
	
	public static Stuff checkAuthentication(String username, String passkey){
		//get the data from dataservice
		List<Stuff> stafflist = DataAccessService.getStaff();
		
		//loop through data and if id and passkey are in data return true
		for(Stuff s: stafflist)
			if(s.getUsername().equals(username) && s.getPassword().equals(passkey))
				return s;
		
		System.out.println("user not found");
		return null;
		
	}
	
}
