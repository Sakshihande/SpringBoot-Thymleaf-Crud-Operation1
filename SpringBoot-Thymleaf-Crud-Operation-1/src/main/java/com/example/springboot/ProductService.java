package com.example.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository repo;

	
	//Display all data
	public List<Product> listAll(){
		return repo.findAll();
		
	}
	//Insert data in table
	public void save(Product product) {
		repo.save(product);
		
	}
	
	//Search by id
	
	public Product get(long id) {
		return repo.findById(id).get();
	}
	//delete record 
	public void delete (long id) {
		repo.deleteById(id);
	}

}
