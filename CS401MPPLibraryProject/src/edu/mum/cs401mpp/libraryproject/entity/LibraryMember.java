package cs401project.entities;

import java.util.Collection;

public class LibraryMember extends PersonRole {

	private long id;

	private City city;

	private Collection<CheckOutRecord> checkOutRecord;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Collection<CheckOutRecord> getCheckOutRecord() {
		return checkOutRecord;
	}

	public void setCheckOutRecord(Collection<CheckOutRecord> checkOutRecord) {
		this.checkOutRecord = checkOutRecord;
	}
	
	

}
