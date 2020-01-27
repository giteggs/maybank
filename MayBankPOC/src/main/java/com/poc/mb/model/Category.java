package com.poc.mb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	private Long cid;
	@NotBlank
	private String categoyName;
	
	
	
	public Category(Long cid, @NotBlank String categoyName) {
		super();
		this.cid = cid;
		this.categoyName = categoyName;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getCategoyName() {
		return categoyName;
	}
	public void setCategoyName(String categoyName) {
		this.categoyName = categoyName;
	}
	
	

}
