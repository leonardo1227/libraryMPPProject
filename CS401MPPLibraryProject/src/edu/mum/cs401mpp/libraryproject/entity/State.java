package cs401project.entities;

import java.util.Collection;

public class State {

	private long id;

	private String name;

	private String abreviation;

	private Collection<City> city;

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

	public Collection<City> getCity() {
		return city;
	}

	public void setCity(Collection<City> city) {
		this.city = city;
	}

}
