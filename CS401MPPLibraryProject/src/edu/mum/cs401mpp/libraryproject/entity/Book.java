package edu.mum.cs401mpp.libraryproject.entity;

import java.util.Collection;

public class Book {

	private long id;

	private String title;

	private String iSBNNumber;

	private BorrowRule borrowRule;

	private Collection<BookCopy> bookCopy;

	private Collection<BookAuthor> bookAuthor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getiSBNNumber() {
		return iSBNNumber;
	}

	public void setiSBNNumber(String iSBNNumber) {
		this.iSBNNumber = iSBNNumber;
	}

	public BorrowRule getBorrowRule() {
		return borrowRule;
	}

	public void setBorrowRule(BorrowRule borrowRule) {
		this.borrowRule = borrowRule;
	}

	public Collection<BookCopy> getBookCopy() {
		return bookCopy;
	}

	public void setBookCopy(Collection<BookCopy> bookCopy) {
		this.bookCopy = bookCopy;
	}

	public Collection<BookAuthor> getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(Collection<BookAuthor> bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	

}
