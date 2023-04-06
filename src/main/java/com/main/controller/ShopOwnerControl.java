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

import com.main.entity.SownerEntity;
import com.main.service.SownerService;

@RestController
@RequestMapping("/api")
public class ShopOwnerControl {
	@Autowired
	private SownerService service;	
	
	//Retrieve all Data
	@GetMapping("/SownerEntity")
	public List<SownerEntity> list()
	{
		return service.listAll();
	}
	
	//Retrieve specific data from DB
	@GetMapping("/SownerEntity/{id}")
	public ResponseEntity<SownerEntity> get(@PathVariable Integer id)
	{
		SownerEntity entityObj = service.get(id);
		return new ResponseEntity<SownerEntity>(entityObj, HttpStatus.OK);
	}
	
	
	//Create Data 
	@PostMapping("/SownerEntity")
	public void add(@RequestBody SownerEntity entityObj)
	{
		service.save(entityObj);
	}
	
	//Update Data in DB
	@PutMapping("/SownerEntity/{id}")
	public ResponseEntity<?> update(@RequestBody SownerEntity entityObj ,@PathVariable Integer id)
	{		
		try {
			SownerEntity existEntityObj = service.get(id);
			service.save(entityObj);
			return new ResponseEntity<SownerEntity>(existEntityObj,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete Operation
	@DeleteMapping("/SownerEntity/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	

}
