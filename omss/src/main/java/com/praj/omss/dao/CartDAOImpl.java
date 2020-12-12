package com.praj.omss.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.praj.omss.entity.Cart;

public class CartDAOImpl  implements CartDAO{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("omss");
	EntityManager manager = factory.createEntityManager();
	
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


}
