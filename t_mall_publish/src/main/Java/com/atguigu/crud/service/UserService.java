package com.atguigu.crud.service;

import com.atguigu.crud.entity.User;

public interface UserService {
	public User checkLogin(String username, String password);
}
