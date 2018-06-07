package edu.mum.cs401mpp.libraryproject.service;

import edu.mum.cs401mpp.libraryproject.entity.Stuff;

public class LoginService {

	public static Stuff checkUsernameandPassword(String uname, String pword) {
		return  AuthenticationService.checkAuthentication(uname, pword);
	}
	
}
