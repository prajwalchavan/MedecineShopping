package com.praj.omss.services;

import com.praj.omss.entity.Cart;
import com.praj.omss.entity.Product;
import com.praj.omss.entity.User;

public interface CartService {
	Cart addProductToCart(String name, int productId, int quantity);

}
