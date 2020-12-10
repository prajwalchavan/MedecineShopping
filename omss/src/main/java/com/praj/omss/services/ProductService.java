package com.praj.omss.services;

import java.util.List;

import com.praj.omss.entity.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product viewProduct(int productId);
	public List<Product> getProductList();


}
