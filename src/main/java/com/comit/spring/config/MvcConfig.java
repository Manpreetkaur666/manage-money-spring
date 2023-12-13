package com.comit.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{
	
	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addViewController("/login").setViewName("login_form");
		registry.addViewController("/logout").setViewName("logout_form");
		registry.addViewController("/").setViewName("home");
	}

}
