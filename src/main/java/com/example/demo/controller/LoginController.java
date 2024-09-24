package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	
	@PostMapping("/authenticate")
	public String validateUser(@RequestParam("username")String username, @RequestParam("password")String password, Model model) {
		
		if( loginService.isLoggedIn(username, password) ) {
			model.addAttribute("username", username);
			return "success";
		}
		else {
			return "failure";
		}
		
	}

}
