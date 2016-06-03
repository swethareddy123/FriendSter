<!DOCTYPE html>
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
<i><h1 class = "text-center">Privacy Settings</h1></i>
<div class="container" >
<div class="well">
<div class="dropdown">
  <label for="statusPrivacy" class = "text-left">Status Privacy : who all can see your status that u hav provided</label><br>
  <div class="radio">
     <label><input type="radio" name="optradio">Public</label>
    </div>
    <div class="radio">
      <label><input type="radio" name="optradio">Friends</label>
    </div>
    <div class="radio">
      <label><input type="radio" name="optradio">Only Me</label>
    </div>
</div> 
</div>
<br>
<div class="well">
<div class="dropdown">
  <label for="profilepicPrivacy" class = "text-left">Profile Pic Privacy : who all can see your profile pic that u hav provided </label><br>
  <div class="radio">
     <label><input type="radio" name="optradio2">Public</label>
    </div>
    <div class="radio">
      <label><input type="radio" name="optradio2">Friends</label>
    </div>
    <div class="radio">
      <label><input type="radio" name="optradio2">Only Me</label>
    </div>
</div> 
</div>
<br>
<div class="well">
<div class="dropdown">
  <label for="contactPrivacy" class = "text-left">Contact Privacy : who all can see your contact that u hav provided</label><br>
  <div class="radio">
     <label><input type="radio" name="optradio1">Public</label>
    </div>
    <div class="radio">
      <label><input type="radio" name="optradio1">Friends</label>
    </div>
    <div class="radio">
      <label><input type="radio" name="optradio1">Only Me</label>
    </div>
</div> 
</div>
<br>
<div class="well">
<div class="dropdown">
  <label for="mailidPrivacy" class = "text-left">Mail Id Privacy : who all can see your mail id that u hav provided</label><br>
  <div class="radio">
     <label><input type="radio" name="optradio3">Public</label>
    </div>
    <div class="radio">
      <label><input type="radio" name="optradio3">Friends</label>
    </div>
    <div class="radio">
      <label><input type="radio" name="optradio3">Only Me</label>
    </div>
</div> 
</div>
</div>
<br>
<center>
<b><form method = "post" action ="homeView.jsp"><button type="submit" class="btn btn-primary">Save Changes</button></form> </b>
</center>
</body>
</html>