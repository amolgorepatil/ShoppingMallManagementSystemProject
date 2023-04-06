


package com.main.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.main.entity.OrderDetailsEntity;
import com.main.repositories.OrderDeatilsRepository;

@Service
@Transactional
@ComponentScan(value = {"com.main.repositories.OrderDetailsRepository"})
public class OrderDetailsService {
	
	@Autowired
	private OrderDeatilsRepository repos;

	public List<OrderDetailsEntity> listAll() {
		return repos.findAll();
		// TODO Auto-generated method stub
		}
	public OrderDetailsEntity get(Integer id) {
		// TODO Auto-generated method stub
		return repos.findById(id).get();
	}
	public void save(OrderDetailsEntity entityObj) {
		repos.save(entityObj);		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repos.deleteById(id);
		
	}

}
