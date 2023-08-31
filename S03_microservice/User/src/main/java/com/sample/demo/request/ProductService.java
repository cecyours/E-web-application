package com.sample.demo.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sample.demo.config.RestConfigByMe;
import com.sample.demo.model.Product;

@FeignClient(name = "PRODUCT-SERVICE", configuration = RestConfigByMe.class)
public interface ProductService {



	@GetMapping("/product/mypro/{productId}")
	Product getProduct(@PathVariable("productId") String productId); 
}
