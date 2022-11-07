package com.jpa.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	//fields
	@Id   //don't give space after this Id & @GeneratedValue can't use for String 
	private String email;
	//here you can give space
	private String password;
	
	
	//constructors
	public Login() {}
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	//getters setters
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
	
	//toString method
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}
	
	
	

}
