package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.entity.ItemEntity;
import com.main.repositories.ItemRepository;
@Service
@Transactional
@ComponentScan(value = {"com.main.repositories.ItemRepository"})
public class ItemService {
	@Autowired
	private ItemRepository repository;
	public List<ItemEntity> listAll() {
		return repository.findAll();
	}
	public ItemEntity get(Long id) {
		return repository.findById(id).get();
	}
	public void save(ItemEntity entityObj) {
		 repository.save(entityObj);
		
	}
	public void delete(Long id) {
		repository.deleteById(id);
	}
	

}
