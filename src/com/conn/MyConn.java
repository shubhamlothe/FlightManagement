package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConn {
	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/FlightBooking?autoReconnect=true&useSSL=false";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "asdf";
	private static Connection con;
	public static Connection getConn() throws Exception {
		if(con==null || con.isClosed()) {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		}
		return con;
	}
}
