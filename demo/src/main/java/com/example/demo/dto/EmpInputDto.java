package com.example.demo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EmpInputDto {
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min=2, message="Min length must be 2 charectersf")
	private String empName;
	@Email
	private String email;
	@Pattern(regexp="[0-9a-zA-Z]{3,8}", message="password length must be min 3 chars and max 8 chars")
	private String password;
	@NotNull
	@NotEmpty
	@NotBlank
	private String role;
	
	//@Min(2000) - dob - 2000 & 2020
	//@Max(2020)

}
