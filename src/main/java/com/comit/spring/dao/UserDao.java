package com.comit.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.comit.spring.bean.User;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addUser(User user) {
		
		String sql = "INSERT INTO USER (FIRST_NAME, LAST_NAME, EMAIL, PASSWORD) VALUES(?,?,?,?)";
		
		this.jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
		
//		return jdbcTemplate.update("INSERT INTO FEES (DATE, RECEIPT_NO, PAYMENT_MODE, PAYMENT_YEAR_FROM, PAYMENT_YEAR_TO, COURSE, REMARK, TOTAL) VALUES(?,?,?,?,?,?,?,?)",
//		        new Object[] { fee.getDate(), fee.getReceiptNo(), fee.getPaymentMode(), fee.getPaymentYearFrom(), fee.getPaymentYearTo(), fee.getCourse(), fee.getRemark(), fee.getTotal() });
//	}
	}

}
