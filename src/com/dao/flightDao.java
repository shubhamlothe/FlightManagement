package com.dao;

import java.util.ArrayList;

import com.dto.Flight;

public interface flightDao {
	public int insertFlight(Flight flight);
	public int updateFlight(Flight flight);
	public int deleteFlight(int flightNo);
	public ArrayList<Flight> showFlight();
	public Flight findFlight(int flightNo);
	public int Bookflight(int flightNo,int fSeat);
}
