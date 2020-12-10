package com.praj.omss.services;
import java.util.List;

import com.praj.omss.dao.AdminDAO;
import com.praj.omss.dao.AdminDAOImpl;
import com.praj.omss.entity.*;
import com.sun.istack.logging.Logger;

public class AdminServiceImpl implements AdminService {
	AdminDAO dao;
	public AdminServiceImpl()
	{
		dao= new AdminDAOImpl();
	}
	Logger logger = Logger.getLogger(AdminServiceImpl.class);
	@Override
	public Product addProduct(Product product) {
		logger.info("Adding Products");
		
		return dao.addProduct(product);
	}
	@Override
	public boolean login(int id, String pass) {
		
		logger.info("Admin Login");
		return dao.login(id, pass);
	}
	@Override
	public Product updateProduct(Product product) {
		
		logger.info("Updating Products");
		return dao.updateProduct(product);
	}
	@Override
	public List<Product> ViewProduct(int productId) {
		
		logger.info("Viewing Products");
		return dao.ViewProduct(productId);
	}
	@Override
	public List<User> ViewUserDetails(int Userid) {
		
		logger.info("Viewing User Details");
		return dao.ViewUserDetails(Userid);
	}
	@Override
	public List<Order> ViewAllOrders(int orderId) {
		
		logger.info("Viewing all orders");
		return dao.ViewAllOrders(orderId);
	}
	@Override
	public Admin logout(Admin admin) {
		
		logger.info("Logging out");
		return dao.logout(admin);
	}
	
	
}