package org.batchUpdate.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchStmt {

	public static void main(String[] args) {
		// MAIN ADVANTAGE OF BATCH IS TO REDUCE THE DATA BASE CALL FROM JAVA APPLICATION
		// TO DATA BASE SERVER
		Connection con = null;
		Statement stmt = null;
		String inqry = "insert into jdbc.employee values(2,'Sushil',4900000.00)";
		String upqry = "update jdbc.student set per=60.65 where id=2";
		String delqry = "delete from jdbc.student where per=60.71";
		String delEmp = "delete from jdbc.employee where id=2";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306?user=root&password=SHI8816ll");
			stmt = con.createStatement();
			// ADD DML STATEMENT INTO THE BATCH CALLED addBatch() method
			stmt.addBatch(inqry);
			stmt.addBatch(delqry);
			stmt.addBatch(upqry);
			stmt.addBatch(delEmp);
			// EXECUTE THE DML STATEMENT WHICH ARE ADDED INTO THE BATCH USING THE
			// executeBatch() METHOD WHICH RETURN INT[]...
			int arr[] = stmt.executeBatch();
			for (int i : arr) {
				System.out.print(i + " ");
			}
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
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
