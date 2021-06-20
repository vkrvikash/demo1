package com.example.demo.dao;

import javax.persistence.Id;

public class CustomerDao {

	private Long id;
	private String customerName;
	
	public CustomerDao() {

	}
	
	public CustomerDao(Long id, String customerName) {
		this.id = id;
		this.customerName = customerName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
