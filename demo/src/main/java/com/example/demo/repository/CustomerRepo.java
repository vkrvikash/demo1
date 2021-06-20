package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerEntity;


@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, Long> {

}
