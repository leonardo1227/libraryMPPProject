package edu.mum.cs401mpp.libraryproject.main;

import java.util.Scanner;

import edu.mum.cs401mpp.libraryproject.service.LoginService;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//mock login
		System.out.println("Enter username");
		String uname = scan.next();
		System.out.println("Enter password");
		String pword = scan.next();
		
		LoginService.checkUsernameandPassword(uname, pword);
		
		scan.close();
		

	}

}
