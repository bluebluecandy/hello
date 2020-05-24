package com.zd.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zd.dao.UsersDAO;
import com.zd.po.Users;

@Repository
public class UsersDAOImpl implements UsersDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Users> findAll() {
		return this.jdbcTemplate.query("select * from users u", new RowMapper<Users>(){
			public Users mapRow(ResultSet rs, int num) throws SQLException {
				Users users = new Users();
				users.setId(rs.getInt("id"));
				users.setUsername(rs.getString("username"));
				users.setPassword(rs.getString("password"));
				users.setEmail(rs.getString("email"));
				users.setAge(rs.getInt("age"));
				users.setHead(rs.getString("head"));
				return users;
			}
			
		});
	}

	public void save(Users users) {
		// TODO Auto-generated method stub
		String sql = "insert into users(username,password,email,age,head) values (?,?,?,?,?)";
		this.jdbcTemplate.update(sql, users.getUsername(),users.getPassword(),users.getEmail(),users.getAge(),users.getHead());
		
	}

}
