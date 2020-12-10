package com.praj.omss.entity;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="CartDetails")
public class Cart {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="cart_id")
	private int cartId;
	@Column(name="userid")
	private String userid;
    @Column(name="cart_info")
    private Map<Product, Integer> cart;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getUser() {
		return userid;
	}
	public void setUser(String user) {
		this.userid = user;
	}
	public Map<Product, Integer> getCart() {
		return cart;
	}
	public void setCart(Map<Product, Integer> cart) {
		this.cart = cart;
	}

}