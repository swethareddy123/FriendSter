<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">


<%
String email = request.getParameter("email");
String Newpass = request.getParameter("newpassword");
String conpass = request.getParameter("conpassword");
System.out.println(email);
System.out.println(Newpass);
System.out.println(conpass);
Connection con = null;
Statement st = null;
String pass = "";
int id = 0;
try {
Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://192.168.3.63/friendsterdb";
con = DriverManager.getConnection("jdbc:mysql://192.168.3.63/friendsterdb", "root", "root");
st = con.createStatement();
System.out.println("1");
ResultSet rs = st.executeQuery("select * from user where email = '"+email+"'");
System.out.println(rs);
if (rs.next()) {
pass = rs.getString("email");
}
if(Newpass.equals(conpass))
{
if (pass.equals(email)) {
st = con.createStatement();
int i = st.executeUpdate("update user set password='"+ Newpass + "' where email = '"+email+"'");
out.println("Password changed successfully");
st.close();
con.close();
} else {
out.println("email doesn't match");
}
/*}else{
out.println("new password and confirm new password is not matching");
}*/
}
} catch (Exception e) {
out.println(e);
}
%>
<center><INPUT TYPE="button" class="btn btn-primary" VALUE="Back" onClick="history.go(-2);"></center>
