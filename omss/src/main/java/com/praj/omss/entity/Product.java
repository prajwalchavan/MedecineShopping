package com.praj.omss.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_info")

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id")
	private int productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="category")
	private String category;
	@Column(name="quantity")
	private int quantity;
	@Column(name="amount")
	private double amount;
	
//	public Product(int productId, String productName, String category, int quantity, double amount) {
//		super();
//		this.productId = productId;
//		this.productName = productName;
//		this.category = category;
//		this.quantity = quantity;
//		this.amount = amount;
//	}
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", quantity=" + quantity + ", amount=" + amount + "]";
	}
	
	
	

}