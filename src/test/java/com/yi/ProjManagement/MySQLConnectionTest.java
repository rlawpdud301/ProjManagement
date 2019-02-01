package com.yi.ProjManagement;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://127.0.0.1:3306/projmanagement";
	private static final String user = "root";
	private static final String password = "rootroot";
	
	@Test
	public void testConnection() throws ClassNotFoundException {
		Class.forName(driver);
		
		try (Connection con = DriverManager.getConnection(url, user, password)){
			System.out.println(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
