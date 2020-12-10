package com.praj.omss.services;

import com.praj.omss.dao.BillDetailsDAO;
import com.praj.omss.dao.BillDetailsDAOImpl;
import com.praj.omss.entity.BillDetails;

public class BillDetailServiceImpl implements  BillDetailService {
	BillDetailsDAO dao;
	public void BillDetailsServiceImpl()
	{
		dao=new BillDetailsDAOImpl();
	}
	@Override
	public BillDetails addBillDetails(BillDetails bill) {
		// TODO Auto-generated method stub
		return dao.addBillDetails(bill);
	}

}
