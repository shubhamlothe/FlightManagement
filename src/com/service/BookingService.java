package com.service;

import java.util.ArrayList;

import com.dto.Booking;
import com.dto.Flight;

public interface BookingService {
	public int addBooking(Booking booking);
	public ArrayList<Flight> findFlights(String source,String destination,String arrDate);
	
}
