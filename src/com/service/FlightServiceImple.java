package com.service;

import java.util.ArrayList;

import com.dao.FlightDaoImlpe;
import com.dao.flightDao;
import com.dto.Flight;

public class FlightServiceImple implements FlightService{
	private flightDao flightdao;
	public FlightServiceImple() {
		flightdao =new FlightDaoImlpe();
	}

	@Override
	public int addFlight(Flight flight) {
		
		return flightdao.insertFlight(flight);
	}

	@Override
	public int modifyFlight(Flight flight) {
		
		return flightdao.updateFlight(flight) ;
	}

	@Override
	public int removeFlight(int flightNo) {
		
		return flightdao.deleteFlight(flightNo);
	}

	@Override
	public ArrayList<Flight> displayFlight() {
		
		return flightdao.showFlight();
	}

	@Override
	public Flight getFlight(int flightNo) {
		
		return flightdao.findFlight(flightNo);
	}

	@Override
	public int Reserveflight(int flightNo, int fSeat) {
		
		return flightdao.Bookflight(flightNo, fSeat);
	}

}
