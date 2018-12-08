package com.mvc.bean;

import java.io.Serializable;

public class RegisterBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -33486448318831597L;
	private String fullName;
	private String email;
	private String userName;
	private String password;
	private String conformPass;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConformPass() {
		return conformPass;
	}
	public void setConformPass(String conformPass) {
		this.conformPass = conformPass;
	}
	
}
