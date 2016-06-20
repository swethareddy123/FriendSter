<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page = "links.html"></jsp:include>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<div class="col-sm-5">
<%
	String alert = request.getParameter("alert");
	if (alert != null) {
		out.print(alert);
	}
	%>
	<script type="text/javascript">
  function PreviewImage() {
    var oFReader = new FileReader();
    oFReader.readAsDataURL(document.getElementById("fileupload").files[0]);

    oFReader.onload = function(oFREvent) {
      document.getElementById("uploadPreview").src = oFREvent.target.result;
    };
  };
</script>

<body>
<center><div class = "well">
<form method="post" action="uploadprofile" enctype="multipart/form-data" >
<h3>Change ProfilePic:</h3>
Select a picture to upload: <br />

<div  style="width:520px; height: 100%;">
				<img id="uploadPreview" style="width: 100px; height: 100px;" />
				<div align="left"><input  id="fileupload" type="file" name="image" width="150" height="150" onchange="PreviewImage();"/></div><div align="left">
				
				<input type="submit" value="UploadProfile" name ="submit">
				</div>


</form>
<!-- img width='150' height='150' src=./DisplayProfileController?userid=" +  rs.getString("userid") + "></img-->

</div>
</center>
<div>
<form method="post" action="displayprofile" enctype="multipart/form-data" >
<input type="submit" value="Display]Profile" name ="submit">
</div>
</div>

<INPUT TYPE="button" VALUE="Back" onClick="history.go(-1);">
</body>
</html>




