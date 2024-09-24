package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserLogin;
import com.example.demo.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserRepository userRepo;
	
	/*
	 @Autowired
	 public LoginServiceImpl(UserRepository userRepo) {
	  		this.userRepo = userRepo;
	 }
	 */
	
	@Override
	public boolean isLoggedIn(String username, String password) {
		
		Optional<UserLogin> opt = userRepo.findById(username);
		boolean flag = false;
		
		if( opt.isPresent() ) {
			UserLogin userLogin = opt.get();
			if( userLogin.getPassword().equals(password) && userLogin.getStatus().equalsIgnoreCase("Active"))
				flag = true;
		}
		
		return flag;
	}

}
