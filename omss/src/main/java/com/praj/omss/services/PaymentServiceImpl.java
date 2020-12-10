package com.praj.omss.services;

import com.praj.omss.dao.PaymentDAO;
import com.praj.omss.dao.PaymentDAOImpl;
import com.praj.omss.entity.Payment;

public class PaymentServiceImpl implements PaymentService{
	PaymentDAO dao;
	public PaymentServiceImpl()
	{
		dao=new PaymentDAOImpl();
	}
	@Override
	public Payment addPayment(Payment payment) {
		// TODO Auto-generated method stub
		return dao.addPayment(payment);
	}

}
