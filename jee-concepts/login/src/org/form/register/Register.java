package org.form.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fName = req.getParameter("fn");
		String lName = req.getParameter("ln");
		String pass = req.getParameter("pw");
		String email = req.getParameter("em");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		Connection con = null;
		PreparedStatement statement = null;
		String query = "insert into jee.user values(?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306?user=root&password=SHI8816ll");
			statement = con.prepareStatement(query);
			statement.setString(1, fName);
			statement.setString(2, lName);
			statement.setString(3, pass);
			statement.setString(4, email);
			int i = statement.executeUpdate();
			if (i > 0) {
				out.println("Data inserted successfully!!!");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
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
