package com.praj.omss.services;

import com.praj.omss.dao.CartDAO;
import com.praj.omss.dao.CartDAOImpl;
import com.praj.omss.entity.Cart;
import com.praj.omss.entity.Product;
import com.praj.omss.entity.User;

public class CartServiceImpl implements CartService{
	CartDAO dao;
	public CartServiceImpl()
	{
		dao= new CartDAOImpl();
	}
	
	@Override
	public Cart addProductToCart(User user, Product product, int quantity) {
		// TODO Auto-generated method stub
		return dao.addProductToCart(user, product, quantity);
	}

}
