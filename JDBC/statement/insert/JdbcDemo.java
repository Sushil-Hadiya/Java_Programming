package org.statement.insert;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.connectiontil.shishirasirMethod.DBSingleTon;

public class JdbcDemo {
	public static void main(String[] args) {
		DBSingleTon dbs = DBSingleTon.getInstance();
		Connection con = dbs.getConnection();
		/*
		 * OR Connection con = DBSingleTon.getInstance().getConnection();
		 */
		Statement stmt = null;
		String query = "insert into jdbc.student values(8,'',60.71)";
		try {
			stmt = con.createStatement();
			System.out.println("Statement Or Plateform Created..");
			stmt.executeUpdate(query);
			System.out.println("Data Inserted!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
					System.out.println("Costly resources are closed..");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
