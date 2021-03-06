package com.WebService.LetsBuy.web.dto;

import javax.validation.constraints.NotEmpty;

public class ProductRegistrationDto {

	@NotEmpty
	private String productName;

	@NotEmpty
	private String productImage;

	@NotEmpty
	private String productPrice;

	@NotEmpty
	private String productDescription;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}