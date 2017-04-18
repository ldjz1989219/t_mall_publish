package com.atguigu.crud.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.entity.User;
import com.atguigu.crud.mapper.UserDao;
import com.atguigu.crud.service.UserService;
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserDao userdao;
	public User checkLogin(String username, String password) {
		User user = userdao.getUserByName(username);
		if(user != null && user.getPassword().equals(password)){
			return user;
		}
		return null;
	}
	
}
