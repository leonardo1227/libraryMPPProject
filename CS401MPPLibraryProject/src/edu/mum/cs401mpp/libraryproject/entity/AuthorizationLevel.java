package edu.mum.cs401mpp.libraryproject.entity;

import java.util.Collection;

public class AuthorizationLevel {

	private long id;

	private String description;

	private Collection<Stuff> stuff;

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

	public Collection<Stuff> getStuff() {
		return stuff;
	}

	public void setStuff(Collection<Stuff> stuff) {
		this.stuff = stuff;
	}
	
	

}
