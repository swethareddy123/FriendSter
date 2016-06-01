package com.bvrit.friendster.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	public static String username = "null";
	Connection con;
	ConnectionDAO cdao;
	PreparedStatement pst;
	public UserDAO()
	throws ClassNotFoundException,SQLException{
		
		cdao = new ConnectionDAO();
		
		con = cdao.getConnection();
	}
	public boolean signup(String fname,String lname,String phoneno,String email,String user,String password)
	throws ClassNotFoundException,SQLException{
		boolean result = false;
		pst = con.prepareStatement("insert into user values('"+fname+"','"+lname+"','"+phoneno+"','"+email+"','"+user+"','"+password+"')");
		int ans = pst.executeUpdate();
		if(ans>0){
			result = true;
		}
		return result;
	}
	public boolean login(String username,String password)
			throws ClassNotFoundException,SQLException{
				boolean result = false;
				System.out.println("1.1");
				pst = con.prepareStatement("select * from user where username ='"+username+"'and password = '"+password+"'");
				System.out.println(pst);
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					result = true;
				}
				return result;
			}
	public boolean upload(String filepath,File imgfile,FileInputStream fin)
			throws ClassNotFoundException,SQLException{
		boolean result = false;
		pst= con.prepareStatement("insert into upload_image(image,image_name,image_length) values(?,?,?)");
		pst.setBinaryStream(1,fin,(int)imgfile.length());
		pst.setString(2,filepath);
		pst.setLong(3,imgfile.length());
		ResultSet rs = pst.executeQuery();
		if(rs.next()){
			result = true;
		}
		return result;
	}
}