package com.comit.spring.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comit.spring.bean.Fee;
import com.comit.spring.service.FeeService;
import com.comit.spring.service.UserService;

import ch.qos.logback.classic.Logger;



@Controller
public class FeeController {
	
//	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	FeeService feeService;

	@GetMapping("/addfee")
	String show() {
		System.out.println("Showing Home Page");
		
		return "add_fee";
	}
	
	@GetMapping("/search")
	String show1() {
		System.out.println("Showing Search Page");
		
		return "search_record";
	}
	
	@PostMapping("/addfee") 
	String addFees(Fee fee) {
  
//		this.logger.debug("Sucees");
		this.feeService.addFees(fee);
			return "fee_success";
		}
	
	
}
