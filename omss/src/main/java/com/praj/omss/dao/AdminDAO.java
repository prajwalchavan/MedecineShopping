package com.praj.omss.dao;

import java.util.List;

import com.praj.omss.entity.*;

public interface AdminDAO {

		public boolean login(int id,String pass);
		public Product addProduct(Product product);
		public Product updateProduct(Product product);
		public List<Product> ViewProduct(int productId);
		public List<User> ViewUserDetails(int Userid);
		public List<Order> ViewAllOrders(int orderId);
		
		public Admin logout(Admin admin);
		
	}
