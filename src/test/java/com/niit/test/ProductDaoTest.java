package com.niit.test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

@SuppressWarnings("unused")
public class ProductDaoTest 
{
	static ProductDao productDao;

	@BeforeClass
	public static void initialize()
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.niit");
		annotationConfigApplicationContext.refresh();
		productDao = (ProductDao) annotationConfigApplicationContext.getBean("productDao");
	}

	@Test
	public void addProductTest() 
	{
		Product p = new Product();
		p.setProductId(1);
		p.setProductname("Apple");
		p.setDescription("Apple’s legacy design is back for people who want compact and premium build without compromising on features list");
		p.setPrice(20000);
		p.setQuantity(5);
		p.setCategory_Id("2");
		p.setSupplier_Id("2");
		
	}
	@Ignore
	@Test
	public void saveOrUpdateTest() 
	{
		Product p = new Product();
		p.setProductId(1);
		p.setProductname("Apple iPhone SE");
		p.setDescription("Apple’s legacy design is back for people who want compact and premium build without compromising on features list");
		p.setPrice(20000);
		p.setQuantity(5);
		p.setCategory_Id("2");
		p.setSupplier_Id("2");

	}
	@Ignore
	@Test
	public void deleteTest()
	{
		Product p = new Product();
		p.setProductId(1);
		p.setProductname("Apple iPhone SE");
		p.setDescription("Apple’s legacy design is back for people who want compact and premium build without compromising on feature list");
		p.setPrice(20000);
		p.setQuantity(5);
		p.setCategory_Id("2");
		p.setSupplier_Id("2");
		
		
	}
}