package com.praj.omss.dao;

import java.util.Map;

import com.praj.omss.entity.Cart;
import com.praj.omss.entity.Product;

public interface CartDAO {
	public Cart addProductToCart(String name,int productId,int quantity);

	Cart fetchDet(int productId);
	
	void cart(int productId, int quantity);

	Map<Product, Integer> viewCart();

}
