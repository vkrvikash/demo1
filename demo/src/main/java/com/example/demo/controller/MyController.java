package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.repository.CustomerRepo;


//RestController annotation is applied to a class to mark it as a request handler, 
//and Spring will do the building and provide the RESTful web service at runtime
@RestController
public class MyController {
	
	@Autowired
	CustomerRepo cRepo;
	
	@GetMapping("/myFirstApi")
	public String testApi(){
		return "Hello , API test Successful";
	}
	
	@PostMapping("/saveCustomer")
	public CustomerEntity saveCust(@RequestBody CustomerDao customerDao) {
		
		//CustomerEntity customerEntity = null;
		//customerEntity = new CustomerEntity(customerDao.getId(), customerDao.getCustomerName());
		
		CustomerEntity customerEntity = new CustomerEntity();
		//customerEntity.setId(customerDao.getId());
		customerEntity.setCustomerName(customerDao.getCustomerName());
		return cRepo.save(customerEntity);
	}
}
