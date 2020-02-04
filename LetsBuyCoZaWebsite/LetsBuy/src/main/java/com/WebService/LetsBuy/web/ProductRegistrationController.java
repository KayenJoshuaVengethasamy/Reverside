package com.WebService.LetsBuy.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WebService.LetsBuy.model.Product;
import com.WebService.LetsBuy.service.ProductService;
import com.WebService.LetsBuy.web.dto.ProductRegistrationDto;

@Controller
@RequestMapping("/product")
public class ProductRegistrationController {

	@Autowired
	private ProductService productService;

	@ModelAttribute("product")
	public ProductRegistrationDto productRegistrationDto() {
		return new ProductRegistrationDto();
	}

	@GetMapping
	public String showRegistrationForm(Model model) {
		return "product";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("product") @Valid ProductRegistrationDto productDto,
			BindingResult result) {

		Product existing = productService.findByProductName(productDto.getProductName());
		if (existing != null) {
			result.rejectValue("productName", null, "There is already a product registered with that name");
		}

		if (result.hasErrors()) {
			return "product";
		}

		productService.save(productDto);
		return "redirect:/product?success";
	}
}
