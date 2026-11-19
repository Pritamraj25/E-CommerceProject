package com.pritamraj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pritamraj.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {
	

}
