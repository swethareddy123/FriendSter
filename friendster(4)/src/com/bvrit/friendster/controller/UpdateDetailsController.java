package com.bvrit.friendster.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.bvrit.friendster.bean.detailsBean;

import com.bvrit.friendster.dao.DetailsDAO;
import com.mysql.jdbc.Connection;
public class UpdateDetailsController extends HttpServlet {
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String username = (String)session.getAttribute("user1");
		System.out.println(username);
		try{
			System.out.println("5");
		//String username = request.getParameter("username");
		String email = request.getParameter("email");
		String phoneno = request.getParameter("phoneno");
		HttpSession hs = request.getSession();
		String user = (String) hs.getAttribute("sunm");
		System.out.println(username);
		int result;
		detailsBean cbean = new detailsBean(username,email,phoneno);
		System.out.println("7");
		DetailsDAO cda = new DetailsDAO();
		System.out.println("8");
		result = cda.updateDetails(cbean);
		if(result == 1){
			response.sendRedirect("general.jsp");
		}
		else{
			response.sendRedirect("updateDetails.jsp");
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		
	}

	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}
	
}