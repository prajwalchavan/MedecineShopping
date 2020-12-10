package com.praj.omss.entity;

import javax.persistence.*;
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
	private String product;
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	
	

}