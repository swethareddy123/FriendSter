<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>login_page</title>
  <meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>

<body >
<center><img src="https://images.cooltext.com/4693940.png" width="628" height="130" alt="Friendster" /></center>
<h1 class = "text-center">POST</h1>
<div class="container" >
  <div class="jumbotron">
  <form method="post" action = "upload"
                        enctype="multipart/form-data">
    <input type="file" name="file" size="50" /><br/>
   <b> <button type="button" class="btn btn-primary">UPLOAD IMAGE</button> </b>
  </form>
   <div class="form-group">
  <label for="comment">Status:</label>
  <textarea class="form-control" rows="5" id="comment"></textarea>
  </div>
   <center>
   <b> <button type="button" class="btn btn-primary">Post</button> </b> 
   </center>
  </body>
 </html>