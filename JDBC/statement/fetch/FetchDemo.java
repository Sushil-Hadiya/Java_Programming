package org.statement.fetch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.connectiontil.ConnectionUtil;

public class FetchDemo {
	public static void main(String[] args) {
		Connection con = ConnectionUtil.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from jdbc.student";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			/*  //FETCH SPECIFIC RECORD FROM TABLES USE absolute() method of ResultSet() INTERFACE..//
			 * boolean val = rs.absolute(3); if (val) { int id = rs.getInt("id"); String
			 * name = rs.getString("name"); double pers = rs.getDouble(3);
			 * System.out.println(id + " " + name + " " + pers); }
			 */
			System.err.println("ID "+"NAME "+"PERC"); //fetch all records use next() method with while
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double pers = rs.getDouble(3);
				System.out.println(id + " " + name + " " + pers);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
