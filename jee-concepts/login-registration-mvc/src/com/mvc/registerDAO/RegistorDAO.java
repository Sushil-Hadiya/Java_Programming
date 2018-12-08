package com.mvc.registerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.bean.RegisterBean;
import com.mvc.util.DBConnection;

public class RegistorDAO {
	public static String registerUser(RegisterBean bean) {
		String fname = bean.getFullName();
		String email = bean.getEmail();
		String uname = bean.getUserName();
		String pass = bean.getPassword();
		Connection con = null;
		PreparedStatement statement = null;
		String query = "insert into jee.mvc_register values(null,?,?,?,?)";
		try {
			con = DBConnection.createConnection();
			statement = con.prepareStatement(query);
			statement.setString(1, fname);
			statement.setString(2, email);
			statement.setString(3, uname);
			statement.setString(4, pass);
			int i = statement.executeUpdate();
			if (i > 0) {
				return "success";
			} else {
				System.out.println("Try next time :)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "sorry";
	}
}
