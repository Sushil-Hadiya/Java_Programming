package com.mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection createConnection() {
		Connection con = null;
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306?user=root&password=SHI8816ll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
