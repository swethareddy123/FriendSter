package com.bvrit.friendster.dao;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.bvrit.friendster.bean.detailsBean;
import com.mysql.jdbc.Connection;

public class DetailsDAO {
 PreparedStatement st;
 Connection conn;
 int result;
 ConnectionDAO cd;
 public DetailsDAO() throws ClassNotFoundException {
  super();
  cd = new ConnectionDAO();
  try {
	conn = (Connection) cd.getConnection();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 }
/*public int addContact(detailsBean cbean) throws SQLException{
  String query = "INSERT INTO contact values(?,?,?,?,?)";
  st = conn.prepareStatement(query);
   String name = cbean.getUserName();
  String email = cbean.getEmail();
  String phone = cbean.getPhoneno();

  
  
  st.setString(2,name);
  st.setString(3,email);
  st.setString(4,phone);
  ;
  System.out.println(query);
  result = st.executeUpdate();
  return result;
 }(/comment)
 //public List<detailsBean> listContact(String user) throws SQLException{
  //String query = "select * from contact where user=user";
  //List<detailsBean> cbeanList = new ArrayList<detailsBean>();
 // ResultSet rs = null;
  //st = conn.prepareStatement(query);
  //rs = st.executeQuery();
  //detailsBean bean;
  
  //while(rs.next()){
   
  // String name = rs.getString("username");
   //String email = rs.getString("email");
  // String phone = rs.getString("phoneno");
  // bean = new detailsBean(name,email,phone);
   //   cbeanList.add(bean);
  // }
   //return cbeanList; 
  }*/
 public int delete(String id) throws SQLException{
  String query = "delete from contact where id='"+id+"'";
  st = conn.prepareStatement(query);
  result = st.executeUpdate();
  return result;
 }
 public int updateDetails(detailsBean cbean) throws SQLException{
        int result = 0;
       
        String name1 = cbean.getUserName();
        String email1 = cbean.getEmail();
        String phone1 = cbean.getPhoneno();
        String query = "update user set email='"+email1+"',phoneno='"+phone1+"' where username ='"+name1+"'";
        st = conn.prepareStatement(query);
        result = st.executeUpdate();
        
   return result;
 }
 
}