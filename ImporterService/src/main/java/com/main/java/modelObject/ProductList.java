package com.main.java.modelObject;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
	
	private List<Product> productList;
	 
    public ProductList() {
    	productList = new ArrayList<>();
    }

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

}
