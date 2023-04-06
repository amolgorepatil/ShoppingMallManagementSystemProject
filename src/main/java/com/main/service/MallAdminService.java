package com.main.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.main.entity.MallAdminEntity;
import com.main.repositories.MallAdminRepository;
@Service
@Transactional
@ComponentScan(value = {"com.main.repositories.MallAdminRepository"})
public class MallAdminService {
	
	@Autowired
	private MallAdminRepository repository;

	public List<MallAdminEntity> listAll() {
		return repository.findAll();
		// TODO Auto-generated method stub
		}
	public MallAdminEntity get(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	public void save(MallAdminEntity entityObj) {
		repository.save(entityObj);		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
