package edu.mum.cs401mpp.libraryproject.entity;

import java.util.Collection;

public class Credential {

	private long id;

	private String description;

	private Collection<Author> author;

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

	public Collection<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Collection<Author> author) {
		this.author = author;
	}
	
	

}
