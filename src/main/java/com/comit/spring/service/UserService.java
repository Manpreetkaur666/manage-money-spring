package com.comit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.spring.bean.Fee;
import com.comit.spring.bean.User;
import com.comit.spring.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
public void addUser(User user) {
		
		this.userDao.addUser(user);

	}

}
