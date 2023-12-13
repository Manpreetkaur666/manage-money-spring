package com.comit.spring.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comit.spring.bean.Fee;

public class FeeMapper implements RowMapper<Fee> {

	@Override
    public Fee mapRow(ResultSet rs, int rowNum) throws SQLException {

        Fee fee = new Fee();

        fee.setDate(rs.getDate("DATE"));
        fee.setReceiptNo(rs.getInt("RECEIPT_NO"));
        fee.setStudId(rs.getInt("STUDENT_ID"));
        fee.setStudName(rs.getString("STUDENT_NAME"));
        fee.setPaymentMode(rs.getString("PAYMENT_MODE"));
        fee.setPaymentYearFrom(rs.getInt("PAYMENT_YEAR_FROM"));
        fee.setPaymentYearTo(rs.getInt("PAYMENT_YEAR_TO"));
        fee.setCourse(rs.getString("COURSE"));
        fee.setRemark(rs.getString("REMARK"));
        fee.setTotal(rs.getDouble("TOTAL"));
    

        return fee;
    }
}
