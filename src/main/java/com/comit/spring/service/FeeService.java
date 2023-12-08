package com.comit.spring.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.spring.bean.Fee;
import com.comit.spring.dao.FeeDao;

@Service
public class FeeService {
	
	@Autowired
	FeeDao feeDao;
	
public void addFees(Fee fee) {
		
		this.feeDao.addFees(fee);

	}

//private void validateFee(Fee fee) {
//	if(fee.getPaymentMode().isEmpty() || fee.getPaymentYearFrom().isEmpty()) {
//		throw new RuntimeException("Invalid fee data" + fee);
//	}
//		
//}

}
