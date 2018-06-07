package cs401project.entities;

import java.util.Collection;

public class BookCopy {

	private long id;

	private int copyNumber;

	private boolean available;

	private Book book;

	private Collection<CheckOutRecordBook> checkOutRecordBook;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCopyNumber() {
		return copyNumber;
	}

	public void setCopyNumber(int copyNumber) {
		this.copyNumber = copyNumber;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Collection<CheckOutRecordBook> getCheckOutRecordBook() {
		return checkOutRecordBook;
	}

	public void setCheckOutRecordBook(Collection<CheckOutRecordBook> checkOutRecordBook) {
		this.checkOutRecordBook = checkOutRecordBook;
	}
	
	

}
