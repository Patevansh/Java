package com.restapi.springbootapi.service;

import entity.Product;
import com.restapi.springbootapi.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	
	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Optional<Product> getProductById(Long id){
		return productRepository.findById(id);
	}
	
}
