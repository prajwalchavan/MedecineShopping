package com.praj.omss.services;

import com.praj.omss.dao.CartDAO;
import com.praj.omss.dao.CartDAOImpl;
import com.praj.omss.entity.Cart;
import com.praj.omss.entity.Product;
import com.praj.omss.entity.User;
import com.sun.istack.logging.Logger;

public class CartServiceImpl implements CartService{
	CartDAO dao;
	public CartServiceImpl()
	{
		dao= new CartDAOImpl();
	}
	Logger logger = Logger.getLogger(CartServiceImpl.class);
	
	@Override
	public Cart addProductToCart(User user, Product product, int quantity) {
		logger.info("adding products to cart");
		return dao.addProductToCart(user, product, quantity);
	}

}
