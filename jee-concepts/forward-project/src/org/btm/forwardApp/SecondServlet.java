package org.btm.forwardApp;

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

public class SecondServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pname = (String) req.getAttribute("prname");
		String pqty = (String) req.getAttribute("prqty");
		int qty = Integer.parseInt(pqty);
		double price = 40000.00;
		double totalSum = (price * qty); // BUSINESS LOGIC

		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor='blue'" + "<h1>Product Details Are : Model is " + pname + " Price to Pay"
				+ totalSum + "</h1>" + "</body></html>");
		out.flush(); // PRESENTATION LOGIC
		out.close();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String query = "insert into jee.product values(?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=SHI8816ll");
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, pname);
			preparedStatement.setInt(2, qty);
			preparedStatement.setDouble(3, totalSum);
			preparedStatement.executeUpdate(); // PERSISTENT LOGIC
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}

		}
	}
}
