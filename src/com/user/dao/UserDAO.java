package com.user.dao;

import java.util.List;

import com.user.entity.User;

public interface UserDAO {
	public User getUser(User user);
	
	public List<User> getUsers();
	
	public int insertUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(User user); 
}
