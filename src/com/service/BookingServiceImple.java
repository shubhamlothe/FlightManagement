package com.service;

import java.util.ArrayList;

import com.dao.BookingDao;
import com.dao.BookingdaoImple;
import com.dto.Booking;
import com.dto.Flight;

public class BookingServiceImple  implements BookingService{
	BookingDao bookingdao;
	public BookingServiceImple() {
		 bookingdao = new BookingdaoImple();
	}

	@Override
	public int addBooking(Booking booking) {
		
		return bookingdao.insertBooking(booking);
	}

	@Override
	public ArrayList<Flight> findFlights(String source, String destination, String arrDate) {
		// TODO Auto-generated method stub
		return bookingdao.searchFlights(source, destination, arrDate);
	}

}
