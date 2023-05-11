package com.rohit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String password=req.getParameter("npass");
		
		Cookie cookie = new Cookie("email", email + "");
		Cookie cookie1 = new Cookie("pass", password + "");
		
		res.addCookie(cookie);
		res.addCookie(cookie1);
		
		PrintWriter p=res.getWriter();
		p.println("You have succesfully registered");
		
	}
}
