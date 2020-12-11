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
	public Product addProduct(Product product) {
		return dao.addProduct(product);
	}
	@Override
	public Product updateProduct(Product product) {
		return dao.updateProduct(product);
	}
	@Override
	public Product viewProduct(int productId) {
		return dao.viewProduct(productId);
	}
	@Override
	public List<Product> getProductList() {
		return dao.getProductList();
	}
	

}
