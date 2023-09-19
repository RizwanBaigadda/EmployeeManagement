package com.Employee;

import java.sql.*;

public class conn {
	
	
	Connection c;
	Statement s;
	conn(){
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///employeemanagement", "root", "root");
			s = c.createStatement();

		}catch(Exception e) {
		System.out.println(e);
		
		}
		
	}

	// something chnaged in this file to commit 
	public static void main(String args[]) {
		new conn();
	}

}
