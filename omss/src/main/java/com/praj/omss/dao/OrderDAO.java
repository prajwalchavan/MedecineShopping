package com.praj.omss.dao;

import java.util.List;

import com.praj.omss.entity.Order;

public interface OrderDAO {
	public Order PlaceOrder(Order order);
	List<Order> ViewleSingleOrders(int orderId);
	public List<Order> ViewOrders();
}
