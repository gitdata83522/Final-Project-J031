package com.sunbeam.service;

import org.springframework.web.multipart.MultipartFile;

import com.sunbeam.model.Product;

public interface ProductService {
	
	void addProduct(Product product, MultipartFile productImage);

}
