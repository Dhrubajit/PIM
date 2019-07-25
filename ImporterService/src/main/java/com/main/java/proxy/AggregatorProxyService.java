package com.main.java.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.java.modelObject.Product;

@FeignClient(name="Aggregator")
public interface AggregatorProxyService {

	@RequestMapping("/nonProducts")
	String nonProduct( List<Product> listProduct);
}
