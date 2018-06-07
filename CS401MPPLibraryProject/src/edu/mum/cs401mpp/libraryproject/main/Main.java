package edu.mum.cs401mpp.libraryproject.main;

import java.util.Scanner;

import edu.mum.cs401mpp.libraryproject.entity.Stuff;
import edu.mum.cs401mpp.libraryproject.service.LoginService;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DataAccessService.simulateData();
		
		//mock login
		System.out.println("Enter username");
		String uname = scan.next();
		System.out.println("Enter password");
		String pword = scan.next();
		Stuff s = LoginService.checkUsernameandPassword(uname, pword);
		if(s != null){
			String authlevel = s.getAuthorizationLevel().getDescription();
			
			if(authlevel.equalsIgnoreCase("Librarian")) {
				//LibrarianService.checkoutBook();
			}else if(authlevel.equalsIgnoreCase("Admin")){
				boolean looper = true;
				while(looper){
				System.out.println("Type 1 to add new member or 2 to add new book or 0 to stop");
				int i = scan.nextInt();
				
				if(i == 1){
					//AdminService.addnewMember();
				}else if(i==2){
					//AdminService.addnewCopy();
				}else if(i==0)
					looper = false;
				else
					System.out.println("Invalid input");
				}
			}else if(authlevel.equalsIgnoreCase("Both")){
				boolean looper = true;
				while(looper){
				System.out.println("Type 1 to add new member, 2 to add new book, 3 add member, or 0 to stop");
				int i = scan.nextInt();
				
				if(i == 1){
					//AdminService.addnewMember();
				}else if(i==2){
					//AdminService.addnewCopy();
				}else if(i==3){
					//LibraryService.checkoutBook();
				}else if(i==0)
					looper = false;
				else
					System.out.println("Invalid input");
				}
				
			}
			
		}
		
		scan.close();
		

	}

}
