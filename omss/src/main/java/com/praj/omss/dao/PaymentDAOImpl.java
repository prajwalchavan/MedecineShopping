package com.praj.omss.dao;

import javax.persistence.EntityManager;

import com.praj.omss.entity.Payment;
import com.praj.omss.util.DBUtil;

public class PaymentDAOImpl implements PaymentDAO {

	EntityManager manager;

	public PaymentDAOImpl() {
		manager = DBUtil.getConnection();
	}

	@Override
	public Payment addPayment(Payment payment) {
		manager.getTransaction().begin();
		manager.persist(payment);
		manager.getTransaction().commit();
		return payment;

	}

}
