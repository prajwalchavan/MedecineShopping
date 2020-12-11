package com.praj.omss.services;

import com.praj.omss.dao.UserDAO;
import com.praj.omss.dao.UserDAOImpl;
import com.praj.omss.entity.User;

public class UserServiceImpl implements UserService {
	UserDAO dao;
	public UserServiceImpl()
	{
		dao= new UserDAOImpl();
	}
	
	@Override
	public boolean register(int userId, String firstName, String lastName, String address, Long mobileNo,String Email, String password) {
		
		return dao.register(userId, firstName, lastName, address, mobileNo, Email, password);
	}

	@Override
	public boolean login(int id, String password) {
		return dao.login(id, password);
	}


	@Override
	public User logout(User user) {
		return dao.logout(user);
	}

}
