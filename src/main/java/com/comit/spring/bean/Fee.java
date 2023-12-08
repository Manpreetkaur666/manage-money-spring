package com.comit.spring.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Fee {
	
	int feesId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date date;
	
    int receiptNo;
    int studId;
    String studName;
	String paymentMode;
    int paymentYearFrom;
    int paymentYearTo;
    String course;
	String remark;
    Double total;
    
   
    public int getFeesId() {
		return feesId;
	}
	public void setFeesId(int feesId) {
		this.feesId = feesId;
	}
	

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
	public int getReceiptNo() {
		return receiptNo;
	}
    public void setReceiptNo(int receiptNo) {
		this.receiptNo = receiptNo;
	}
    
    public int getStudId() {
  		return studId;
  	}
  	public void setStudId(int studId) {
  		this.studId = studId;
  	}

  	
  	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	
    
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public int getPaymentYearFrom() {
		return paymentYearFrom;
	}
	public void setPaymentYearFrom(int paymentYearFrom) {
		this.paymentYearFrom = paymentYearFrom;
	}


	public int getPaymentYearTo() {
		return paymentYearTo;
	}
    public void setPaymentYearTo(int paymentYearTo) {
		this.paymentYearTo = paymentYearTo;
	}

    
	public String getCourse() {
			return course;
	}
	public void setCourse(String course) {
			this.course = course;
	}


	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}

}
