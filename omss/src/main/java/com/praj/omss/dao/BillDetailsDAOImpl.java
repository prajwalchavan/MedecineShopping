package com.praj.omss.dao;

import javax.persistence.EntityManager;

import com.praj.omss.entity.BillDetails;
import com.praj.omss.util.DBUtil;

public class BillDetailsDAOImpl implements BillDetailsDAO {
	EntityManager manager;
	public BillDetailsDAOImpl()
	{
		manager=DBUtil.getConnection();
	}
	@Override
	public BillDetails addBillDetails(BillDetails bill) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(bill);
		manager.getTransaction().commit();
		return bill;
		
	}

}
