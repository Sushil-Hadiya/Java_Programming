package org.form.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		String password = req.getParameter("pw");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		Connection con = null;
		PreparedStatement pstmt = null;
		String query = "select * from jee.user where fname=? and password=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306?user=root&password=SHI8816ll");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			boolean status = rs.next();
			if (status) {
				out.println("Welcome To HomePage : " + name);
			} else {
				out.println("Invalid User name and password!! TRY AGAIN......");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}
