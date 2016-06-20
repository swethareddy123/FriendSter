package com.bvrit.friendster.bean;

public class detailsBean {

	String username;
	String email;
	String phoneno;
	
	
	
	public detailsBean() {
		super();
	}

	
	public detailsBean(String username, String email,
			String phoneno) {
		super();
	
		this.username = username;
		this.email = email;
		this.phoneno = phoneno;
		
	}
    

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

