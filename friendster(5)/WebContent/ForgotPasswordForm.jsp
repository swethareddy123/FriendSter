<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8"></head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<body>
<script language="javascript">
function fncSubmit()
{

if(document.ForgotPasswordForm.email.value == "")
{
alert('Please input emailid');
document.ForgotPasswordForm.email.focus();
return false;
}

if(document.ForgotPasswordForm.newpassword.value == "")
{
alert('Please input Password');
document.ForgotPasswordForm.newpassword.focus();
return false;
}

if(document.ForgotPasswordForm.conpassword.value == "")
{
alert('Please input Confirm Password');
document.ForgotPasswordForm.conpassword.focus();
return false;
}

if(document.ForgotPasswordForm.newpassword.value != document.ForgotPasswordForm.conpassword.value)
{
alert('Confirm Password Not Match');
document.ForgotPasswordForm.conpassword.focus();
return false;
}

document.ForgotPasswordForm.submit();
}
</script>
<form name="ForgotPasswordForm" method="post" action="ProcessForgotPWD.jsp" OnSubmit="return fncSubmit();">
<center><img src="https://images.cooltext.com/4693940.png" width="628" height="130" alt="Friendster" /></center>
<div class="container">
<div class="row">
<div class="row">
<div class="col-md-4 col-md-offset-4">
<div class="panel panel-default">
<div class="panel-body">
<div class="text-left">
<h2 class="text-center">Forgot Password?</h2>
<center><p>You can reset your password here.</p></center>

<div class="panel-body">
  <form class="form">
  <fieldset>
  <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" name = email placeholder="Enter email" required>
    </div>
    <div class="form-group">
      <label for="newpassword">NewPassword:</label>
      <input type="password" class="form-control" id="newpassword" name = newpassword placeholder="Enter password" required>
    </div>
     <div class="form-group">
      <label for="conpassword">Password:</label>
      <input type="password" class="form-control" id="conpassword" name = conpassword placeholder="Enter password" required>
    </div>
  <div class="form-group">
      <b><form action = "ProcessForgotPWD.jsp"><button class="btn btn-lg btn-primary" type="submit">Save My Changes</button></b>
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
<!--<div class="container">
 <div class = "row">
 <div class="col-sm-6 col-md-4 col-md-offset-4">
<center><h1>FriendSter</h1></center>
 <div class = "well">
  
 <label for="email">Email:</label>
<input name="email" type="email" id="email" size="20">
 <label for="newpassword">Password:</label>
<input name="newpassword" type="password" id="newpassword">
 <label for="conpassword">ConfirmPassword:</label>
<input name="conpassword" type="password" id="conpassword">

<input type="submit" name="Submit" value="Save">



</form>
</div>-->
<center><INPUT TYPE="button" class="btn btn-primary" VALUE="Back" onClick="history.go(-1);"></center>
</body>
</html>