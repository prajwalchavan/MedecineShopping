package com.praj.omss.services;

import java.util.List;

import com.praj.omss.entity.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product viewProduct(int productId);
	public List<Product> getProductList();
	public static String ViewBasedOnCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String ViewAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}
	public static String ViewSingleProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String ViewAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}


}
