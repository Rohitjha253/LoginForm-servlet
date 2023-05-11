package com.rohit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String uname=req.getParameter("un");
		String upass=req.getParameter("pass");
		
		
		String name="";
		String pass="";
		
		Cookie cookies[] = req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("email")) {
				name =c.getValue();
			}
			
			if(c.getName().equals("pass")) {
				pass=c.getValue();
			}
		}
		PrintWriter p=res.getWriter();
		if(name.equalsIgnoreCase(uname) && pass.equalsIgnoreCase(upass))
		{
			p.println("Logged Succesfully");
		}
		else
		{
			p.println("Incorrect Credentials");
		}
	}
}
