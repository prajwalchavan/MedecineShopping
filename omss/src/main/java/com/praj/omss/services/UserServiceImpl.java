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
	public boolean register(User user) {
		
		return dao.register(user);
	}

	@Override
	public boolean login(int id, String password) {
		// TODO Auto-generated method stub
		return dao.login(id, password);
	}


	@Override
	public User logout(User user) {
		// TODO Auto-generated method stub
		return dao.logout(user);
	}

}
