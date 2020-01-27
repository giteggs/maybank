package com.poc.mb.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.mb.exception.ProductNotFoundException;
import com.poc.mb.model.Product;
import com.poc.mb.repository.ProductRepository;

@RestController
@RequestMapping("/poc")
public class POCController {
	
	@Autowired
	ProductRepository pr;
	
	
	@PostMapping(value="/save")
	public Product saveProduct(@Valid @RequestBody Product product) {
		
		System.out.println(product.getProductName()+"\t"+product.getPrice());
		
		return pr.save(product);
	}
	
	@GetMapping("/getProduct/{id}")
	public Product getName(@PathVariable(value = "id") Long pID) throws ProductNotFoundException{
			
		return pr.findById(pID).orElseThrow(() -> new ProductNotFoundException(pID));
	}
	
	@PutMapping(value="/update/{id}")
	public Product updateProduct(@PathVariable(value = "id") Long pid,
            @Valid @RequestBody Product productDetails) throws ProductNotFoundException {
		
		
		Product prduct = pr.findById(pid).orElseThrow(() -> new ProductNotFoundException(pid));
		prduct.setProductName(productDetails.getProductName());
		prduct.setWebsite(productDetails.getWebsite());
		prduct.setPrice(productDetails.getPrice());
		prduct.setMid(productDetails.getMid());
		prduct.setCid(productDetails.getCid());
		
		Product updateProduct = pr.save(prduct);
		return updateProduct;
	}
	
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable(value = "id") Long pid) throws ProductNotFoundException{
		
		Product product = pr.findById(pid).orElseThrow(() -> new ProductNotFoundException(pid));
		
		pr.delete(product);
		
		return ResponseEntity.ok().build();
	}
	

}
