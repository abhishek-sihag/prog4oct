package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginOutputDto;
import com.example.demo.entity.Login;
import com.example.demo.service.ILoginService;

@RestController
public class LoginController {
	
	@Autowired
	ILoginService loginService;

	//for sensitive info don't use PathVariable
	
	@PostMapping("/login")
	ResponseEntity<Login> login(@RequestBody Login credentials) {
		Login login= loginService.login(credentials);
		return new ResponseEntity<>(login, HttpStatus.OK);
	};
	
	@GetMapping("/logout/{email}")
	ResponseEntity<LoginOutputDto> logout(@PathVariable("email") String email) {
		LoginOutputDto outputDto=loginService.logout(email);
		return new ResponseEntity<>(outputDto, HttpStatus.OK);
	};
	
	@PostMapping("/reset/{email}/password")
	Login resetPassword(@PathVariable String email, @RequestBody String newPassword) {
		Login updatedEmail= loginService.resetPassword(email, newPassword);
		return updatedEmail;
		
	};
	
	@GetMapping("/login/getLogin/byEmpId/{empId}")
	ResponseEntity<Login> getLoginByEmpId(@PathVariable int empId) {
		Login login= loginService.getLoginByEmpId(empId);
		return new ResponseEntity<>(login, HttpStatus.OK);
	};

}
