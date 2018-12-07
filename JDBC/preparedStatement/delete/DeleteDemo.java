package org.preparedStatement.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.connectiontil.shishirasirMethod.DBSingleTon;

public class DeleteDemo {
	public static void main(String[] args) {
		DBSingleTon db = DBSingleTon.getInstance();
		Connection con = db.getConnection();
		PreparedStatement psmt = null;
		String delete = "delete from jdbc.student where id = ?";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to delete the data ");
		int id = sc.nextInt();
		sc.close();
		try {
			psmt = con.prepareStatement(delete);
			psmt.setInt(1, id);
			int i = psmt.executeUpdate();
			if (i > 0) {
				System.out.println("Data Deleted Successfully for " + id);
			} else {
				System.out.println("Data not found for " + id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
