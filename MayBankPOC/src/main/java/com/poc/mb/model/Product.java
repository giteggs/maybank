package com.poc.mb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pid")
	private Long pid;
	@NotNull
	@Column(name="productName")
	private String productName;
	@NotNull
	@Column(name="website")
	private String website;
	@NotNull
	@Column(name="price")
	private Float price;
	@NotNull
	@Column(name="cid")
	private Long cid;
	@NotNull
	@Column(name="mid")
	private Long mid;

	/*
	 * public Product(Long pid, @NotBlank String productName, String
	 * website, @NotBlank Float price, @NotBlank Long cid,
	 * 
	 * @NotBlank Long mid) { super(); this.pid = pid; this.productName =
	 * productName; this.website = website; this.price = price; this.cid = cid;
	 * this.mid = mid; }
	 */
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getMid() {
		return mid;
	}
	public void setMid(Long mid) {
		this.mid = mid;
	}
	
	
	
	
}
