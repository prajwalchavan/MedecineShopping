package com.praj.omss.dao;

import java.util.List;

import com.praj.omss.entity.Order;

public interface OrderDAO {
	public List<Order> ViewAllOrder(Order order);
	public Order PlaceOrder(Order order);
	List<Order> ViewleSingleOrders(int orderId);
}
