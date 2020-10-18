package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.conn.MyConn;

import com.dto.Flight;

public class FlightDaoImlpe implements flightDao {
	private MyConn conn;
	public FlightDaoImlpe() {
		conn = new MyConn();
	}

	@Override
	public int insertFlight(Flight flight) {
		int i=0;
		try {
			Connection con=conn.getConn();
			PreparedStatement p =con.prepareStatement("insert into flight_info(source,destination,arr_date,book_time,tot_seats,book_seat,amount) values (?,?,?,?,?,?,?)");
			p.setString(1, flight.getSource());
			p.setString(2, flight.getDestination());
			p.setString(3, flight.getArrDate());
			p.setString(4, flight.getBookTime());
			p.setInt(5, flight.getTotSeat());
			p.setInt(6, flight.getBookSeat());
			p.setFloat(7, flight.getAmount());
			 i=p.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		return i;
	}

	@Override
	public int updateFlight(Flight flight) {
		
		
		
		int i=0;
		try {
			Connection con=conn.getConn();
			PreparedStatement p =con.prepareStatement("update flight_info set source=?,destination=?,arr_date=?,book_time=?,tot_seats=?,book_seat=?,amount=? where flight_no=? ");
			p.setString(1, flight.getSource());
			p.setString(2, flight.getDestination());
			p.setString(3, flight.getArrDate());
			p.setString(4, flight.getBookTime());
			p.setInt(5, flight.getTotSeat());
			p.setInt(6, flight.getBookSeat());
			p.setFloat(7, flight.getAmount());
			p.setInt(8, flight.getFlightNo());
			 i=p.executeUpdate();
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		return i;
	}

	@Override
	public int deleteFlight(int flightNo) {
		int i=0;
		int j=0;
		try {
			Connection con=conn.getConn();
			PreparedStatement p =con.prepareStatement("delete from booking where flight_no=?");
			p.setInt(1, flightNo);
			
			 j=p.executeUpdate();
			PreparedStatement q =con.prepareStatement("delete from flight_info where flight_no=?");
			q.setInt(1, flightNo);
			
			 i=q.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		return i;
	}

	@Override
	public ArrayList<Flight> showFlight() {
		ArrayList<Flight> al = new ArrayList<>();
		try {
		Connection con = MyConn.getConn();
		PreparedStatement s = con.prepareStatement("select * from flight_info ");
		
		ResultSet rs = s.executeQuery();
		while(rs.next()) {
			Flight fl = new Flight();
			fl.setFlightNo(rs.getInt("flight_no"));
			fl.setSource(rs.getString("source"));
			fl.setDestination(rs.getString("destination"));
			fl.setArrDate(rs.getString("arr_date"));
			fl.setBookTime(rs.getString("book_time"));
			fl.setTotSeat(rs.getInt("tot_seats"));
			fl.setBookSeat(rs.getInt("book_seat"));
			fl.setAmount(rs.getFloat("amount"));
			al.add(fl);
		}
		s.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}


	@Override
	public Flight findFlight(int flightNo) {
		Flight fl = new Flight();
		try {
			Connection con=conn.getConn();
			PreparedStatement p =con.prepareStatement("select * from flight_info where flight_no=?");
			p.setInt(1, flightNo);
			ResultSet rs = p.executeQuery();
			if(rs.next()) {
				
				fl.setFlightNo(rs.getInt("flight_no"));
				fl.setSource(rs.getString("source"));
				fl.setDestination(rs.getString("destination"));
				fl.setArrDate(rs.getString("arr_date"));
				fl.setBookTime(rs.getString("book_time"));
				fl.setTotSeat(rs.getInt("tot_seats"));
				fl.setBookSeat(rs.getInt("book_seat"));
				fl.setAmount(rs.getFloat("amount"));
			
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		return fl;

}

	@Override
	public int Bookflight(int flightNo, int fSeat) {
		int i=0;
		try {
			Connection con=conn.getConn();
			PreparedStatement p =con.prepareStatement("update flight_info set book_seat=? where flight_no=? ");
			p.setInt(1, fSeat);
			p.setInt(2, flightNo);
			
			 i=p.executeUpdate();
			 System.out.println(i);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		return i;
	
	}
}