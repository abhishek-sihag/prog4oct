package com.example.demo.service;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LoginOutputDto;
import com.example.demo.entity.Login;
import com.example.demo.exceptions.InvalidCredentialException;
import com.example.demo.exceptions.UserNotFoundException;
import com.example.demo.repository.ILoginRepository;

@Service
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	ILoginRepository loginRepo;
	
	@Override
	public Login login(Login login) {
		//get login details from db
		Optional<Login> opt = loginRepo.findById(login.getEmail());
		Login dbLogin=null;
		if(opt.isPresent()) {
			//compare db password with user provided password
			// if password matching return credentials else throw exception
			dbLogin=opt.get();
			if(login.getPassword().equals(dbLogin.getPassword()) && login.getRole().equals(dbLogin.getRole())){
				dbLogin.setLogin(true);
				loginRepo.save(dbLogin);
			}else {
				throw new InvalidCredentialException("Invalid Credentials");
			}
		}else {
			throw new UserNotFoundException("User not found");
		}
		return dbLogin;
	}

//	@Override
//	public LoginOutputDto login(Login login) {
//		//search user based on email address
//		//if user not found - throw UserNotFoundException
//		//validate password & role 
//		//if role and password matching - return login object
//		// else throw InvalidCredentialException
////		Optional<Login> opt=loginRepo.findById(login.getEmail());
////		
////		if(opt.isPresent()) {
////			
////		}
//		
//		return null;
//	}

	@Override
	public LoginOutputDto logout(String email) {
		 //in place of void use "LoginOutputDto"
		//find login details using email
		Optional<Login> opt= loginRepo.findById(email);
		//update isLogin flag as false
		LoginOutputDto outputDto=new LoginOutputDto();
		if(opt.isPresent()) {
			//get login obj from opt
			Login dbLogin=opt.get();
			
			//convert login obj to LoginOutputDto obj
			dbLogin.setLogin(false);
			Login login=loginRepo.save(dbLogin);
			outputDto.setEmail(login.getEmail());
			outputDto.setLogin(login.isLogin());
			outputDto.setRole(login.getRole());
		}
		return outputDto;
		//return LoginOutputDto

	}

	@Override
	public Login resetPassword(String email, String newPassword) {
		
		return null;
	}

	@Override
	public Login getLoginByEmpId(int empId) {
		Login login=loginRepo.getLoginByEmpId(empId);
		return login;
	}

}
