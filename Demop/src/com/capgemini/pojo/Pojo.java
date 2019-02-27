package com.capgemini.pojo;

public class Pojo {
 private String email;
 private String password;
 private String mobile;
 private String username;
public Pojo(String email, String password, String mobile, String username) {
	super();
	this.email = email;
	this.password = password;
	this.mobile = mobile;
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
 
}

