package com.pritamraj.service.impl;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pritamraj.Repository.ProductRepository;
import com.pritamraj.entity.Products;
import com.pritamraj.service.ProductService;


@Service
public class ProductServiceimpl implements ProductService {


	@Autowired
	ProductRepository prorepo;

	
	@Override
	public void save(Products product) {
		
		prorepo.save(product);
		
	}

	@Override
	public List<Products> getallproducts() {
		
		return prorepo.findAll();
	}

	@Override
	public Products getById(int id)
	{
	Products product=null;
	Optional<Products>op=prorepo.findById(id);
	if(op.isPresent())
	{
		product=op.get();
		
	}
	
		return product;
		
	}

	@Override
	public void delete(int id)
	{
		prorepo.deleteById(id);
	}

	

}
