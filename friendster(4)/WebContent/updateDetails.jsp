<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 

 String username =(String)session.getAttribute("user1");
if(username == null){
	response.sendRedirect("loginView.jsp");
}
%>

<html>
<head>
<jsp:include page = "links.html"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method = "post" action = "updatedetails">

<b>NAME</b><input type = text name = username><br>
<br>
<b>Email</b><input type = text name = email ><br>
<br>
<b>Phone</b><input type = text name = phoneno ><br>
<br>
<input type = "submit" name = "UpdateDetails" value = "UpdateDetails" style ="background-color:#00FFFF">
</form>
<INPUT TYPE="button" VALUE="Back" onClick="history.go(-1);">
</body>
</html>