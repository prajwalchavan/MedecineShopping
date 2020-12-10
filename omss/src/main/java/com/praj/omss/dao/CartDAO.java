package com.praj.omss.dao;

import com.praj.omss.entity.Cart;
import com.praj.omss.entity.Product;
import com.praj.omss.entity.User;

public interface CartDAO {
	public Cart addProductToCart(User user,Product product,int quantity);

}
