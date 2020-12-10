package com.praj.omss.dao;

import java.util.List;

import com.praj.omss.entity.Product;

public interface ProductDAO {

	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product viewProduct(int productId);
	public List<Product> getProductList();
	

}
