package com.sunbeam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.model.Product;
import com.sunbeam.utility.StorageService;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired 
	private ProductDao productDao;
	
	@Autowired
	private StorageService storageService;

	@Override
	public void addProduct(Product product, MultipartFile productImage) {
		
		String productImageName = storageService.store(productImage);
		
		product.setImageName(productImageName);
		
		this.productDao.save(product);
	}

}
