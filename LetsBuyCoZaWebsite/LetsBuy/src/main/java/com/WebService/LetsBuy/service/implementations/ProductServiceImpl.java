package com.WebService.LetsBuy.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebService.LetsBuy.model.Product;
import com.WebService.LetsBuy.repository.ProductRepository;
import com.WebService.LetsBuy.service.ProductService;
import com.WebService.LetsBuy.web.dto.ProductRegistrationDto;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product findByProductName(String productName) {
		return productRepository.findByProductName(productName);
	}

	public Product save(ProductRegistrationDto registration) {
		Product product = new Product();
		product.setProductName(registration.getProductName());
		product.setProductImage(registration.getProductImage());
		product.setProductPrice(registration.getProductPrice());
		product.setProductDescription(registration.getProductDescription());
		return productRepository.save(product);
	}

}