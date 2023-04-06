package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.main.entity.UserEntity;
import com.main.repositories.UserRepository;

@Service
@Transactional
@ComponentScan(value = {"com.main.repositories.UserRepository"})
public class UserService {

	@Autowired
	private UserRepository repository;
	public List<UserEntity> listAll() {
		return repository.findAll();
	}
	public UserEntity get(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	public void save(UserEntity entityObj) {
		repository.save(entityObj);		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
