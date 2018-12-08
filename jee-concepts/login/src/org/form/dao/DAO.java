package org.form.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	public static void loginValidation(String user, String pass) {
		
	}

	public static Statement getStatement() {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.cj.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=SHI8816ll");
			stmt = con.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return stmt;
	}

	public static void main(String[] args) {

	}

}
