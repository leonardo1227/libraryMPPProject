package edu.mum.cs401mpp.libraryproject.service;

import java.util.Scanner;

import edu.mum.cs401mpp.libraryproject.entity.Book;
import edu.mum.cs401mpp.libraryproject.entity.BookCopy;

public class AddBookCopy {
	
	public static void addBookCopy() {
		//lookup book by ISBN
		
		//create new book copy
		
		//add new book copy to book collection and persist
		
		System.out.println("::::: Adding new book copy ::::");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the ISBN: ");
		String isbn = scan.next();
		
		Book b = DataAccessService.getBook(isbn);
		
		BookCopy bc = new BookCopy();
		bc.setId(++DataAccessService.bookCopyIdCounter);
		bc.setAvailable(true);
		bc.setBook(b);
//		bc.setCopyNumber(bc.getId());
		
		DataAccessService.addBookCopy(isbn, bc);
		
		System.out.println("BookCopy added. ID: " + bc.getId() );
	}

	public static void main(String[] args) {

	}

}
