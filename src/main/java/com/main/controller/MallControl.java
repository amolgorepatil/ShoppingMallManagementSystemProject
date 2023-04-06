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

import com.main.entity.MallEntity;
import com.main.service.MallService;

@RestController
@RequestMapping("/api")
public class MallControl {
	@Autowired
	private MallService service;	
	
	//Retrieve all Data
	@GetMapping("/MallEntity")
	public List<MallEntity> list()
	{
		return service.listAll();
	}
	
	//Retrieve specific data from DB
	@GetMapping("/MallEntity/{id}")
	public ResponseEntity<MallEntity> get(@PathVariable Long id)
	{
		MallEntity entityObj = service.get(id);
		return new ResponseEntity<MallEntity>(entityObj, HttpStatus.OK);
	}
	
	
	//Create Data 
	@PostMapping("/MallEntity")
	public void add(@RequestBody MallEntity entityObj)
	{
		service.save(entityObj);
	}
	
	//Update Data in DB
	@PutMapping("/MallEntity/{id}")
	public ResponseEntity<?> update(@RequestBody MallEntity entityObj ,@PathVariable Long id)
	{		
		try {
			MallEntity existEntityObj = service.get(id);
			service.save(entityObj);
			return new ResponseEntity<MallEntity>(existEntityObj,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete Operation
	@DeleteMapping("/MallEntity/{id}")
	public void delete(@PathVariable Long id)
	{
		service.delete(id);
	}
	
	

}
