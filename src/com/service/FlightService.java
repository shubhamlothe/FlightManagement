package com.service;

import java.util.ArrayList;

import com.dto.Flight;

public interface FlightService {
	public int addFlight(Flight flight);
	public int modifyFlight(Flight flight);
	public int removeFlight(int flightNo);
	public ArrayList<Flight> displayFlight();
	public Flight getFlight(int flightNo);
	public int Reserveflight(int flightNo,int fSeat);
}
