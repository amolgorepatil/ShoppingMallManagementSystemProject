package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.CustomerEntity;
import com.main.service.CustomerService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class CustomerControl {
	@Autowired
	private CustomerService service;	
	
	//Retrieve all Data
	@GetMapping("/CustomerEntity")
	public List<CustomerEntity> list()
	{
		return service.listAll();
	}
	
	//Retrieve specific data from DB
	@GetMapping("/CustomerEntity/{id}")
	public ResponseEntity<CustomerEntity> get(@PathVariable Integer id)
	{
		CustomerEntity entityObj = service.get(id);
		return new ResponseEntity<CustomerEntity>(entityObj, HttpStatus.OK);
	}
	
	
	//Create Data 
	@PostMapping("/CustomerEntity")
	public void add(@RequestBody CustomerEntity entityObj)
	{
		service.save(entityObj);
	}
	
	//Update Data in DB
	@PutMapping("/CustomerEntity/{id}")
	public ResponseEntity<?> update(@RequestBody CustomerEntity entityObj ,@PathVariable Integer id)
	{		
		try {
			CustomerEntity existEntityObj = service.get(id);
			service.save(entityObj);
			return new ResponseEntity<CustomerEntity>(existEntityObj,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete Operation
	@DeleteMapping("/CustomerEntity/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	

}
