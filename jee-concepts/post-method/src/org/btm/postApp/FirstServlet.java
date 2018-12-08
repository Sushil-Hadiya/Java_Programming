package org.btm.postApp;

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

public class FirstServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		String name = req.getParameter("nm");
		String dept = req.getParameter("dp");
		String perc = req.getParameter("pt");
		double per = Double.parseDouble(perc);
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body='blue'>"
				+ "<h1>Student information is : "+name+" "+dept+"</h1>"
						+ "</body></html>");
		out.flush();
		out.close();
		
		Connection con = null;
		PreparedStatement psmt = null;
		String query = "insert into jee.student values(?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306?user=root&password=SHI8816ll");
			psmt = con.prepareStatement(query);
			psmt.setInt(1, id);
			psmt.setString(2, name);
			psmt.setString(3, dept);
			psmt.setDouble(4, per);
			psmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(psmt != null) {
				try {
					psmt.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
