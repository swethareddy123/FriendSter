<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page = "links.html"></jsp:include>
<head>
<center><h1>Privacy Settings</h1></center>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="form-group">
       <label for ="profile" class = "text-left">Profile:</label><br>
       <label><input type="radio" name="optprofile">Visible to All</label>
       <label><input type="radio" name="optprofile">Visible to my friends</label>
   </div><br>
   <div class="form-group">
       <label for ="status" class = "text-left">Status:</label><br>
       <label><input type="radio" name="optstatus">Visible to All</label>
       <label><input type="radio" name="optstatus">Visible to my friends</label>
   </div>
</body>
</html>