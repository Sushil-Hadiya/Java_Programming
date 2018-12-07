package org.preparedStatement.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.connectiontil.ConnectionUtil;

public class FetchDemo {
	public static void main(String[] args) {
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String select = "select * from jdbc.student";
		try {
			pstmt = con.prepareStatement(select);
			rs = pstmt.executeQuery();
			System.out.println("Data Fetched with the help of PreparedStatement and ResultSet interface");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double perc = rs.getDouble(3);
				System.out.println(id + " " + name + " " + perc);
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
