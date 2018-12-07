package org.preparedStatement.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.connectiontil.shishirasirMethod.DBSingleTon;

public class UpdateDemo {
	public static void main(String[] args) {
		DBSingleTon db = DBSingleTon.getInstance();
		Connection con = db.getConnection();
		PreparedStatement psmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id??");
		int id = sc.nextInt();
		System.out.println("Enter Name??");
		String name = sc.next();
		System.out.println("Enter Per??");
		double perc = sc.nextDouble();
		sc.close();
		String query = "update jdbc.student set name=?,per=? where id=?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, name);
			psmt.setDouble(2, perc);
			psmt.setInt(3, id);
			int i = psmt.executeUpdate();
			if (i > 0) {
				System.out.println("Data Updated for " + id);
			} else {
				System.out.println("Failed to Update data for " + id);
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
					psmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
