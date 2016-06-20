<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String un = request.getParameter("username");
String error = request.getParameter("error");
if(un != null) {
	out.print("<center><h3>Please check your Username and password"+un+"</h3></center>");
}
if(error != null) {
	out.print("<h1><font color = red >"+error+"</font></h1>");
}
%>
<%
String message = request.getParameter("msg");
if(message != null){
    out.print(message);
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<div style='position:absolute;z-index:0;left:0;top:0;width:100%;height:100%'>
  <img src='http://wallpaper.zone/img/2097194.jpg' style='width:100%;height:100%' alt='[]' />
</div>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
body {
    background-color:rgb(243, 243, 216)
</style>
</head>
<body>
<center><h1>WELCOME</h1></center>
<form method = "post"  action = "login">
<div class="container">
 <div class = "row">
 
 <div class="col-sm-6 col-md-4 col-md-offset-4">
<center><h1>FriendSter</h1></center>
 <div class = "well">
  <h2><center>log in</center></h2>
  <form role="form" action = "login" method = "post">
    <div class="form-group">
      <label for="username">UserName:</label>
      <input type="username" class="form-control" id="username" name = username placeholder="Enter  username" required>
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="password" class="form-control" id="password" name = password placeholder="Enter password" required>
    </div>
    <form model = "post" action = "login">
    <button type="submit" class="btn btn-danger">Log in</button><br>
    </form> 
     <a href = "ForgotPasswordForm.jsp">ForgotPassword</a>
    <a href = "signupView.jsp" class="btn btn-danger">Sign Up</a>
   </form>
   </div>   
  </div>
</div>
</div>
</form>
</center>
</body>
</html>