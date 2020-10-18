package com.dto;

public class Booking {
	private int bookId;
	private int flightNo;
	private String custName;
	private String custNo;
	private int bookSeat;
	public Booking() {
		
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public int getBookSeat() {
		return bookSeat;
	}
	public void setBookSeat(int bookSeat) {
		this.bookSeat = bookSeat;
	}
	
}
