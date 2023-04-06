package com.main.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.entity.EmployeeEntity;
import com.main.repositories.EmployeeRepository;
@Service
@Transactional
@ComponentScan(value = {"com.main.repositories.EmployeeRepository"})
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	public List<EmployeeEntity> listAll() {
		return repository.findAll();
		}
	public EmployeeEntity get(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
		
	}

	public void save(EmployeeEntity entityObj) {
		// TODO Auto-generated method stub
		repository.save(entityObj);
	}
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	
	

}
