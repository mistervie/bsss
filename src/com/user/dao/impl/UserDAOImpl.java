package com.user.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.user.dao.UserDAO;
import com.user.entity.User;

@Repository("userDAO")
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO{
	//获取登录信息
	@Override
	public User getUser(User user){
		user = getSqlSession().selectOne("com.user.entity.UserMapper.getUser", user);
		return user;
	}

	@Override
	public int insertUser(User user) {
		return getSqlSession().insert("com.user.entity.UserMapper.insertUser", user);
	}
	
	@Override
	public int deleteUser(User user) {
		return getSqlSession().delete("com.user.entity.UserMapper.deleteUser", user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("com.user.entity.UserMapper.getUsers");
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return getSqlSession().update("com.user.entity.UserMapper.updateUser", user);
	}
	
}
