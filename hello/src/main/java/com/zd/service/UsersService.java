package com.zd.service;

import java.util.List;

import com.zd.po.Users;

public interface UsersService {
	
	List<Users> findAll();
	
	void save(Users users);
}
