package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{

}
