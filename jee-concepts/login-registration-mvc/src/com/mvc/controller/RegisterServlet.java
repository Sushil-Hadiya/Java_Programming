package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.RegisterBean;
import com.mvc.registerDAO.RegistorDAO;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fName = req.getParameter("fn");
		String email = req.getParameter("em");
		String uName = req.getParameter("un");
		String pass = req.getParameter("pw");
		String conPass = req.getParameter("cpw");

		RegisterBean rBean = new RegisterBean();
		rBean.setFullName(fName);
		rBean.setEmail(email);
		rBean.setUserName(uName);
		rBean.setPassword(pass);
		rBean.setConformPass(conPass);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		if ("success".equalsIgnoreCase(RegistorDAO.registerUser(rBean))) {
			out.println("<html><body bgcolor='blue'>");
			out.println("<h1><center>Successfully Registerd :)</center></h1>");
			out.println("</body></html>");
		} else {
			out.print("<h3>Something went wrong<h3>");
		}
	}
}
