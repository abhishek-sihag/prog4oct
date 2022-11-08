package com.example.demo.dto;

import lombok.Data;

//Data Transfer Objects (DTOs) in Java are objects that transport data between subsystems.

@Data
public class LoginOutputDto {

	private String email;
	private String role;
	private boolean isLogin; //for successful login

}
