package com.niit.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDao;
import com.niit.model.User;


@SuppressWarnings("unused")
public class UserDaoTest 
{
	static UserDao userDao;

	@BeforeClass
	public static void initialize() 
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.niit");
		annotationConfigApplicationContext.refresh();
		userDao=(UserDao) annotationConfigApplicationContext.getBean("userDao");
	}
	
	@Test
	public void saveTest()
	{
		User user=new User();
		user.setName("prithivi");
		user.setRole("None");
		user.setPassword("12345");
		user.setAddress("Chennai");
		assertTrue("problem in UserDao",userDao.save(user));
	}

}
