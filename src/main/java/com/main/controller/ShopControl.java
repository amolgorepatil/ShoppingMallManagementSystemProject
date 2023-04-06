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

import com.main.entity.ShopEntity;
import com.main.service.ShopService;

@RestController
@RequestMapping("/api")
public class ShopControl {
	@Autowired
	private ShopService service;	
	
	//Retrieve all Data
	@GetMapping("/ShopEntity")
	public List<ShopEntity> list()
	{
		return service.listAll();
	}
	
	//Retrieve specific data from DB
	@GetMapping("/ShopEntity/{id}")
	public ResponseEntity<ShopEntity> get(@PathVariable Integer id)
	{
		ShopEntity entityObj = service.get(id);
		return new ResponseEntity<ShopEntity>(entityObj, HttpStatus.OK);
	}
	
	
	//Create Data 
	@PostMapping("/ShopEntity")
	public void add(@RequestBody ShopEntity entityObj)
	{
		service.save(entityObj);
	}
	
	//Update Data in DB
	@PutMapping("/ShopEntity/{id}")
	public ResponseEntity<?> update(@RequestBody ShopEntity entityObj ,@PathVariable Integer id)
	{		
		try {
			ShopEntity existEntityObj = service.get(id);
			service.save(entityObj);
			return new ResponseEntity<ShopEntity>(existEntityObj,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete Operation
	@DeleteMapping("/ShopEntity/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	

}
