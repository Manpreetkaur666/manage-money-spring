package com.comit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.comit.spring.bean.Fee;
import com.comit.spring.bean.User;
import com.comit.spring.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	String showLogin() {
		System.out.println("Showing login form");
		
		return "login_form";
	}
	
	@GetMapping("/signup")
	String showSignUp() {
		System.out.println("Showing SignUp form");
		
		return "signup_form";
	}
	
	@GetMapping("/home")
	String showHome() {
		System.out.println("Showing Home Page");
		
		return "home";
	}
	
	@PostMapping("/signup") 
	String addUser(User user) {
  
		this.userService.addUser(user);
			return "fee_success";
		}
	

}
