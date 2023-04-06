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

import com.main.entity.UserEntity;
import com.main.service.UserService;

@RestController
@RequestMapping("/api")
public class UserControl {

	@Autowired
	private UserService service;	
	
	//Retrieve all Data
	@GetMapping("/UserEntity")
	public List<UserEntity> list()
	{
		return service.listAll();
	}
	
	//Retrieve specific data from DB
	@GetMapping("/UserEntity/{id}")
	public ResponseEntity<UserEntity> get(@PathVariable Integer id)
	{
		UserEntity entityObj = service.get(id);
		return new ResponseEntity<UserEntity>(entityObj, HttpStatus.OK);
	}
	
	
	//Create Data 
	@PostMapping("/UserEntity")
	public void add(@RequestBody UserEntity entityObj)
	{
		service.save(entityObj);
	}
	
	//Update Data in DB
	@PutMapping("/UserEntity/{id}")
	public ResponseEntity<?> update(@RequestBody UserEntity entityObj ,@PathVariable Integer id)
	{		
		try {
			UserEntity existEntityObj = service.get(id);
			service.save(entityObj);
			return new ResponseEntity<UserEntity>(existEntityObj,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete Operation
	@DeleteMapping("/UserEntity/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
}
