package edu.mum.cs401mpp.libraryproject.entity;
import java.util.Collection;

public class City {

	private long id;

	private String name;

	private State state;

	private Collection<LibraryMember> libraryMember;

	private Collection<Author> author;

	private Collection<Adress> adress;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Collection<LibraryMember> getLibraryMember() {
		return libraryMember;
	}

	public void setLibraryMember(Collection<LibraryMember> libraryMember) {
		this.libraryMember = libraryMember;
	}

	public Collection<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Collection<Author> author) {
		this.author = author;
	}

	public Collection<Adress> getAdress() {
		return adress;
	}

	public void setAdress(Collection<Adress> adress) {
		this.adress = adress;
	}
	
	

}
