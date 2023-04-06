package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.main.entity.MallEntity;
import com.main.repositories.MallRepository;

@Service
@Transactional
@ComponentScan(value = {"com.main.repositories.MallRepository"})
public class MallService {
	
	@Autowired
	private MallRepository repository;

	public List<MallEntity> listAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public MallEntity get(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public void save(MallEntity entityObj) {
		// TODO Auto-generated method stub
		repository.save(entityObj);
		
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		}

}
