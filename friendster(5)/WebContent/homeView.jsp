<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.bvrit.friendster.dao.*"%>
<%@ page import="java.util.*"%>

<%@page import="com.bvrit.friendster.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
#nav{
    line-height:20px;
    background-color:#FFFFFF;
    height:1000px;
    width:300px;
    float:left;
    padding:5px;
    align:left;
}

#section {
    width:700px;
    float:left;
    padding:20px;
}
</style>
<head>
<jsp:include page = "links.html"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
  <div id = "nav">
     <div class = "well">
        <div id=wrapper style="width:180px; height: 100%;">
        <label class=sgames>Suggested Games</label><br>
		<div><a href="https://king.com/#!/play/candycrush"><img align="left" alt="userpic" class="img-circle" src="./Img/Candy_Crush.png" width="25" height="25">Candy crush</a></div><br><br>
		<div><a href="http://2048game.com/"><img align="left" alt="userpic" src="./Img/2048.png" class="img-circle" width="25" height="25">2048</a></div><br><br>
		<div><a href="http://k2t2.com/subway-surfers-online-game/"><img align="left" alt="userpic" class="img-circle" src="./Img/Subway_Surfers.png" width="25" height="25">Subway surfers</a></div><br><br>
		 <div><a href="http://www.a10.com/action-games/run-kaiju-run?fullscreen=true"><img align="left" class="img-circle" alt="userpic" src="./Img/kaiju.jpeg" width="25" height="25">run-kaiju-run</a></div><br><br>
      </div>
      </div>
      <div id = "nav">
      <div class = "well">
        <div id=wrapper style="width:180px; height: 100%;">
        <label class=sgames>Suggested Pages</label><br>
		<div><a href="http://bvrithyderabad.edu.in/"><img align="left" alt="userpic" class="img-circle" src="http://vishnu.edu.in/uploadnews/logo.jpg" width="25" height="25">BVRITH</a></div><br><br>
		<div><a href="https://www.talentsprint.com/"><img align="left" alt="userpic" src="data:image/png;base64,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" class="img-circle" width="25" height="25">Talentsprint</a></div><br><br>
		<div><a href="http://www.jntuh.ac.in/new/"><img align="left" alt="userpic" class="img-circle" src="data:image/jpeg;base64,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" width="25" height="25">JNTUH</a></div><br><br>
		 
      </div>
    </div>
  </div>
  </div>
  <div id = "section">
    
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

			<form method="post" action="addpost" enctype="multipart/form-data">
				<div id=wrapper style="width:500px; height: 100%;">
				<div><textarea class="form-control" rows="3" cols="50" name="comment" placeholder="Write something about this post"></textarea></div><div><img id="uploadPreview" style="width: 50px; height: 50px;" /></div>
				<div align="left"><input id="fileupload" type="file" name="img" width="100" height="100" onchange="PreviewImage();"/></div><div align="right"><input type="submit" value="Post"></div>
				</div>
			
			</form>
<style id="jsbin-css">
.like{
  border-radius:4px;
  text-align:center;
  display:inline-block;
  padding:3px 10px;
   
  background:white;
  cursor:pointer;
  
}
.userLikes{
  
  color:#5CB8E6;
}
 
  span.glyphicon-thumbs-up {
    font-size: 1.8em;
}</style>			
 <!-- %@ taglib url="http://java.sun.com/jsp/jstl/core" prefix="c"  %--> 
 <c:forEach var = "item" items="${list}">
 <br><div></div>
 
<div id=wrapper style="width:500px; height: 100%;">
<div><a class=sgames href="viewProfile.jsp"><img align="left" class="img-circle" alt="userpic" src=".${item.dp}" width="30" height="30"><div align="left" >${item.username}</div></a><p style="font-style:italic;color: blue;" align="left">${item.dateTime}</p></div><br>
 
<p align="left">${item.comment}</p><br>
       <a href="<c:url value='${item.image}'/>" class="thumbnail"> 
    
  
 
 <img  style="width:300px;height:300px"  src = "<c:url value='${item.image}'/>"/>
</a>
  
<span class="like"><span class="glyphicon glyphicon-thumbs-up"></span>Like</span>   


</div>
  
 </c:forEach>

<script id="jsbin-javascript">
$('.like').click(function(){
  var val = $(this).text();
  $(this).toggleClass('userLikes');
  return $(this).hasClass('userLikes') ? like(this,val) : dislike(this,val);
});
</script>
</div>
    </div>
  </div>
  <div class="col-sm-3 " id="wrapper" style="width:250px; height: 100%;">
		
			<input placeholder="search friends" type=text id="filter"
				name="search"><button type="submit"
					class="glyphicon glyphicon-search"></button>

		<br>

		<%
		
			String msg = request.getParameter("msg");
			String msg2 = request.getParameter("msg2");
			if (msg != null) {
				out.print(msg);
			}
			if (msg2 != null) {
				out.print(msg2);
			}
		%>

	<h2 class=h2>Suggested Friends</h2>

<% String username = (String)session.getAttribute("user1"); %>
<%



System.out.println("userdao call");
UserDAO ud = new UserDAO();

List<SuggestedBean> suggested = ud.SuggestedFriends(username);
System.out.println("calling method list getimg");
ListIterator<SuggestedBean> suggestedlist = suggested.listIterator();
System.out.println("iterator");

%><table class=table><%
while (suggestedlist.hasNext()){
	SuggestedBean sb = suggestedlist.next();
	out.print("<form name='form1' action=FriendController?friendId="
							+ sb.getuserid()
							+ "><tbody class=searchable><tr><td>"
							+ "<img width=30 height=30 class=img-circle src=."+sb.getimage()+" alt=dp>"+ sb.getusername()
							+ "</td><td align=right><input type=hidden name = friendId value = "
							+ sb.getuserid()
							+ ">"
							+ "<input type = submit value='send request' onClick='form1.SubmitButton.disabled=true;'></td></tr></tbody></form>");
	
}

%>
</table>
	</div>
	
}

%>
</table>
	</div>
	
	
</body>
</html>