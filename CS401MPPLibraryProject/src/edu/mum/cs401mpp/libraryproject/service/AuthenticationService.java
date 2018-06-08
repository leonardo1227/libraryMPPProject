package edu.mum.cs401mpp.libraryproject.service;

import java.util.List;

import edu.mum.cs401mpp.libraryproject.entity.Staff;

public class AuthenticationService {
	
	public static Staff checkAuthentication(String username, String passkey){
		//get the data from dataservice
		List<Staff> stafflist = DataAccessService.getStaff();
		
		//loop through data and if id and passkey are in data return true
		for(Staff s: stafflist)
			if(s.getUsername().equals(username) && s.getPassword().equals(passkey))
				return s;
		
		System.out.println("user not found");
		return null;
		
	}
	
}
