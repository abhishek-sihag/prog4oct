package com.example.demo.service;

import com.example.demo.dto.LoginOutputDto;
import com.example.demo.entity.Login;

public interface ILoginService {
	//LoginOutputDto login(Login login); //import for successful login
	Login login(Login login);
	LoginOutputDto logout(String email);
	Login resetPassword(String email, String newPassword);
	Login getLoginByEmpId(int empId);
	
	

}
