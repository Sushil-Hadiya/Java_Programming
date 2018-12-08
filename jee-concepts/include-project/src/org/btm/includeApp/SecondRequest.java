package org.btm.includeApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondRequest extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pname = (String) req.getAttribute("prnm");
		String pqty = (String) req.getAttribute("prqty");
		int qty = Integer.parseInt(pqty);
		double price = 40000.00;
		double totalSum = price * qty; // BUSINESS LOGIC
		req.setAttribute("sum", totalSum);

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String query = "insert into jee.product_forward values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=SHI8816ll");
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, pname);
			preparedStatement.setInt(2, qty);
			preparedStatement.setDouble(3, totalSum);
			preparedStatement.executeUpdate();// PERSISTENCE LOGIC

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}
