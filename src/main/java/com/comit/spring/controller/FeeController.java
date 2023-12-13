package com.comit.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comit.spring.bean.Course;
import com.comit.spring.bean.Fee;
import com.comit.spring.dao.CourseDao;
import com.comit.spring.service.FeeService;
import com.comit.spring.service.UserService;

import ch.qos.logback.classic.Logger;



@Controller
public class FeeController {
	
//	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	FeeService feeService;
	@Autowired
	CourseDao courseDao;

	@GetMapping("/addfee")
	String show(Model model) {
		System.out.println("Showing Home Page");
		
		List<Course> courses = courseDao.listCourses();
//		System.out.println(courses);
		model.addAttribute("courses", courses);
       
		return "add_fee";
	}
	
	@PostMapping("/addfee") 
	String addFees(Fee fee) {
  
		this.feeService.addFees(fee);
			return "fee_success";
		}
	
//	@GetMapping("/search")
//	String showSearch() {
//		
//		return "search_record";
//	}
	
	@GetMapping("/search")
	String showSearch(Model model, @Param("keyword") String keyword) {
		System.out.println(keyword);
		System.out.println("Showing Search Page");
		
		if(keyword != null) {
			Fee fee = this.feeService.findFee(Integer.parseInt(keyword));
			model.addAttribute("fee", fee);
		}

		else {
			System.out.println("No value passed");
		}
		
		return "search_record";

	}
	
	
	@GetMapping("/report")
	String showReport(Model model) {
		System.out.println("Showing Report Page");
		
		List<Course> courses = courseDao.listCourses();
//		System.out.println(courses);
		model.addAttribute("courses", courses);

        return "view_report";
	}
	
	
	


	
}
