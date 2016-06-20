package com.bvrit.friendster.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListProfileController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
HttpSession session = request.getSession();
    		
        	String username =  session.getAttribute("user1").toString();
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.3.63/friendsterdb", "root", "root");
            PreparedStatement ps = con.prepareStatement("select image from user where username= '"+username+"'");
            ResultSet rs = ps.executeQuery();
            out.println("<h1>Photos</h1>");
            while ( rs.next()) {
               
                  out.println("<img width='600' height='600' src=./DisplayProfileController?id=" +  rs.getString("userid") + "></img> <p/>");
            }

            con.close();
        }
        catch(Exception ex) {

        }
        finally {
            out.close();
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