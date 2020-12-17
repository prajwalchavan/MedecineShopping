package com.praj.omss.services;

import java.util.List;

import com.praj.omss.entity.User;

public interface UserService {
	public boolean register(int userId, String firstName, String lastName, String address, Long mobileNo,String Email, String password);
	public boolean login(int id,String password);

	
	public User logout(User user);
	public List<User> ViewAllUsers();

}
