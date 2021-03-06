package com.infosys.fa4project.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.fa4project.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> getByCategoryAndProductName(String category,String productName);
	List<Product> getBySellerId(Integer sellerId);
	
}
