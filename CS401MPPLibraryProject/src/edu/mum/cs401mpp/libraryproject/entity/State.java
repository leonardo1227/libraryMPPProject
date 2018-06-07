package edu.mum.cs401mpp.libraryproject.entity;

import java.util.List;

public class State {
	private long id;
	private String name;
	private String abreviation;
	private List<City> City;
	public List<City> getCity() {
		return City;
	}
	public void setCity(List<City> city) {
		City = city;
	}
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
	public String getAbreviation() {
		return abreviation;
	}
	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}
}
