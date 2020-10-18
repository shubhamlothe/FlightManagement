package com.dao;

import java.util.ArrayList;

import com.dto.Booking;
import com.dto.Flight;

public interface BookingDao {
		public int insertBooking(Booking booking);
		public ArrayList<Flight> searchFlights(String source,String destination,String arrDate);
}
