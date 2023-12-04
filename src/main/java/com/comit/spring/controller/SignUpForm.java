package com.comit.spring.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpForm {
	
	@GetMapping("/")
	String show() {
		System.out.println("Showing login form");
		
		return "login_form";
	}
	
}
