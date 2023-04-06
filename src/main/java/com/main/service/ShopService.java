package com.main.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.main.entity.ShopEntity;
import com.main.repositories.ShopRepository;
@Service
@Transactional
@ComponentScan(value = {"com.main.repositories.ShopRepository"})
public class ShopService {
	
	@Autowired
	private ShopRepository repos;

	public List<ShopEntity> listAll() {
		return repos.findAll();
		// TODO Auto-generated method stub
		}
	public ShopEntity get(Integer id) {
		// TODO Auto-generated method stub
		return repos.findById(id).get();
	}
	public void save(ShopEntity entityObj) {
		repos.save(entityObj);		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repos.deleteById(id);
		
	}

}
