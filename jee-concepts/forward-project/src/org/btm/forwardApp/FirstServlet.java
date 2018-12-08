package org.btm.forwardApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pname = req.getParameter("nm");
		String pqty = req.getParameter("pq");
		
		//ADD REQUEST OBJECT INTO SCOPE//
		req.setAttribute("prname", pname);
		req.setAttribute("prqty", pqty);
		
		RequestDispatcher rd = req.getRequestDispatcher("ss");
		rd.forward(req, resp);
	}
}
