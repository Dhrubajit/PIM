package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.modelObject.ProductInBean;
import com.example.demo.repository.ProductRepository;

@RestController
public class AggregatorController {

	@Autowired
	ProductRepository productRepository;

	/*
	 * @PostMapping("/Products") Product newProduct(@RequestBody Product newProduct)
	 * { return productRepository.save(newProduct); }
	 */
	@PostMapping("/nonProducts")
	String nonProduct(@RequestBody List<ProductInBean> listProduct) {
		// return productRepository.save(s);
		List<Product> productEntityList = new ArrayList<Product>();
		for (ProductInBean productInBean : listProduct) {
			Product product = new Product();
			product.setUUID(productInBean.getUUID());
			product.setName(productInBean.getName());
			product.setDescription(productInBean.getDescription());
			product.setProvider(productInBean.getProvider());
			product.setAvailable(productInBean.getAvailable());
			product.setMessuermentUnit(productInBean.getMessuermentUnit());
			
			productEntityList.add(product);
		}
		
		productRepository.saveAll(productEntityList);

		return "redirect:/uploadStatus";
	}

	@GetMapping(path = "/add")
	public String addUser(@RequestBody ProductInBean productInBean) {

		Product product = new Product();
		product.setUUID(productInBean.getUUID());
		product.setName(productInBean.getName());
		product.setDescription(productInBean.getDescription());
		product.setProvider(productInBean.getProvider());
		product.setAvailable(productInBean.getAvailable());
		product.setMessuermentUnit(productInBean.getMessuermentUnit());

		productRepository.save(product);

		String ret = "Product  has been added, UUID = " + productInBean.getUUID() + ", Name = "
				+ productInBean.getName() + ", Description = " + productInBean.getDescription();

		return ret;

	}
}
