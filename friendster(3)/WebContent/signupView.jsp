<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang = "en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <div style='position:absolute;z-index:0;left:0;top:0;width:100%;height:100%'>
  <img src='http://wallpaper.zone/img/2097194.jpg' style='width:100%;height:100%' alt='[]' />
  </div>
<style>

body {
    background-color:rgb(243, 243, 216)
</style>
</head>
<body>

<form method = "post" action = "signup">
<center><h1>FriendSter</h1></center>
<div class="container">
  <div class = "row">
  <div class="col-sm-6 col-md-4 col-md-offset-4">
  
  <div class = "well">
  <h2><center>Sign up</center></h2>
  <form role="form" action = "signup" method = "post">
     <div class="form-group">
      <label for="fname">FirstName:</label>
      <input type="fname" class="form-control" id="fname" name = fname placeholder="Enter firstname">
    </div>
    <div class="form-group">
      <label for="lname">Lastname:</label>
      <input type="lname" class="form-control" id="lname" name = lname placeholder="Enter lastname">
    </div> 
    <div class="form-group">
      <label for="phoneno">Phoneno:</label>
      <input type="phoneno" class="form-control" id="phoneno" name = "phoneno" placeholder="Enter phoneno">
    </div>
     <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" name = "email" placeholder="Enter email">
    </div>
      <div class="form-group">
      <label for="username">UserName:</label>
      <input type="username" class="form-control" id="username" name = "username" placeholder="Enter  username">
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="password" class="form-control" id="password" name = "password" placeholder="Enter password">
    </div>
    
    <button type="submit" class="btn btn-danger">Sign In</button>
    <a href = "loginView.jsp" >do you already have an account?</a>
   </form>
   </div>   
  </div>
</div>
</div>
</form>
</center>
</body>
</html>