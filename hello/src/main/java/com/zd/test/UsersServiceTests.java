package com.zd.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zd.po.Users;
import com.zd.service.UsersService;


/**
 * 进行Spring 框架测试
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:applicationContext-context.xml"
		}
)
public class UsersServiceTests {
	
	@Autowired
	private UsersService usersService;
	
	@Test
	public void test(){
		System.out.println(this.usersService);
		List<Users> users = this.usersService.findAll();
		System.out.println(users.size());
		
	}

}
