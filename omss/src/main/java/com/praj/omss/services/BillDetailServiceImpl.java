package com.praj.omss.services;

import com.praj.omss.dao.BillDetailsDAO;
import com.praj.omss.dao.BillDetailsDAOImpl;
import com.praj.omss.entity.BillDetails;
import com.sun.istack.logging.Logger;

public class BillDetailServiceImpl implements  BillDetailService {
	BillDetailsDAO dao;
	public void BillDetailsServiceImpl()
	{
		dao=new BillDetailsDAOImpl();
	}
	Logger logger = Logger.getLogger(BillDetailServiceImpl.class);
	@Override
	public BillDetails addBillDetails(BillDetails bill) {
		logger.info("getting bill detils");
		return dao.addBillDetails(bill);
	}

}
