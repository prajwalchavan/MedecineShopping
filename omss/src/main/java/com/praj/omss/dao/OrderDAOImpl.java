package com.praj.omss.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.praj.omss.entity.Order;
import com.praj.omss.util.DBUtil;

public class OrderDAOImpl implements OrderDAO {
	EntityManager manager;
	public OrderDAOImpl()
	{
		manager=DBUtil.getConnection();
	}
	@Override
	public List<Order> ViewAllOrder(Order order) {
		TypedQuery<Order> query=manager.createQuery("select cc from Order ",Order.class);
		query.setParameter("order", order);
		List<Order> list=query.getResultList();
		return list;
	}
	
	@Override
	public List<Order> ViewleSingleOrders(int orderId) {
		TypedQuery<Order> query=manager.createQuery("select cc from Order where cc.order_Id=orderId",Order.class);
		query.setParameter("orderId", orderId);
		List<Order> list=query.getResultList();
		return list;
	}
	@Override
	public Order PlaceOrder(Order order) {
		manager.getTransaction().begin();
		manager.persist(order);
		manager.getTransaction().commit();
		return order;
	}
	
}