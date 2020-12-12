package com.praj.omss.services;

import java.util.List;

import com.praj.omss.dao.OrderDAO;
import com.praj.omss.dao.OrderDAOImpl;
import com.praj.omss.entity.Order;

public class OrderServiceImpl implements OrderService{
	OrderDAO dao;
	public OrderServiceImpl()
	{
		dao= new OrderDAOImpl();
	}

	@Override
	public List<Order> ViewSingleOrder(int orderId) {
		return dao.ViewleSingleOrders(orderId);
	}
	@Override
	public Order PlaceOrder(Order order) {
		return dao.PlaceOrder(order);
	}


	public List<Order> ViewAllOrder() {
		return dao.ViewOrders();
	}

	
}