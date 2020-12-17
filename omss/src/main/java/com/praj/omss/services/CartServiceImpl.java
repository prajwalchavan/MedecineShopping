package com.praj.omss.services;

import java.util.Map;

import com.praj.omss.dao.CartDAO;
import com.praj.omss.dao.CartDAOImpl;
import com.praj.omss.entity.Cart;
import com.praj.omss.entity.Product;

public class CartServiceImpl implements CartService {
	CartDAO dao;

	public CartServiceImpl() {
		dao = new CartDAOImpl();
	}

	@Override
	public Cart addProductToCart(String name, int productId, int quantity) {
		return dao.addProductToCart(name, productId, quantity);
	}

	@Override
	public void addProductToCart(int productId, int quantity) {
		dao.cart(productId, quantity);
		
	}

	@Override
	public Map<Product, Integer> viewCart() {
		return dao.viewCart();
		
	}

}
