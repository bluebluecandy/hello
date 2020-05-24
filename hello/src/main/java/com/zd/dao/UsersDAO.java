package com.zd.dao;

import java.util.List;

import com.zd.po.Users;

public interface UsersDAO {
	
	List<Users> findAll();
	
	void save(Users users);

}
