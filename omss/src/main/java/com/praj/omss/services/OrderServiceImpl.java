package com.praj.omss.services;

import java.time.LocalDate;
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
	public List<Order> viewOrders(int orderId) {
		return dao.viewOrders(orderId);
	}
	@Override
	public List<Order> viewOrders(LocalDate orderdDate) {
		// TODO Auto-generated method stub
		return dao.viewOrders(orderdDate);
	}
	@Override
	public Order placeOrder(Order order) {
		// TODO Auto-generated method stub
		return dao.placeOrder(order);
	}
	
}
