package com.getlink.model;

import java.net.URLEncoder;

public class User {
	private String userEmail;
	private String userpassword;
	
	public User(String userEmail, String userPassword){
		this.userEmail = userEmail;
		this.userpassword = userPassword;
	}
	
	@SuppressWarnings("deprecation")
	public String getLoginData(String fs){
		String data = "_csrf-app="
				+ fs
				+ "&LoginForm"
				+ URLEncoder.encode("[email]")
				+ "="
				+ URLEncoder.encode(userEmail)
				+ "&LoginForm"
				+ URLEncoder.encode("[password]")
				+ "="
				+ URLEncoder.encode(userpassword)
				+ "&LoginForm"
				+ URLEncoder.encode("[rememberMe]")
				+ "=0"
				+ "&LoginForm"
				+ URLEncoder.encode("[rememberMe]")
				+ "=1";
		return data;
	}
}
