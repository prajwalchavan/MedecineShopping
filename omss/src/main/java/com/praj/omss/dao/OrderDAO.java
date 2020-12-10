package com.praj.omss.dao;

import java.time.LocalDate;
import java.util.List;

import com.praj.omss.entity.Order;

public interface OrderDAO {
	public List<Order>  viewOrders(int orderId);
	public List<Order> viewOrders(LocalDate orderdDate);
	public Order placeOrder(Order order);

}
