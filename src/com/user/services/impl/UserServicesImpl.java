package com.user.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.user.dao.UserDAO;
import com.user.entity.User;
import com.user.services.UserServices;

@Service("userServices")
public class UserServicesImpl implements UserServices {

	@Autowired
	@Qualifier("userDAO")
	private UserDAO userDAO;

	@Override
	public String checkUser(User user) {
		User u = userDAO.getUser(user);
		if(u != null){
			return u.getUname();
		}else{
			return null;
		}
	}

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
