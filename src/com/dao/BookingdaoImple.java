package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.conn.MyConn;
import com.dto.Booking;
import com.dto.Flight;

public class BookingdaoImple implements BookingDao {
	private MyConn conn;
	
	public BookingdaoImple() {
		conn = new MyConn();
	}

	@Override
	public int insertBooking(Booking booking) {
		int i=0;
		try {
			Connection con=conn.getConn();
			PreparedStatement p =con.prepareStatement("insert into booking(flight_no,cust_name,cust_no,book_seat) values (?,?,?,?)");
			p.setInt(1, booking.getFlightNo());
			p.setString(2, booking.getCustName());
			p.setString(3, booking.getCustNo());
			p.setInt(4, booking.getBookSeat());
			
			 i=p.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		return i;
	}

	@Override
	public ArrayList<Flight> searchFlights(String source, String destination, String arrDate) {
		ArrayList<Flight> al = new ArrayList<>();
		try {
		Connection con = MyConn.getConn();
		PreparedStatement s = con.prepareStatement("select * from flight_info where source=? and destination=? and arr_date=? ");
		s.setString(1, source);
		s.setString(2, destination);
		s.setString(3, arrDate);
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

}
