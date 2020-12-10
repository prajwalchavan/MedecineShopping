package com.praj.omss.services;

import com.praj.omss.entity.Cart;
import com.praj.omss.entity.Product;
import com.praj.omss.entity.User;

public interface CartService {

	Cart addProductToCart(User user, Product product, int quantity);

	static char[] addProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
