package com.comit.spring.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.spring.bean.Course;
import com.comit.spring.bean.Fee;
import com.comit.spring.dao.FeeDao;
import com.comit.spring.dao.mapper.FeeMapper;

@Service
public class FeeService {
	
	@Autowired
	FeeDao feeDao;
	
public void addFees(Fee fee) {
		
		this.feeDao.addFees(fee);

	}

public List<Fee> listFees() {
    List<Fee> fees = this.feeDao.listFees();
    /*
     * Apply some business logic to the course list;
     */
    return fees;
}

public Fee findFee(int receiptNo) {
    return this.feeDao.findFee(receiptNo);
}

}
