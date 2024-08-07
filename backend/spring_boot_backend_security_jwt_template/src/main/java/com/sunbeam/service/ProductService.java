package com.sunbeam.service;

import com.sunbeam.dto.ProductDTO;
import com.sunbeam.entities.Product;
import com.sunbeam.repository.ProductRepository;
import com.sunbeam.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(product -> new ProductDTO(
                        product.getId(),
                        product.getName(),
                        product.getDescription(),
                        product.getPrice(),
                        null,
                        null))
                .collect(Collectors.toList());
    }

    public ProductDTO getProductById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new CustomException("Product not found"));
        return new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice(), null, null);
    }

    public ProductDTO saveProduct(ProductDTO productDTO) {
        Product product = new Product(productDTO.getId(), productDTO.getName(), productDTO.getDescription(), productDTO.getPrice(), 0, null, null);
        product = productRepository.save(product);
        return new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice(), null, null);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
