package com.comit.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comit.spring.bean.Fee;

@Repository
public class FeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addFees(Fee fee) {
		
		String sql = "INSERT INTO FEES (DATE, RECEIPT_NO, STUDENT_ID, STUDENT_NAME, PAYMENT_MODE, PAYMENT_YEAR_FROM, PAYMENT_YEAR_TO, COURSE, REMARK, TOTAL) VALUES(?,?,?,?,?,?,?,?,?,?)";
		
		this.jdbcTemplate.update(sql, fee.getDate(), fee.getReceiptNo(),fee.getStudId(), fee.getStudName(), fee.getPaymentMode(), fee.getPaymentYearFrom(), fee.getPaymentYearTo(), fee.getCourse(), fee.getRemark(), fee.getTotal());
		
//		return jdbcTemplate.update("INSERT INTO FEES (DATE, RECEIPT_NO, PAYMENT_MODE, PAYMENT_YEAR_FROM, PAYMENT_YEAR_TO, COURSE, REMARK, TOTAL) VALUES(?,?,?,?,?,?,?,?)",
//		        new Object[] { fee.getDate(), fee.getReceiptNo(), fee.getPaymentMode(), fee.getPaymentYearFrom(), fee.getPaymentYearTo(), fee.getCourse(), fee.getRemark(), fee.getTotal() });
//	}
	}
}


// import org.springframework.dao.support.DataAccessUtils;