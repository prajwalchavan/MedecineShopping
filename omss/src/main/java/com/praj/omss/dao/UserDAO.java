package com.praj.omss.dao;

import com.praj.omss.entity.User;

public interface UserDAO {

	public boolean register(int userId, String firstName, String lastName, String address, Long mobileNo,String Email, String password);
	public boolean login(int id,String password);
	
	public User logout(User user);
}
