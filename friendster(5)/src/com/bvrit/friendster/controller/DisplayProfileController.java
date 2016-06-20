/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvrit.friendster.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bvrit.friendster.dao.ConnectionDAO;
import com.bvrit.friendster.dao.UserDAO;

public class DisplayProfileController extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        try {
        	System.out.println("108");
        	HttpSession session = request.getSession();
    		
        	String username =  session.getAttribute("user1").toString();
        	Connection con;
 			ConnectionDAO cdao;
 			cdao = new ConnectionDAO();
 			con = cdao.getConnection();
            PreparedStatement ps = con.prepareStatement("select image from upload where username = ?");
            System.out.println(ps);
            String username1 = request.getParameter("username");
            ps.setString(1,username1);
            ResultSet rs = ps.executeQuery();
            rs.next();
            Blob  b = rs.getBlob("image");
            response.setContentType("image/jpeg");
            response.setContentLength( (int) b.length());
            InputStream is = b.getBinaryStream();
            OutputStream os = response.getOutputStream();
            byte buf[] = new byte[(int) b.length()];
            is.read(buf);
            os.write(buf);
            os.close();
        }
        catch(Exception ex) {
             System.out.println(ex.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
}