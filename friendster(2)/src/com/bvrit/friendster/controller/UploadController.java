package com.bvrit.friendster.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvrit.friendster.dao.ConnectionDAO;
import com.bvrit.friendster.dao.UserDAO;

import java.io.*;

import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UploadController extends HttpServlet {


private static final long serialVersionUID = -337920480578240289L;


protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
//response.setContentType(“text/html;charset=UTF-8”);

try
{
String strpath=request.getParameter("Image");
String filepath=strpath.substring(strpath.lastIndexOf("\\")+1);
File imgfile = new File(strpath);
FileInputStream fin = new FileInputStream(imgfile);
UserDAO udao = new UserDAO();
boolean result = udao.upload(filepath,imgfile,fin);
if(result){
  String L_url1=response.encodeRedirectURL("homeView.jsp");
  response.sendRedirect(L_url1);
}
else{
	response.sendRedirect("addpostView.jsp");
}
}
catch(Exception ex){
System.out.println(ex.getMessage());
}
}


protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}



protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}



public String getServletInfo() {
return "Short description";
}

}