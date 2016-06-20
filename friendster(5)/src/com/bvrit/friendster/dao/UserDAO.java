package com.bvrit.friendster.dao;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvrit.friendster.bean.ActiveFriendBean;
import com.bvrit.friendster.bean.SuggestedBean;
import com.bvrit.friendster.bean.UploadBean;

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
	
	  public List<SuggestedBean> SuggestedFriends(String username)
	            throws SQLException, ClassNotFoundException {
	        List<SuggestedBean> conCollection = new ArrayList<SuggestedBean>();
	        System.out.println(username + " sfrn");
	        String query = "SELECT * FROM user where username ='" +username+ "'";
	        System.out.println(query);
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
	            
	            String password = result.getString("password");
	            Blob  b = result.getBlob("image");
	            sBean = new SuggestedBean(userid,fname, lname,phoneno,email, username,password,b);
	            conCollection.add(sBean);
	            // conCollection.add(sBean);
	        }
	        System.out.println(conCollection.size());
	        return conCollection;
	    }
	  public List<ActiveFriendBean> activeFriends(String username,String query) {
			List<ActiveFriendBean> list = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = con.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					list = new ArrayList<ActiveFriendBean>();
					resultSet.beforeFirst();
				}
				ActiveFriendBean afb;
				while (resultSet.next()) {
					afb = new ActiveFriendBean();
					afb.setUsername(resultSet.getString("username"));
					System.out.println(resultSet.getString("username"));
					afb.setUserid(resultSet.getInt("username"));
					afb.setDp(resultSet.getString("dp"));
					list.add(afb);
				}
			} catch (SQLException e) {
					System.out.println(e);

			} finally {
				try {
					if(con!=null){
						con.close();
						
					}
					if(resultSet!=null){
						resultSet.close();
					}
					if (null != preparedStatement) {
						preparedStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

			return list;
		}
	  public List<UploadBean> displayImg(int user_id, String query) {
			List<UploadBean> list = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = con.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					list = new ArrayList<UploadBean>();
					resultSet.beforeFirst();
				}

				while (resultSet.next()) {

					UploadBean upload = new UploadBean();
					upload.setComment(resultSet.getString("comment"));
					upload.setImage(resultSet.getString("img"));
					upload.setDateTime(resultSet.getString("dateTime"));
					// upload.setComment(resultSet.getString("user_id"));
					upload.setUsername(resultSet.getString("username"));
					upload.setDp(resultSet.getString("dp"));
					upload.setUser_id(resultSet.getInt("user_id"));
					System.out.println("this is date"
							+ resultSet.getString("dateTime"));
					list.add(upload);
					System.out.println(list);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e);

			} finally {
				try {
					if (null != preparedStatement) {
						preparedStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

			return list;
		}
	  public int insertImg(UploadBean upload) {
			int insertStatus = 0;
			// PreparedStatement preparedStatement = null;

			try {

				String query = "insert into upload (comment,img,userid,dateTime) values('"
						+ upload.getComment()
						+ "','"
						+ upload.getImage()
						+ "',"
						+ upload.getUser_id() + "," + "NOW())";

				insertStatus = pst.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			// closing connections
			finally {
				try {

					if (null != pst) {
						pst.close();

					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}

			}

			return insertStatus;

		}
	  public String getProfilePic(int user_id) throws SQLException {
			String dp = null;
			String query = "select dp from users where user_id=" + user_id + ";";
			ResultSet rs = null;
			rs = pst.executeQuery(query);
			while (rs.next()) {
				dp = rs.getString("dp");

			}

			return dp;

		}
	  
}


