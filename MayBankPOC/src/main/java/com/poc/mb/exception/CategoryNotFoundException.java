package com.poc.mb.exception;

public class CategoryNotFoundException extends Exception {
		
		private long cat_id;

		public CategoryNotFoundException(long cat_id) {
			super(String.format("Category is not found with id : '%s'", cat_id));
			//this.product_id = product_id;
		}
}
