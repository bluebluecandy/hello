package com.zd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zd.dao.UsersDAO;
import com.zd.po.Users;
import com.zd.service.UsersService;

@Service
@Transactional(readOnly=true)
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersDAO usersDAO;
	
	public List<Users> findAll() {
		return this.usersDAO.findAll();
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void save(Users users) {
		// TODO Auto-generated method stub
		this.usersDAO.save(users);
	}
	
	
}
