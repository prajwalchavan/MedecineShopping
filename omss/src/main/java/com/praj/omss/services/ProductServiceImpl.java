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
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}
	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}
	@Override
	public Product viewProduct(int productId) {
		// TODO Auto-generated method stub
		return dao.viewProduct(productId);
	}
	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return dao.getProductList();
	}
	

}
