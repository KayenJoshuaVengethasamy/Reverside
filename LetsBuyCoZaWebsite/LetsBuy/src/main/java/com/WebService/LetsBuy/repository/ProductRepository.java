package com.WebService.LetsBuy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.WebService.LetsBuy.model.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	Product findByProductName(String productName);
}