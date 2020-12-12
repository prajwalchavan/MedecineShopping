package com.praj.omss.dao;

import java.util.List;

import com.praj.omss.entity.User;

public interface UserDAO {

	public boolean register(int userId, String firstName, String lastName, String address, Long mobileNo,String Email, String password);
	public boolean login(int id,String password);
	User fetchDet(int userid);
	public List<User> getUserList();
	public User logout(User user);
	public String getName(int userId);
	
}
