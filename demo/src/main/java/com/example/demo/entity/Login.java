package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
public class Login {
	
	@Id
	@Email
	private String email;
	@Pattern(regexp="[a-zA-z0-9]{8,16}", message="password length must be between 8 to 16 characters")
	private String password;
	@NotNull
	@NotEmpty
	@NotBlank //not accept any spaces
	private String role; //null
	private boolean isLogin; //false

}
