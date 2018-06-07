package edu.mum.cs401mpp.libraryproject.service;

import edu.mum.cs401mpp.libraryproject.entity.Stuff;

public class LoginService {

	public static void checkUsernameandPassword(String uname, String pword) {
		Stuff temp = AuthenticationService.checkAuthentication(uname, pword);
		
		//checking role type
		if(temp.getAuthorizationLevel().getDescription().equalsIgnoreCase("Librarian"))
			//checkoutbook option
		else if
			
		
		
		
	}
	
}
