package com.sample.demo.model;

import java.util.Date;
import java.util.TimeZone;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

public class Cart {
	 
	private String cartId;
	private String userId;
	private String productId;
	private int productQuanity;
	 
	private Date createdOn = new Date();
	 
	private Date updatedOn = new Date();

	
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", productId=" + productId + ", productQuanity="
				+ productQuanity + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getProductQuanity() {
		return productQuanity;
	}

	public void setProductQuanity(int productQuanity) {
		this.productQuanity = productQuanity;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Cart(String cartId, String userId, String productId, int productQuanity, Date createdOn,
			Date updatedOn) {

		super();
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		this.cartId = cartId;
		this.userId = userId;
		this.productId = productId;
		this.productQuanity = productQuanity;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public Cart() {

		super();
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
	}
	
	

}
