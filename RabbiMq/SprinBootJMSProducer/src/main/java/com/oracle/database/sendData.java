package com.oracle.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sendData {

	public static void main(String[] args) throws SQLException {
		//jdbc:oracle:drivertype:@database
		//or
		//jdbc:oracle:drivertype:user/password@database
		String dbURL="jdbc/oracle:thin@localhost1521:xe";
		String username="system";
		String password="karthik";
		
		try
		{
			Connection connection=DriverManager.getConnection(dbURL, username, password);	
			System.out.println("connected to oracle");
		}
		catch (SQLException e) {
			System.out.println("oops error in connecting database");
			e.printStackTrace();
			// TODO: handle exception
		}

		}
		}
