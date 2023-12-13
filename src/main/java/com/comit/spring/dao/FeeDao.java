package com.comit.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comit.spring.bean.Fee;
import com.comit.spring.dao.mapper.FeeMapper;

@Repository
public class FeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addFees(Fee fee) {	
		String sql = "INSERT INTO FEES (DATE, RECEIPT_NO, STUDENT_ID, STUDENT_NAME, PAYMENT_MODE, PAYMENT_YEAR_FROM, PAYMENT_YEAR_TO, COURSE, REMARK, TOTAL) VALUES(?,?,?,?,?,?,?,?,?,?)";
			this.jdbcTemplate.update(sql, fee.getDate(), fee.getReceiptNo(),fee.getStudId(), fee.getStudName(), fee.getPaymentMode(), fee.getPaymentYearFrom(), fee.getPaymentYearTo(), fee.getCourse(), fee.getRemark(), fee.getTotal());
	}
	
	
	   public List<Fee> listFees() {	
	    	String sql = "SELECT * FROM FEES";
	        return this.jdbcTemplate.query(sql, new FeeMapper());
	    }
	   
	   
	   public Fee findFee(int receiptNo) {
	         String sql = "SELECT * FROM FEES WHERE RECEIPT_NO = ?";
	         return DataAccessUtils.singleResult(this.jdbcTemplate.query(sql, new FeeMapper(), receiptNo));
	     }
	   
	   
//	   public String findTotal(String courseName) {
////		   SELECT SUM(TOTAL) as sum FROM FEES WHERE COURSE = 'JAVA';
//		   String sql = "SELECT SUM(TOTAL) as sum FROM FEES WHERE COURSE = ?";
//		   System.out.println(sql);
//		   return this.jdbcTemplate.query(sql,new Object[]{courseName},String.class);
//	   }
}

