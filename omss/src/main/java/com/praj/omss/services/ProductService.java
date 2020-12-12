package com.praj.omss.services;

import java.util.List;

import com.praj.omss.entity.Product;

public interface ProductService {

	public boolean addProduct(int productId, String productName, String category, int quantity, long amount);

	public Product updateProduct(Product product);
	
	Product viewSingleProduct(String category);

	public List<Product> getProductList();

	public static String ViewBasedOnCategory(String category) {
		return null;
	}

	

}
