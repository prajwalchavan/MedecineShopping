package com.praj.omss.dao;

import com.praj.omss.entity.User;

public interface UserDAO {

	public User register(User user);
	public boolean login(int id,String password);
	
	public User logout(User user);
}
