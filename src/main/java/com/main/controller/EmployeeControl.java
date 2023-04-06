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

import com.main.entity.EmployeeEntity;
import com.main.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeControl {
	@Autowired
	private EmployeeService service;
	
	//Retrieve all Data
		@GetMapping("/EmployeeEntity")
		public List<EmployeeEntity> list()
		{
			return service.listAll();
		}
		//Retrieve specific data from DB
		@GetMapping("/EmployeeEntity/{id}")
		public ResponseEntity<EmployeeEntity> get(@PathVariable Integer id)
		{
			EmployeeEntity entityObj = service.get(id);
			return new ResponseEntity<EmployeeEntity>(entityObj, HttpStatus.OK);
		}
		//Create Data 
		@PostMapping("/EmployeeEntity")
		public void add(@RequestBody EmployeeEntity entityObj)
		{
			service.save(entityObj);
		}
		
		//Update Data in DB
		@PutMapping("/EmployeeEntity/{id}")
		public ResponseEntity<?> update(@RequestBody EmployeeEntity entityObj ,@PathVariable Integer id)
		{		
			try {
				EmployeeEntity existEntityObj = service.get(id);
				service.save(entityObj);
				return new ResponseEntity<EmployeeEntity>(existEntityObj,HttpStatus.OK);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		//Delete Operation
		@DeleteMapping("/EmployeeEntity/{id}")
		public void delete(@PathVariable Integer id)
		{
			service.delete(id);
		}
		

}
