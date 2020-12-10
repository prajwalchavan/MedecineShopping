package com.praj.omss.services;

import com.praj.omss.entity.User;

public interface UserService {
	public boolean register(User user);
	public boolean login(int id,String password);

	
	public User logout(User user);
	public static String ViewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
