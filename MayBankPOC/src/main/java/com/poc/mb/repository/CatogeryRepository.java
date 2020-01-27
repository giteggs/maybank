package com.poc.mb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.mb.model.Category;
import com.poc.mb.model.Product;

@Repository
public interface CatogeryRepository extends JpaRepository<Category, Long>{
	
	

}
