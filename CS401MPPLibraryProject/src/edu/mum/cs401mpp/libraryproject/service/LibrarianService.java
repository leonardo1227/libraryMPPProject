package edu.mum.cs401mpp.libraryproject.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sun.accessibility.internal.resources.accessibility;

import edu.mum.cs401mpp.libraryproject.entity.Book;
import edu.mum.cs401mpp.libraryproject.entity.BookCopy;
import edu.mum.cs401mpp.libraryproject.entity.CheckOutRecord;
import edu.mum.cs401mpp.libraryproject.entity.CheckOutRecordBook;
import edu.mum.cs401mpp.libraryproject.entity.LibraryMember;

public class LibrarianService {

	public static String checkoutBookAvailability(String memberID, String iSBN) {
		boolean IsExist = false;
	
		LibraryMember LibraryMember = new LibraryMember();
		List<LibraryMember> lstlibrarymember = DataAccessService.getLibaryMembers();
		for (LibraryMember libraryMember : lstlibrarymember) {
			if (Long.toString(libraryMember.getId()).equals(memberID) ) {
				IsExist = true;
				LibraryMember = libraryMember;
			}
		}
		if (!IsExist) {
			return "Member is not Exist";
		}
		IsExist = false;
		List<BookCopy> foundedbook = new ArrayList<>();
		List<CheckOutRecordBook> lstcheckOutRecordBook = new ArrayList<>();
		List<Book> lstbokcopy = DataAccessService.getBooks();
		BookCopy bookCopy = new BookCopy();
		Book originalbook = new Book();
		for (Book book : lstbokcopy) {
			if (book.getiSBNNumber().equals(iSBN) ) {
				IsExist = true;
				foundedbook = (List<BookCopy>) book.getBookCopy();
				originalbook = book;
			}

		}
		if (!IsExist) {
			return "Book is not Exist";
		}
		IsExist = false;
		for (BookCopy foundedbookcopy : foundedbook) {
			if (foundedbookcopy.isAvailable()) {
				IsExist = true;
				bookCopy = foundedbookcopy;
				foundedbookcopy.setAvailable(false);
			}

		}
		if (!IsExist) {
			return "Book is not Available";
		}
		CheckOutRecordBook checkOutRecordBook = new CheckOutRecordBook();

		checkOutRecordBook.setBookCopy(bookCopy);
		checkOutRecordBook.setCheckOutDate(LocalDate.now());
		checkOutRecordBook.setDueToDate(LocalDate.now().plusDays(originalbook.getBorrowRule().getLimitDays()));

		CheckOutRecord checkoutrecord = new CheckOutRecord();
		checkoutrecord.setId(1);
		checkoutrecord.setLibraryMember(LibraryMember);
		lstcheckOutRecordBook.add(checkOutRecordBook);
		checkoutrecord.setCheckOutRecordBook(lstcheckOutRecordBook);

		return "Done successful";
	}

}
