package com.praj.omss.services;

import com.praj.omss.entity.User;

public interface UserService {
	public User register(User user);
	public boolean login(int id,String password);

	
	public User logout(User user);

}
