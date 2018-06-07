package edu.mum.cs401mpp.libraryproject.entity;

import java.util.Collection;

public class BorrowRule {

	private long id;

	private String description;

	private int limitDays;

	private Collection<Book> book;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLimitDays() {
		return limitDays;
	}

	public void setLimitDays(int limitDays) {
		this.limitDays = limitDays;
	}

	public Collection<Book> getBook() {
		return book;
	}

	public void setBook(Collection<Book> book) {
		this.book = book;
	}
	
	

}
