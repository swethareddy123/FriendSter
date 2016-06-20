package com.bvrit.friendster.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

public class AddPostController extends HttpServlet {
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
		String UPLOAD_DIRECTORY = "/Img";
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println("3");
		try {
			System.out.println("7");
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
		
			
			FileItem comment = (FileItem)items.get(0);
			String post = comment.getString();
			FileItem img = (FileItem) items.get(1);
			
			
			
			PreparedStatement ps = con.prepareStatement("insert into upload(comment,image) values(?,?)");
			// size must be converted to int otherwise it results in error
		  
			ps.setString(1,post);
			ps.setBinaryStream(2, img.getInputStream(), (int) img.getSize());
		    ps.executeUpdate();
		    RequestDispatcher rd  =request.getRequestDispatcher("displayprofile");
			rd.forward(request, response);
			con.close();
			System.out.println("updated");
		} catch (Exception ex) {
			out.println("Error --> " + ex.getMessage());
		}
	}
}
    