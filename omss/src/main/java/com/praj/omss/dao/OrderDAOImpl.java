package com.praj.omss.dao;

import java.time.LocalDate;
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
	public List<Order> viewOrders(int orderId) {
		TypedQuery<Order> query=manager.createQuery("select cc from Order ",Order.class);
		query.setParameter("orderId", orderId);
		List<Order> list=query.getResultList();
		return list;
	}
	@Override
	public List<Order> viewOrders(LocalDate orderDate) {
		TypedQuery<Order> query=manager.createQuery("select cc from Order where cc.orderDate=orderDate",Order.class);
		query.setParameter("orderDate", orderDate);
		List<Order> list=query.getResultList();
		return list;
	}
	@Override
	public Order placeOrder(Order order) {
		manager.getTransaction().begin();
		manager.persist(order);
		manager.getTransaction().commit();
		return order;
	}
	


}
