package com.niit.test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;
@ComponentScan("com.niit")
public class CategoryTest
{
	@SuppressWarnings("unused")
	@Autowired
	private static  Category  category;
	@Autowired
	private static  CategoryDao  categoryDao;
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit*");
		context.refresh();
		 category=(Category) context.getBean(" Category");
		 categoryDao=(CategoryDao) context.getBean(" CategoryDao");
	}
	@Test
	public void savecategory()
		{
		 Category category=new Category();
		 category.setId(1);
		 category.setCategoryName("MOBILES");
		 category.setCategoryDescription("Best mobile to use");
		assertTrue("problem in CategoryDao", categoryDao.saveCategory(category));
		}
	
}