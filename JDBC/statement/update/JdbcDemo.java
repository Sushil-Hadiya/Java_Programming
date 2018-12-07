package org.statement.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String query = "update jdbc.student set name = 'Paji' where id = 8";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded and Registered");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=SHI8816ll");
			System.out.println("Connection Established with server..");
			stmt = con.createStatement();
			System.out.println("Statement OR Plateform created..");
			stmt.executeUpdate(query);
			System.out.println("Data Updated succssfully!!!!!");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
					System.out.println("Costly resources are closed..");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
