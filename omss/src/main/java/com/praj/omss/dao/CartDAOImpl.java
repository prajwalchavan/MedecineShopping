package com.praj.omss.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.praj.omss.entity.Cart;
import com.praj.omss.entity.Product;
import com.praj.omss.entity.User;

public class CartDAOImpl  implements CartDAO{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("omss");
	EntityManager manager = factory.createEntityManager();
	Map<Product, Integer> cart = new HashMap<>();
	//EntityManager manager;
public  CartDAOImpl() {
	//manager= DBUtil.getConnection();
}


	@Override
	public Cart addProductToCart(String name, int productId, int quantity) {
		Cart c = this.fetchDet(productId);
		return null;
	}

	@Override
	public Cart fetchDet(int productId) {
		Cart c = manager.getReference(Cart.class, productId); 
		return c;
	}


	@Override
	public void cart(int productId, int quantity) {
		Product p = manager.getReference(Product.class, productId);
		if(cart.containsKey(p)) this.cart.put(p, this.cart.get(p)+quantity);
		else this.cart.put(p, quantity);
		
	}
	
	@Override
	public Map<Product, Integer> viewCart(){
		return this.cart;
	}

	


}
