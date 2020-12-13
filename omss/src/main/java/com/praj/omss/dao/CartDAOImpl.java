package com.praj.omss.dao;

import java.util.List;

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
	
	//EntityManager manager;
public  CartDAOImpl() {
	//manager= DBUtil.getConnection();
}


	@Override
	public Cart addProductToCart(String name, int productId, int quantity) {
		Cart c = this.fetchDet(productId);
		TypedQuery<Product> query = manager.createQuery("select cc from Product Where cc.product_id = productId:", Product.class);
		List<Product> list = query.getResultList();
		return null;
		
	}

	@Override
	public Cart fetchDet(int productId) {
		Cart c = manager.getReference(Cart.class, productId); 
		return c;
	}


}
