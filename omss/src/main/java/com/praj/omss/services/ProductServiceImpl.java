package com.praj.omss.services;

import java.util.List;

import com.praj.omss.dao.ProductDAO;
import com.praj.omss.dao.ProductDAOImpl;
import com.praj.omss.entity.Product;

public class ProductServiceImpl implements ProductService {
	
	ProductDAO dao;
	public ProductServiceImpl() {
		dao=new ProductDAOImpl();
	}
	
	@Override
	public boolean addProduct(int productId, String productName, String category, int quantity, long amount) {
		return dao.addProduct(productId, productName, category, quantity, amount);
	}
	@Override
	public Product updateProduct(Product product) {
		return dao.updateProduct(product);
	}
	
	@Override
	public List<Product> getProductList() {
		return dao.getProductList();
	}

	@Override
	public Product viewSingleProduct(String category) {
		return dao.getSingleProduct(category);
	}

	
}
