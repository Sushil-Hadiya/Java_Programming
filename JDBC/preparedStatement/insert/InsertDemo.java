package org.preparedStatement.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.connectiontil.shishirasirMethod.DBSingleTon;

public class InsertDemo {
	public static void main(String[] args) {
		DBSingleTon db = DBSingleTon.getInstance();
		Connection con = db.getConnection();
		PreparedStatement pstmt = null;
		String insert = "insert into jdbc.student values(?,?,?)";
		try {
			pstmt = con.prepareStatement(insert); // Compilation
			// SET THE VALUE FOR THE PLACE HOLDER BEFORE EXECUTION
			pstmt.setInt(1, 6);
			pstmt.setString(2, "DVS");
			pstmt.setDouble(3, 45.06);
			pstmt.executeUpdate();// Execution
			pstmt.setInt(1, 9);
			pstmt.setString(2, "KAKA");
			pstmt.setDouble(3, 99.99);
			pstmt.executeUpdate();// Execution
			System.out.println("Data Inserted!!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
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
