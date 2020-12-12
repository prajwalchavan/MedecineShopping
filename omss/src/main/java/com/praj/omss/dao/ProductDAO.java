package com.praj.omss.dao;

import java.util.List;

import com.praj.omss.entity.Product;

public interface ProductDAO {

	public Product updateProduct(Product product);
	public List<Product> getProductList();
	public  boolean addProduct(int productId, String productName, String category, int quantity, long amount);
	public Product getSingleProduct(String category);
	

}
