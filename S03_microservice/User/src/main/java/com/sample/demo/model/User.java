package com.sample.demo.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document("user")
public class User {
	
	@Id
	private String userId;
	private String userName;
	private String userPass;
	
	@Transient
	private ArrayList<Cart> cartList;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public User(String userId, String userName, String userPass) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
	}
	
	
	public User(String userId, String userName, String userPass, ArrayList<Cart> cartList) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.cartList = cartList;
	}
	public ArrayList<Cart> getCartList() {
		return cartList;
	}
	public void setCartList(ArrayList<Cart> cartList) {
		this.cartList = cartList;
	}
	public User() {
		super();
	}

	
}
