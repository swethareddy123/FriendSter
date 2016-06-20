package com.bvrit.friendster.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bvrit.friendster.dao.UserDAO;

/**
 * Servlet implementation class SignupController
 */
public class SignupController extends HttpServlet {
	

	
protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
	
	String userid = (String)session.getAttribute("userid");
	System.out.println(userid);
	try {
		//read username and password
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String phoneno = request.getParameter("phoneno");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//create object of UserDAO
		UserDAO udao = new UserDAO();
		
		//call signup()
		boolean result = udao.signup(fname,lname,phoneno,email,username, password);
		
		//redirect control to next page based on decision
		if(result){
			response.sendRedirect("loginView.jsp");
		}else{
			response.sendRedirect("signupView.jsp");
			
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doProcess(request,response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

}