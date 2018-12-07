package org.preparedStatement.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.connectiontil.shishirasirMethod.DBSingleTon;

public class WhereNameEQLPlaceHolder {
	public static void main(String[] args) {
		DBSingleTon db = DBSingleTon.getInstance();
		Connection con = db.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String query = "select * from jdbc.student where name=?";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the NAME???");
		String name = sc.next();
		sc.close();
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			System.err.println("ID and Perc For the " + name);
			if (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getDouble(3));
			} else {
				System.err.println("Data Not Found for " + name);
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
