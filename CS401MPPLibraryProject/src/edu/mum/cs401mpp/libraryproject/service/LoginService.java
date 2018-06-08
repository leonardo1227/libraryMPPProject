package edu.mum.cs401mpp.libraryproject.service;

import edu.mum.cs401mpp.libraryproject.entity.Staff;

public class LoginService {

	public static Staff checkUsernameandPassword(String uname, String pword) {
		return  AuthenticationService.checkAuthentication(uname, pword);
	}
	
}
