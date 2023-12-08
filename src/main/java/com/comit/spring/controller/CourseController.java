package com.comit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

	@GetMapping("/report")
	String show() {
		System.out.println("Showing Report Page");
		
		return "search_report";
	}
}
