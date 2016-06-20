package com.bvrit.friendster.dao;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvrit.friendster.bean.SuggestedBean;

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
	public boolean signup(String fname,String lname,String phoneno,String email,String username,String password)
	throws ClassNotFoundException,SQLException{
		boolean result = false;
		pst = con.prepareStatement("insert into user(fname,lname,phoneno,email,username,password) values('"+fname+"','"+lname+"','"+phoneno+"','"+email+"','"+username+"','"+password+"')");
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

	public boolean UploadProfile(InputStream image)
			throws ClassNotFoundException,SQLException{
		boolean result = false;
		pst= con.prepareStatement("update user set image = '"+image+"' where username = '"+username+"'");
		pst.setBinaryStream(1,image);
		ResultSet rs = pst.executeQuery();
		if(rs.next()){
			result = true;
		}
		return result;
	}
	  public List<SuggestedBean> SuggestedFriends(int userid1)
	            throws SQLException, ClassNotFoundException {
	        List<SuggestedBean> conCollection = new ArrayList<SuggestedBean>();
	        System.out.println(userid1 + " sfrn");
	        String query = "SELECT * FROM user where userid !='" + userid1 + "'";
	        ResultSet result = pst.executeQuery(query);
	        // UserBean ubean;
	        SuggestedBean sBean;
	       
	        while (result.next()) {
	            // Retrieve by column name

	            int userid = result.getInt("userid");
	            String fname = result.getString("fname");
	            String lname = result.getString("lname");
	            String phoneno = result.getString("phoneno");
	           
	            String email = result.getString("email");
	            String username = result.getString("username");
	            String password = result.getString("password");
	            String image = result.getString("image");
	            sBean = new SuggestedBean(userid,fname, lname,phoneno,email, username,password, image);
	            conCollection.add(sBean);
	            // conCollection.add(sBean);
	        }
	        System.out.println(conCollection.size());
	        return conCollection;
	    }
}