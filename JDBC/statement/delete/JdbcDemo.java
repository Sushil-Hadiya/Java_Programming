package org.statement.delete;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.connectiontil.ConnectionUtil;

public class JdbcDemo {
	public static void main(String[] args) {
		Connection con = ConnectionUtil.getConnection();
		Statement stmt = null;
		String query = "delete from jdbc.student where id=420";
		try {
			stmt = con.createStatement();
			System.out.println("Statement OR Plateform created..");
			stmt.executeUpdate(query);
			System.out.println("Data Deleted succssfully!!!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			ConnectionUtil.closeConnection();
		}
	}
}
