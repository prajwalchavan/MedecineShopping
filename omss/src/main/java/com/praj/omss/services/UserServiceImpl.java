package com.praj.omss.services;

import java.util.List;

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
	public boolean login(int UserId, String loginPassword) {
		return dao.login(UserId, loginPassword);
	}


	@Override
	public User logout(User user) {
		return dao.logout(user);
	}

	public List<User> ViewAllUsers() {
		return dao.getUserList();
	}

	public String getusername(int userId) {
		return dao.getName(userId);
	}

	

}
