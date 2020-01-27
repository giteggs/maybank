package com.poc.mb.exception;

public class ProductNotFoundException extends Exception {
	
	private long product_id;

	public ProductNotFoundException(long product_id) {
		super(String.format("Product is not found with id : '%s'", product_id));
		//this.product_id = product_id;
	}
	
	

}
