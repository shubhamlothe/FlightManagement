package com.dto;

public class Flight {
	private int flightNo;
	private String source;
	private String destination;
	private String arrDate ;
	private String bookTime;
	private int totSeat;
	private int bookSeat;
	private float amount;
	
	public Flight() {
		
	}

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArrDate() {
		return arrDate;
	}

	public void setArrDate(String arrDate) {
		this.arrDate = arrDate;
	}

	public String getBookTime() {
		return bookTime;
	}

	public void setBookTime(String bookTime) {
		this.bookTime = bookTime;
	}

	public int getTotSeat() {
		return totSeat;
	}

	public void setTotSeat(int totSeat) {
		this.totSeat = totSeat;
	}

	public int getBookSeat() {
		return bookSeat;
	}

	public void setBookSeat(int bookSeat) {
		this.bookSeat = bookSeat;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", source=" + source + ", destination=" + destination + ", arrDate="
				+ arrDate + ", bookTime=" + bookTime + ", totSeat=" + totSeat + ", bookSeat=" + bookSeat + ", amount="
				+ amount + "]";
	}
	
}

	