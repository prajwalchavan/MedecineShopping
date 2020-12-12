package com.praj.omss.services;

import java.util.List;

import com.praj.omss.entity.Order;

public interface OrderService {
	public List<Order> ViewSingleOrder(int orderId);
	public Order PlaceOrder(Order order);
	public List<Order> ViewAllOrder();

}
