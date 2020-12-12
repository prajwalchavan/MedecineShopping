package com.praj.omss.services;

import com.praj.omss.dao.CartDAO;
import com.praj.omss.dao.CartDAOImpl;
import com.praj.omss.entity.Cart;
import com.praj.omss.entity.Product;
import com.praj.omss.entity.User;
import com.sun.istack.logging.Logger;

public class CartServiceImpl implements CartService {
	CartDAO dao;

	public CartServiceImpl() {
		dao = new CartDAOImpl();
	}

	@Override
	public Cart addProductToCart(String name, int productId, int quantity) {
		return dao.addProductToCart(name, productId, quantity);
	}

}
