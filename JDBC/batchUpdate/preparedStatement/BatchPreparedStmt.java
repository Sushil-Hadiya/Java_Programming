package org.batchUpdate.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchPreparedStmt {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement psmt = null;
		PreparedStatement psmt1 = null;
		String inqry = "insert into jdbc.student values(9,'Paaaaaaaaji',67.60)";
		String delqry = "delete from jdbc.user where user='Sushil'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=SHI8816ll");
			con.setAutoCommit(false);
			psmt = con.prepareStatement(inqry);
			psmt.addBatch();
			int arr[] = psmt.executeBatch();
			System.out.println("psmt reference");
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			psmt1 = con.prepareStatement(delqry);
			psmt1.addBatch();
			int arr1[] = psmt1.executeBatch();
			System.out.println("psmt1 reference");
			for (int i : arr1) {
				System.out.print(i + " ");
			}
			con.commit();
			System.out.println();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.rollback();
				System.out.println("Operation Rollback");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			if (psmt1 != null) {
				try {
					psmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (psmt != null) {
				try {
					psmt.close();
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
