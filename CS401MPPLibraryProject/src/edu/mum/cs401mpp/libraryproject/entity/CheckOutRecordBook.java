package cs401project.entities;

import java.time.LocalDate;

public class CheckOutRecordBook {

	private LocalDate checkOutDate;

	private LocalDate dueToDate;

	private CheckOutRecord checkOutRecord;

	private BookCopy bookCopy;

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public LocalDate getDueToDate() {
		return dueToDate;
	}

	public void setDueToDate(LocalDate dueToDate) {
		this.dueToDate = dueToDate;
	}

	public CheckOutRecord getCheckOutRecord() {
		return checkOutRecord;
	}

	public void setCheckOutRecord(CheckOutRecord checkOutRecord) {
		this.checkOutRecord = checkOutRecord;
	}

	public BookCopy getBookCopy() {
		return bookCopy;
	}

	public void setBookCopy(BookCopy bookCopy) {
		this.bookCopy = bookCopy;
	}
	
	

}
