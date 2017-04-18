package com.atguigu.crud.mapper;

import com.atguigu.crud.entity.User;

public interface UserDao {
	public User getUserByName(String username);
}
