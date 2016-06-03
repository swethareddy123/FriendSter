package com.bvrit.friendster.bean;
public class SuggestedBean {
int friendId;
String fname;
String lname;
String phoneno;
String email;
String username;
String password;
String image;

public SuggestedBean() {
    super();
    // TODO Auto-generated constructor stub
}
public SuggestedBean(int friendId, String fname,String lname,String phoneno, String email, String username,    String password, String image) {
    super();
    this.friendId = friendId;
    this.fname = fname;
    this.lname = lname;
    this.phoneno = phoneno;
    this.email = email;
    this.username = username;
    this.password = password;
    this.image = image;
}
public String getfname() {
    return fname;
}
public void setfname(String fname) {
    this.fname = fname;
}
public String getlname() {
    return lname;
}
public void setlname(String lname) {
    this.lname = lname;
}

public int getFriendId() {
    return friendId;
}
public void setFriendId(int friendId) {
    this.friendId = friendId;
}
public String getusername() {
    return username;
}
public void setusername(String username) {
    this.username = username;
}
public String getemail() {
    return email;
}
public void setemail(String email) {
    this.email = email;
}
public String getphoneno() {
    return phoneno;
}
public void setphoneno(String phoneno) {
    this.phoneno = phoneno;
}
public String getpassword() {
    return password;
}
public void setpassword(String password) {
    this.password = password;
}
public String getimage() {
    return image;
}
public void setimage(String image) {
    this.image = image;
}

}