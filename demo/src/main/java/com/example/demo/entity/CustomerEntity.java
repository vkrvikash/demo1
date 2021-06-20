package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	private String customerName;
	
	public CustomerEntity() {

	}
	
	public CustomerEntity(Long id, String customerName) {
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
