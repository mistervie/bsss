package com.user.services;

import com.user.entity.User;

public interface UserServices {
	public String checkUser(User user);
	
	public boolean insertUser(User user);
	
	public boolean deleteUser(User user);
	
	public boolean updateUser(User user);
}
