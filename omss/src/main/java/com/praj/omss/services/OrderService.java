package com.praj.omss.services;

import java.time.LocalDate;
import java.util.List;

import com.praj.omss.entity.Order;

public interface OrderService {
	
	public List<Order>  viewOrders(int orderId);
	public List<Order> viewOrders(LocalDate orderdDate);
	
	public Order placeOrder(Order order);
}
