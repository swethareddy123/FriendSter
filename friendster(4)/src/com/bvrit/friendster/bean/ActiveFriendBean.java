package com.bvrit.friendster.bean;

public class ActiveFriendBean {
	String username;
	String dp;
	int userid;
	public String getUsername() {
		System.out.println("username in get "+username);
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
		System.out.println(username);
	}
	public String getDp() {
		return dp;
		
	}
	public void setDp(String dp) {
		this.dp = dp;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public ActiveFriendBean(String username, String dp, int userid) {
		super();
		this.username = username;
		this.dp = dp;
		this.userid = userid;
	}
	public ActiveFriendBean() {
		super();
		// TODO Auto-generated constructor stub
	}
}
