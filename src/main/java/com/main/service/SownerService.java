package com.main.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.main.entity.SownerEntity;
import com.main.repositories.SownerRepository;
@Service
@Transactional
@ComponentScan(value = {"com.main.repositories.SownerRepository"})
public class SownerService {
	
	@Autowired
	private SownerRepository repos;

	public List<SownerEntity> listAll() {
		return repos.findAll();
		// TODO Auto-generated method stub
		}
	public SownerEntity get(Integer id) {
		// TODO Auto-generated method stub
		return repos.findById(id).get();
	}
	public void save(SownerEntity entityObj) {
		repos.save(entityObj);		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repos.deleteById(id);
		
	}

}
