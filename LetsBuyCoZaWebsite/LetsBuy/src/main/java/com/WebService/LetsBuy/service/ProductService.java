package com.WebService.LetsBuy.service;

import com.WebService.LetsBuy.model.Product;
import com.WebService.LetsBuy.web.dto.ProductRegistrationDto;

public interface ProductService {
	Product findByProductName(String productName);

	Product save(ProductRegistrationDto registration);

}
