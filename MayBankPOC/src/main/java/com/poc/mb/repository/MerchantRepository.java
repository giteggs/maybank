package com.poc.mb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.mb.model.Merchant;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long>{
	
	

}
