package com.pritamraj.service;

import java.util.List;



import com.pritamraj.entity.Products;


public interface ProductService {
	
	 void save(Products product);
	
	 List<Products>getallproducts();
	
	 Products getById(int id);

	 void delete(int id);
}
