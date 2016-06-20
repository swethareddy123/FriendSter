package com.bvrit.friendster.controller;

/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import com.bvrit.friendster.dao.ConnectionDAO;

public class UploadProfileController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println("3");
		try {
			Connection con;
			ConnectionDAO cdao;
			cdao = new ConnectionDAO();
			con = cdao.getConnection();
			// Apache Commons-Fileupload library classes
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(factory);
			if (!ServletFileUpload.isMultipartContent(request)) {
				System.out.println("sorry. No file uploaded");
				return;
			}
			// parse request
			List items = sfu.parseRequest(request);

			FileItem image = (FileItem) items.get(0);
			System.out.println(image);
			// Connect to Oracle
			// Will work only in mysql as mysql is having longblob datatype
			if(image.getName().equals("null") || image.getName() == "" || image.getName().equals("")){
				response.sendRedirect("error404.jsp");
				System.out.println("select some image");
				return;
			}
			
			PreparedStatement ps = con.prepareStatement("insert into user(image) values(?)");
			// size must be converted to int otherwise it results in error
			ps.setBinaryStream(1, image.getInputStream(), (int) image.getSize());
		    ps.executeUpdate();
			out.println("profile updated Successfully.");
			ListProfileController lp = new ListProfileController();
			lp.doPost(request, response);
			/*RequestDispatcher rd  =request.getRequestDispatcher("displayprofile");
			rd.forward(request, response);*/
			con.close();
		} catch (Exception ex) {
			out.println("Error --> " + ex.getMessage());
		}
	}
}