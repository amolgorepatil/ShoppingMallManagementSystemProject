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

import com.main.entity.ItemEntity;
import com.main.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemControl {
	@Autowired
	private ItemService service;
	
	//Retrieve all data
	@GetMapping("/ItemEntity")
			public List<ItemEntity> list()
			{
			return service.listAll();
			}
	
	//Retrieve specific data from database
	@GetMapping("/ItemEntity/{id}")
	public ResponseEntity<ItemEntity> get (@PathVariable Long id)
	{
		ItemEntity entityObj = service.get(id);
		return new ResponseEntity<ItemEntity>(entityObj,HttpStatus.OK);
	}
	
	//Create Data 
	@PostMapping("/ItemEntity")
		public void add(@RequestBody ItemEntity entityObj) 
	{
		service.save(entityObj);
	}

		//Update data in database
	@PutMapping("/ItemEntity/{id}")
	public ResponseEntity<?> update (@RequestBody ItemEntity entityObj, @PathVariable Long id)
	{
		try {
			ItemEntity existentityObj = service.get(id);
			service.save(entityObj);
			return new ResponseEntity<ItemEntity>(existentityObj,HttpStatus.OK);	
		} catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		}
	}
	
	// Delete Operation
	@DeleteMapping("/ItemEntity/{id}")
	public void delete(@PathVariable Long id)
	{
		service.delete(id);
	}
}
