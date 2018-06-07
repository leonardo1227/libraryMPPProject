package edu.mum.cs401mpp.libraryproject.entity;

import java.util.Collection;

public class Author extends PersonRole {

	private long id;

	private String shortBio;

	private Author author;

	private City city;

	private Credential credential;

	private Collection<BookAuthor> bookAuthor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShortBio() {
		return shortBio;
	}

	public void setShortBio(String shortBio) {
		this.shortBio = shortBio;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Credential getCredential() {
		return credential;
	}

	public void setCredential(Credential credential) {
		this.credential = credential;
	}

	public Collection<BookAuthor> getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(Collection<BookAuthor> bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

}
