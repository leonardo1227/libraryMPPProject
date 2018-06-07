package cs401project.entities;

import java.util.Collection;

public class CheckOutRecord {

	private long id;

	private LibraryMember libraryMember;

	private Collection<CheckOutRecordBook> checkOutRecordBook;

	private Collection<CheckOutRecordFine> checkOutRecordFine;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LibraryMember getLibraryMember() {
		return libraryMember;
	}

	public void setLibraryMember(LibraryMember libraryMember) {
		this.libraryMember = libraryMember;
	}

	public Collection<CheckOutRecordBook> getCheckOutRecordBook() {
		return checkOutRecordBook;
	}

	public void setCheckOutRecordBook(Collection<CheckOutRecordBook> checkOutRecordBook) {
		this.checkOutRecordBook = checkOutRecordBook;
	}

	public Collection<CheckOutRecordFine> getCheckOutRecordFine() {
		return checkOutRecordFine;
	}

	public void setCheckOutRecordFine(Collection<CheckOutRecordFine> checkOutRecordFine) {
		this.checkOutRecordFine = checkOutRecordFine;
	}

}
