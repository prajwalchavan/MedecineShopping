package com.praj.omss.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "CartDetails")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private int cartId;
	@Column(name = "userid")
	private String userid;
	@Column(name = "Product_Name")
	private String product;
	@Column(name = "Quantity")
	private int quantity;
	@Column(name = "Total_Amount")
	private int totalAmount;

	public int getCartId() {
		return cartId;
	}

	public Cart(int cartId, String userid, String product, int quantity, int totalAmount) {
		super();
		this.cartId = cartId;
		this.userid = userid;
		this.product = product;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}

	public Cart() {
		super();

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
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}


	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userid=" + userid + ", product=" + product + ", quantity" + quantity
				+ ", totalAmount" + totalAmount + "]";
	}

	
}