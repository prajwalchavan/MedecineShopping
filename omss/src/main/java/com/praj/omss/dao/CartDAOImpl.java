package com.praj.omss.dao;

import javax.persistence.EntityManager;

import com.praj.omss.entity.Cart;
import com.praj.omss.entity.Product;
import com.praj.omss.entity.User;
import com.praj.omss.util.DBUtil;

public class CartDAOImpl  implements CartDAO
{
	EntityManager manager;
public  CartDAOImpl() {
	// TODO Auto-generated constructor stub
	manager= DBUtil.getConnection();
}


	@Override
	public Cart addProductToCart(User user, Product product, int quantity) {
		// TODO Auto-generated method stub
		return null;
		
	}


}
