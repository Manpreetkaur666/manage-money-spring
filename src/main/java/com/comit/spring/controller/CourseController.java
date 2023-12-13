package com.comit.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comit.spring.bean.Course;
import com.comit.spring.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/edit")
	ModelAndView listCourses() {
		System.out.println("Showing Edit Page");
		
		List<Course> courses = this.courseService.listCourses();

        return new ModelAndView("edit_course","courses",courses);
		
	}

//	@GetMapping("/report")
//	ModelAndView showReport() {
//		System.out.println("Showing Report Page");
//		
//		List<Course> courses = this.courseService.listCourses();
//
//        return new ModelAndView("view_report","courses",courses);
//	}
	
	@PostMapping("/addcourse") 
	String addCourse(Course course) {
 
		this.courseService.addCourse(course);
			return "redirect:/edit";
		}
	
	  @GetMapping("/update/{id}")
	    ModelAndView showUpdate(@PathVariable int id) {

//	        this.logger.debug("Showing the Update User Page...");

	        Course course = this.courseService.findCourse(id);
	        
	        List<Course> courses = this.courseService.listCourses();
	        
	        ModelAndView mv = new ModelAndView("edit_course"); // HTML Template name.
	        mv.addObject("courses", courses);
	        mv.addObject("course", course);
	        
	        return mv;

//	        return new ModelAndView("edit_course","courses",courses, "course", course);
	    }
	
	
    @PostMapping("/update")
    ModelAndView updateCourse(Course course) {

//        if (result.hasErrors()) {
//            return "redirect:/edit";
//        }
    	
    	System.out.println(course);
    	
        this.courseService.updateCourse(course);
        
        List<Course> courses = this.courseService.listCourses();
        
        return new ModelAndView("edit_course","courses",courses);
    }
    
    
    @PostMapping("/delete/{id}")
    ModelAndView deleteCourse(@PathVariable int id) {

//        this.logger.debug("Deleting User... , idUser: {}", id);

        this.courseService.deleteCourse(id);

        List<Course> courses = this.courseService.listCourses();
        
        return new ModelAndView("edit_course","courses",courses);
    }
    
    
	
}
