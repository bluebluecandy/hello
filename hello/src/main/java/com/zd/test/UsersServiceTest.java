package com.zd.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UsersServiceTest {
	
	@Before
	public void before(){
		System.out.println("UsersServiceTest.before()");
	}
	
	@Test
	public void testFindAll(){
		System.out.println("test");
	}
	
	@Test
	public void testFindAll1(){
		System.out.println("test1");
	}
	
	@Test
	public void testFindAll2(){
		System.out.println("test2");
	}
	
	@After
	public void after(){
		System.out.println("UsersServiceTest.after()");
	}

}
