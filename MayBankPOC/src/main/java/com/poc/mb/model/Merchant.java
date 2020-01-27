package com.poc.mb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="merchant")
public class Merchant {
	
	@Id
	private Long mid;
	@NotBlank
	private String merchantName;
	public Merchant(Long mid, @NotBlank String merchantName) {
		super();
		this.mid = mid;
		this.merchantName = merchantName;
	}
	public Long getMid() {
		return mid;
	}
	public void setMid(Long mid) {
		this.mid = mid;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	
	
    
}
