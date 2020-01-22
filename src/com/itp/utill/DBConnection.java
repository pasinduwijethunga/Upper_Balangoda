package com.itp.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static  Connection conn;
	
	public static Connection getConnection(){
		
		if (conn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/upper_balangoda","root","mysql");
			} catch (SQLException  | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		return conn;	
	}
	
	
}
