package com.main.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.main.entity.CustomerEntity;
import com.main.repositories.CustomerRepository;


@Service
@Transactional
@ComponentScan(value = {"com.main.repositories.CustomerRepository"})
public class CustomerService {

	@Autowired
	private CustomerRepository Repository;

	public List<CustomerEntity> listAll() {
		return Repository.findAll();
		// TODO Auto-generated method stub
		}
	public CustomerEntity get(Integer id) {
		// TODO Auto-generated method stub
		return Repository.findById(id).get();
	}
	public void save(CustomerEntity entityObj) {
		Repository.save(entityObj);		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Repository.deleteById(id);
		
	}

}
