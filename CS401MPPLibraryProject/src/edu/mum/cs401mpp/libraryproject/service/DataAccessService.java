package edu.mum.cs401mpp.libraryproject.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.mum.cs401mpp.libraryproject.entity.AuthorizationLevel;
import edu.mum.cs401mpp.libraryproject.entity.City;
import edu.mum.cs401mpp.libraryproject.entity.LibraryMember;
import edu.mum.cs401mpp.libraryproject.entity.Person;
import edu.mum.cs401mpp.libraryproject.entity.Stuff;
import edu.mum.cs401mpp.libraryproject.entity.Book;
import edu.mum.cs401mpp.libraryproject.entity.BookCopy;
import edu.mum.cs401mpp.libraryproject.entity.BorrowRule;

public class DataAccessService {

	static List<Stuff> listOfStuff = new ArrayList<>();
	static List<LibraryMember> listOfLibraryMembes = new ArrayList<>();
	static List<Book> Books = new ArrayList<>();

	static HashMap<String, Book> books = new HashMap<>();

	static HashMap<String, HashMap<Integer, BookCopy>> bookCopy = new HashMap<>();
	static int bookCopyIdCounter = 0;

	public static void simulateData() {

		System.out.println("Init authorization levels ...");
		AuthorizationLevel adminAuthLevel = new AuthorizationLevel();
		adminAuthLevel.setId(1);
		adminAuthLevel.setDescription("ADMIN");
		AuthorizationLevel librarianAuthLevel = new AuthorizationLevel();
		librarianAuthLevel.setId(2);
		librarianAuthLevel.setDescription("LIBRARIAN");

		System.out.println("Init stuff ...");
		Person personOne = new Person();
		personOne.setId(1);
		personOne.setFirstName("Jeff");
		personOne.setLastName("Clinton");
		Person personTwo = new Person();
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

	public static List<LibraryMember> getLibaryMembers() {
		City city = new City();
		city.setName("Egypt");
		City city1 = new City();
		city1.setName("Brazil");
		City city2 = new City();
		city2.setName("morocco");
		City city3 = new City();
		city3.setName("morocco");
		City city4 = new City();
		city4.setName("morocco");
		LibraryMember librarymember = new LibraryMember();
		Person personOne = new Person();
		personOne.setId(1);
		personOne.setFirstName("Jeff");
		personOne.setLastName("Clinton");
		librarymember.setPerson(personOne);
		librarymember.setId(1);
		librarymember.setCity(city);
		listOfLibraryMembes.add(librarymember);

		LibraryMember librarymember1 = new LibraryMember();
		Person personTwo = new Person();
		personTwo.setId(2);
		personTwo.setFirstName("Bell");
		personTwo.setLastName("Ragi");
		librarymember1.setPerson(personTwo);
		librarymember1.setId(2);
		librarymember1.setCity(city1);
		listOfLibraryMembes.add(librarymember1);
		return listOfLibraryMembes;
	}

	public static List<Book> getBooks() {
		BorrowRule borrowRule = new BorrowRule();
		borrowRule.setLimitDays(7);
		BorrowRule borrowRule1 = new BorrowRule();
		borrowRule1.setLimitDays(21);
		List<BookCopy> lstbookcopy = new ArrayList<>();
		BookCopy BookCopy = new BookCopy();
		BookCopy.setAvailable(true);
		BookCopy.setId(1);
		BookCopy.setCopyNumber(1);
		lstbookcopy.add(BookCopy);

		Book Book1 = new Book();
		Book1.setId(1);
		Book1.setiSBNNumber("123");
		Book1.setTitle("MPP");
		Book1.setBorrowRule(borrowRule);
		Book1.setBookCopy(lstbookcopy);
		Books.add(Book1);

		List<BookCopy> lstbookcopy1 = new ArrayList<>();
		BookCopy BookCopy1 = new BookCopy();
		BookCopy1.setAvailable(false);
		BookCopy1.setId(2);
		BookCopy1.setCopyNumber(2);
		lstbookcopy1.add(BookCopy);
		Book Book2 = new Book();
		Book2.setId(2);
		Book2.setiSBNNumber("321");
		Book2.setTitle("Algorithms");
		Book2.setBorrowRule(borrowRule);
		Book2.setBookCopy(lstbookcopy1);
		Books.add(Book1);
		return Books;
	}

	public static void persistNewMember(LibraryMember libraryMember) {
		System.out.println(":::::: New library member has been created successfully! :::::: ");
		listOfLibraryMembes.add(libraryMember);
	}

	public static Book getBook(String isbn) {
		Book b = books.get(isbn);

		if (null == b)
			System.out.println(":::::: Book not found! :::::: ");

		return b;
	}

	public static void addBookCopy(String isbn, BookCopy bc) {
		bookCopy.get(isbn).put(bc.getCopyNumber(), bc);
	}
}
