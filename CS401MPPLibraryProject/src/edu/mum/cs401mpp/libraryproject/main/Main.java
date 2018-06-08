package edu.mum.cs401mpp.libraryproject.main;

import java.util.Scanner;

import edu.mum.cs401mpp.libraryproject.entity.Stuff;
import edu.mum.cs401mpp.libraryproject.service.AdminService;
import edu.mum.cs401mpp.libraryproject.service.DataAccessService;
import edu.mum.cs401mpp.libraryproject.service.LoginService;

public class Main {
	
	public static void main(String[] args) {
		
		DataAccessService.simulateData();
		
		Scanner scan = new Scanner(System.in);
		
		//mock login
		Stuff s = null;
		
		/*
		 * Admin Account : admin/admin
		 * Librarian Avvount: librarian/librarian
		 */
		
		
		do{
			System.out.println("Enter your username:");
			String uname = scan.next();
			System.out.println("Enter your password:");
			String pword = scan.next();
			s = LoginService.checkUsernameandPassword(uname, pword);
		}while(s == null);
		

		String authlevel = s.getAuthorizationLevel().getDescription();
	
		if(authlevel.equalsIgnoreCase("Librarian")) {
			//LibrarianService.checkoutBook();
		}else if(authlevel.equalsIgnoreCase("Admin")){
			boolean looper = true;
			
			while(looper) {
				System.out.println("Type 1 to add a new member");
				System.out.println("Type 2 to add a new book");
				System.out.println("Type 0 to exit");
				System.out.print("Answer: ");
				int i = scan.nextInt();
				if(i == 1){
					AdminService.addNewMember(s);
				}else if(i == 2){
					AdminService.addNewCopy();
				}else if(i == 0)
					looper = false;
				else
					System.out.println("Invalid input");	
			}
		
		}else 
			if(authlevel.equalsIgnoreCase("Both")) {
				boolean looper = true;
				while(looper){
					System.out.println("Type 1 to add a new member");
					System.out.println("Type 2 to add a new book");
					System.out.println("Type 0 to exit");
					System.out.print("Answer: ");
					int i = scan.nextInt();
					if(i == 1){
						AdminService.addNewMember(s);
					}else if(i==2){
						AdminService.addNewCopy();
					}else if(i==3){
						//LibraryService.checkoutBook();
					}else if(i==0)
						looper = false;
					else
						System.out.println("Invalid input");
				}
		}
		
		scan.close();
		

	}

}
