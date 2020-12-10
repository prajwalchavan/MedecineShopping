package com.praj.omss.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.praj.omss.entity.*;
import com.praj.omss.services.AdminServiceImpl;
import com.praj.omss.util.DBUtil;
import com.sun.istack.logging.Logger;

public class AdminDAOImpl implements AdminDAO {
	EntityManager manager;
	public  AdminDAOImpl() {
		manager= DBUtil.getConnection();
	}
	Logger logger = Logger.getLogger(AdminServiceImpl.class);
	
	
	@Override
	public Product addProduct(Product product) {
		
		
		manager.getTransaction().begin();
		manager.persist(product);
		manager.getTransaction().commit();
		return product;
		
	}
	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		manager.merge(product);
		return product;
	}
	@Override
	public boolean login(int id, String pass) {
		 TypedQuery<Admin> query=manager.createQuery("select cc.password from admin cc where cc.admin_id=:id",Admin.class);
			query.setParameter("id",id);
			String password1=query.getSingleResult().toString();
			if(pass.equals(password1))
			{
				return true;
			}
		 return false;
	}
	
	@Override
	public List<Product> ViewProduct(int productId) {
		TypedQuery<Product> query=manager.createQuery("select cc.product from Products cc where cc.product_Id=:productId",Product.class);
		query.setParameter("productId", productId);
		List<Product> list=query.getResultList();
		return list;
	}
	@Override
	public List<User> ViewUserDetails(int Userid) {
		TypedQuery<User> query=manager.createQuery("select cc.Userid from Users cc where user_Id=:userId",User.class);
		query.setParameter("UserId",Userid);
		List<User> list=query.getResultList();
		return list;
	}
	@Override
	public List<Order> ViewAllOrders(int orderId) {
		TypedQuery<Order> query=manager.createQuery("select cc.orderId from Order cc where cc.order_Id=:orderId",Order.class);
		query.setParameter("OrderId", orderId);
		List<Order> list=query.getResultList();
		return list;
	}
	@Override
	public Admin logout(Admin admin) {
		System.exit(0);
		 return null;
	}


}

