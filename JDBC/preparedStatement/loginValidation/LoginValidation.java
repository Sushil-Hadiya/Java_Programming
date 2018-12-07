package org.preparedStatement.loginValidation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.connectiontil.ConnectionUtil;

public class LoginValidation {
	public static void main(String[] args) {
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String query = "select username from jdbc.user where user=? and password=?";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user ");
		String user = sc.next();
		System.out.println("Enter the password ");
		String pwd = sc.next();
		sc.close();
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, user);
			psmt.setString(2, pwd);
			rs = psmt.executeQuery(); // cursor or buffer memory which stored the process data or resultant data..
			if (rs.next()) {
				System.out.println(rs.getString(1));
			} else {
				System.err.println("Invalid user/password");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
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
