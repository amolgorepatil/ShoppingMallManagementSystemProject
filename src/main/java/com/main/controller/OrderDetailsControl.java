package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.OrderDetailsEntity;
import com.main.service.OrderDetailsService;

@RestController
@RequestMapping("/api")
public class OrderDetailsControl {
	@Autowired
	private OrderDetailsService service;	
	
	//Retrieve all Data
	@GetMapping("/OrderDetailsEntity")
	public List<OrderDetailsEntity> list()
	{
		return service.listAll();
	}
	
	//Retrieve specific data from DB
	@GetMapping("/OrderDetailsEntity/{id}")
	public ResponseEntity<OrderDetailsEntity> get(@PathVariable Integer id)
	{
		OrderDetailsEntity entityObj = service.get(id);
		return new ResponseEntity<OrderDetailsEntity>(entityObj, HttpStatus.OK);
	}
	
	
	//Create Data 
	@PostMapping("/OrderDetailsEntity")
	public void add(@RequestBody OrderDetailsEntity entityObj)
	{
		service.save(entityObj);
	}
	
	//Update Data in DB
	@PutMapping("/OrderDetailsEntity/{id}")
	public ResponseEntity<?> update(@RequestBody OrderDetailsEntity entityObj ,@PathVariable Integer id)
	{		
		try {
			OrderDetailsEntity existEntityObj = service.get(id);
			service.save(entityObj);
			return new ResponseEntity<OrderDetailsEntity>(existEntityObj,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete Operation
	@DeleteMapping("/OrderDetailsEntity/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
}
