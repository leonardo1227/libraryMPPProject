package edu.mum.cs401mpp.libraryproject.entity;

import java.util.Collection;

public class Person {

	private long id;

	private String firstName;

	private String lastName;

	private Person person;

	private Collection<PersonRole> personRole;

	private Contact contact;

	private Adress adress;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Collection<PersonRole> getPersonRole() {
		return personRole;
	}

	public void setPersonRole(Collection<PersonRole> personRole) {
		this.personRole = personRole;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

}
