<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%@include  file="links.html" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"></head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<body>
<script language="javascript">
function fncSubmit()
{

if(document.ChangePasswordForm.password.value == "")
{
alert('Please input old password');
document.ChangePasswordForm.password.focus();
return false;
}

if(document.ChangePasswordForm.newpassword.value == "")
{
alert('Please input Password');
document.ChangePasswordForm.newpassword.focus();
return false;
}

if(document.ChangePasswordForm.conpassword.value == "")
{
alert('Please input Confirm Password');
document.ChangePasswordForm.conpassword.focus();
return false;
}

if(document.ChangePasswordForm.newpassword.value != document.ChangePasswordForm.conpassword.value)
{
alert('Confirm Password Not Match');
document.ChangePasswordForm.conpassword.focus();
return false;
}

document.ChangePasswordForm.submit();
}
</script>
<form name="ChangePasswordForm" method="post" action="ProcessChangePWD.jsp" OnSubmit="return fncSubmit();">
<center><img src="https://images.cooltext.com/4693940.png" width="628" height="130" alt="Friendster" /></center>
<div class="container">
<div class="row">
<div class="row">
<div class="col-md-4 col-md-offset-4">
<div class="panel panel-default">
<div class="panel-body">
<div class="text-left">
<h2 class="text-center">Change Password</h2>
<p>You can reset your password here.</p>
<div class="panel-body">
  <form class="form">
  <fieldset>
  <div class="form-group">
  <label for="oldpassword" class = "text-left">Enter Old password :</label>
  <div class="input-group">
      <input type ="password" placeholder="old password" name = oldpassword class="form-control" requeried>
  </div><br>
  <div class="form-group">
      <label for="newpassword" class = "text-left">New Password:</label>
      <input type="password" class="form-control" id="newpassword" name  =newpassword placeholder="new password">
  </div>
  <div class="form-group">
      <label for="conpassword" class = "text-left">Confirm Password:</label>
      <input type="password" class="form-control" id="conpassword" name = conpassword placeholder="confirm password">
  </div>
  </div>
  <div class="form-group">
      <b><!-- form action = "ProcessChangePWD.jsp"--><button class="btn btn-lg btn-primary" type="submit">Save My Changes</button></b>
  </form>
  </div>
  </fieldset>
  </form>
  </div>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>  
<!--<td>OLD PASSWORD</td>
<TD><input name="password" type="password" id="password" size="20"></td>
</tr>
<tr>
<td>NewPassword</td>
<td><input name="newpassword" type="password" id="newpassword">
</td>
</tr>
<tr>
<td>Confirm Password</td>
<td><input name="conpassword" type="password" id="conpassword">
</td>
</tr>
<tr>
<td>&nbsp;</td>
<td><input type="submit" name="Submit" value="Save"></td>
</tr>

</table>
</form>-->
 <center><INPUT TYPE="button" class="btn btn-primary" VALUE="Back" onClick="history.go(-1);"></center>
</body>
</html>