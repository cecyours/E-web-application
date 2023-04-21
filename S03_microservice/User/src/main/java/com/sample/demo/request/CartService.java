package com.sample.demo.request;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sample.demo.config.RestConfigByMe;
import com.sample.demo.model.Cart;

@FeignClient(name = "CART-SERVICE", configuration = RestConfigByMe.class)
public interface CartService {
	
	@GetMapping("/cart/user/{userId}")
	List<Cart> getCartList(@PathVariable("userId") String userId);
	
	
}
