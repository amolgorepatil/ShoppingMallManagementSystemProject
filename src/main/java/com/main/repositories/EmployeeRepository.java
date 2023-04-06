package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
