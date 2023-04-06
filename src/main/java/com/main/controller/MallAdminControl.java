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

import com.main.entity.MallAdminEntity;
import com.main.service.MallAdminService;

@RestController
@RequestMapping("/api")
public class MallAdminControl {
	@Autowired
	private MallAdminService service;	
	
	//Retrieve all Data
	@GetMapping("/MallAdminEntity")
	public List<MallAdminEntity> list()
	{
		return service.listAll();
	}
	
	//Retrieve specific data from DB
	@GetMapping("/MallAdminEntity/{id}")
	public ResponseEntity<MallAdminEntity> get(@PathVariable Integer id)
	{
		MallAdminEntity entityObj = service.get(id);
		return new ResponseEntity<MallAdminEntity>(entityObj, HttpStatus.OK);
	}
	
	
	//Create Data 
	@PostMapping("/MallAdminEntity")
	public void add(@RequestBody MallAdminEntity entityObj)
	{
		service.save(entityObj);
	}
	
	//Update Data in DB
	@PutMapping("/MallAdminEntity/{id}")
	public ResponseEntity<?> update(@RequestBody MallAdminEntity entityObj ,@PathVariable Integer id)
	{		
		try {
			MallAdminEntity existEntityObj = service.get(id);
			service.save(entityObj);
			return new ResponseEntity<MallAdminEntity>(existEntityObj,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete Operation
	@DeleteMapping("/MallAdminEntity/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
}
